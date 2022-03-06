package com.github.burritodetector.menuparser;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

// import org.jsoup.Jsoup;
// import org.jsoup.nodes.Document;

public class TacoBellMenuParser implements MenuParser {
	// private static final String URL = "https://www.tacobell.com/food/new";

	public List<MenuItem> getMenuItems() throws IOException {

		// Document tacoBell = Jsoup.connect(URL).get();
		// return tacoBell;

		BigDecimal menuItem1Price = new BigDecimal("1.99");
		BigDecimal menuItem2Price = new BigDecimal("3.99");

		MenuItem menuItem1 = new MenuItem("Taco", menuItem1Price);
		MenuItem menuItem2 = new MenuItem("Burrito", menuItem2Price);

		List<MenuItem> listOfMenuItems = new ArrayList<MenuItem>();
		listOfMenuItems.add(menuItem1);
		listOfMenuItems.add(menuItem2);
		return listOfMenuItems;

	}
}