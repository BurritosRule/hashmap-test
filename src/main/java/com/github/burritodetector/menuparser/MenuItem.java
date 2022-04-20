package com.github.burritodetector.menuparser;

import java.math.BigDecimal;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import static java.util.Comparator.naturalOrder;

public class MenuItem {
	private String menuItemName;
	private BigDecimal menuItemPrice;

	public MenuItem(String menuItemName, BigDecimal menuItemPrice) {

		if (menuItemName == null) {
			throw new IllegalArgumentException("Error: menuItemName is null");
		}

		if (menuItemPrice == null) {
			throw new IllegalArgumentException("Error: menuItemPrice is null");
		}

		this.menuItemName = menuItemName;
		this.menuItemPrice = menuItemPrice;

	}

	public String getMenuItemName() {
		return menuItemName;
	}

	public BigDecimal getMenuItemPrice() {
		return menuItemPrice;
	}

	@Override
	public String toString() {
		return "Menu Item Name: " + this.getMenuItemName() + ", Menu Item Price: " + this.getMenuItemPrice();
	}
	
	public static final Comparator<MenuItem> NAME_COMPARATOR = comparing(MenuItem::getMenuItemName);
	public static final Comparator<MenuItem> PRICE_COMPARATOR = comparing(MenuItem::getMenuItemPrice);
}
