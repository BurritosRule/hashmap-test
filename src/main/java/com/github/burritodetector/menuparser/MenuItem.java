package com.github.burritodetector.menuparser;

public class MenuItem {
	String menuItemName;
	Double menuItemPrice;

	public MenuItem(String menuItemName, Double menuItemPrice) {
		this.menuItemName = menuItemName;
		this.menuItemPrice = menuItemPrice;
	}

	public String getMenuItemName() {
		return menuItemName;
	}

	public Double getMenuItemPrice() {
		return menuItemPrice;
	}

	@Override
	public String toString() {
		return "Menu Item Name: " + this.getMenuItemName() + ", Menu Item Price: " + this.getMenuItemPrice();
	}

}
