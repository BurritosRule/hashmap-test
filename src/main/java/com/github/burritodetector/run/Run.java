package com.github.burritodetector.run;

import java.io.IOException;
//import java.util.Collections;
//import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.burritodetector.menuparser.MenuItem;
import com.github.burritodetector.menuparser.MenuParser;
import com.github.burritodetector.menuparser.TacoBellMenuParser;

public class Run {
	private static final Logger LOGGER = LoggerFactory.getLogger(Run.class);

	public static void main(String[] args) throws IOException {
		MenuParser tacoBellMenu = new TacoBellMenuParser();

//		List<MenuItem> menu = tacoBellMenu.getMenuItems();

//		for (String arg : args) {
//			if (arg.equals("--sort") || arg.equals("-s")) {
		// The method sort(List<T>) in the type Collections is not applicable for the
		// arguments (List<MenuItem>)
		// Implement the employee class with a Comparable Interface or Comparator
		// Interface? https://www.theprogrammerguide.com/java/method-sort_list/
//				Collections.sort(tacoBellMenu.getMenuItems());
//			}
//		}

		StringBuilder menuStr = new StringBuilder();

		for (MenuItem menuItem : tacoBellMenu.getMenuItems()) {
			menuStr.append(menuItem + "\n");
		}

		System.out.println(menuStr);
		LOGGER.info(tacoBellMenu.getMenuItems().toString());

	}

}
