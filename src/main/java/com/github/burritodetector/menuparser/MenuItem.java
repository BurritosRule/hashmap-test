package com.github.burritodetector.menuparser;

import java.math.BigDecimal;

public class MenuItem {
	private String menuItemName;
	private BigDecimal menuItemPrice;

	public MenuItem(String menuItemName, String menuItemPrice) {
		if (menuItemName != null && menuItemPrice != null) {
			this.menuItemName = menuItemName;
			this.menuItemPrice = new BigDecimal(menuItemPrice);
		} else {
			throw new IllegalArgumentException("Null value");
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
