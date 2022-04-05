package com.github.burritodetector.run;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.burritodetector.menuparser.MenuItem;
import com.github.burritodetector.menuparser.MenuParser;
import com.github.burritodetector.menuparser.TacoBellMenuParser;

public class Run {
	private static final Logger LOGGER = LoggerFactory.getLogger(Run.class);

	public static void main(String[] args) throws IOException {
		MenuParser tacoBellMenu = new TacoBellMenuParser();

		String sortMethod = "default";
		for (String arg : args) {
			if (arg.equals("--sortbyname") || arg.equals("-sn")) {
				sortMethod = "sortbyname";
			}

			if (arg.equals("--sortbyprice") || arg.equals("-sp")) {
				sortMethod = "sortbyprice";
			}
		}

//      Not currently using this
//		List<MenuItem> menu = tacoBellMenu.getMenuItems(sortMethod);

		StringBuilder menuStr = new StringBuilder();

		for (MenuItem menuItem : tacoBellMenu.getMenuItems(sortMethod)) {
			menuStr.append(menuItem).append("\n");
		}

		System.out.println(menuStr);
		LOGGER.info(tacoBellMenu.getMenuItems(sortMethod).toString());

	}

}
