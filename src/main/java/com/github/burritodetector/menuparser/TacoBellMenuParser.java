package com.github.burritodetector.menuparser;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// import org.jsoup.Jsoup;
// import org.jsoup.nodes.Document;

public class TacoBellMenuParser implements MenuParser {
	// private static final String URL = "https://www.tacobell.com/food/new";

	public List<MenuItem> getMenuItems(String sortMethod) throws IOException {

		// Document tacoBell = Jsoup.connect(URL).get();
		// return tacoBell;

		MenuItem menuItem1 = new MenuItem("Taco", new BigDecimal("1.99"));
		MenuItem menuItem2 = new MenuItem("Enchilada", new BigDecimal("5.99"));
		MenuItem menuItem3 = new MenuItem("Burrito", new BigDecimal("3.99"));

		List<MenuItem> listOfMenuItems = new ArrayList<MenuItem>();
		listOfMenuItems.add(menuItem1);
		listOfMenuItems.add(menuItem2);
		listOfMenuItems.add(menuItem3);

		switch (sortMethod) {
		case "sortbyname":
			listOfMenuItems.sort(Comparator.comparing(MenuItem::getMenuItemName));
			break;
		case "sortbyprice":
			listOfMenuItems.sort(Comparator.comparing(MenuItem::getMenuItemPrice));
			break;
		case "default":
			break;
		default:
			throw new IllegalArgumentException("Error: Invalid sort option");
		}

		return listOfMenuItems;

	}
}