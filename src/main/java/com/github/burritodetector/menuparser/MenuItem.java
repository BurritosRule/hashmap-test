package com.github.burritodetector.menuparser;

import java.math.BigDecimal;

public class MenuItem {
	private String menuItemName;
	private BigDecimal menuItemPrice;

	public MenuItem(String menuItemName, BigDecimal menuItemPrice) {

		if (menuItemName == null) {
			throw new IllegalArgumentException("Error: menuItemName is null");
		} else if (menuItemPrice == null) {
			throw new IllegalArgumentException("Error: menuItemPrice is null");
		} else {
			this.menuItemName = menuItemName;
			this.menuItemPrice = menuItemPrice;
		}

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

}
