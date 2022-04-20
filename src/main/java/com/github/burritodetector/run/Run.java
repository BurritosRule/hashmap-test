package com.github.burritodetector.run;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.burritodetector.menuparser.MenuItem;
import com.github.burritodetector.menuparser.MenuParser;
import com.github.burritodetector.menuparser.TacoBellMenuParser;

public class Run {
	private static final Logger LOGGER = LoggerFactory.getLogger(Run.class);
	
	enum Sort {
		  NAME,
		  PRICE,
		  DEFAULT
		}

	public static void main(String[] args) throws IOException {
		MenuParser tacoBellMenu = new TacoBellMenuParser();
	
		Sort sortMethod = Sort.DEFAULT;
		for (String arg : args) {
			if (arg.equals("--sort-by-name") || arg.equals("-sn")) {
				sortMethod = Sort.NAME;
			}

			if (arg.equals("--sort-by-price") || arg.equals("-sp")) {
				sortMethod = Sort.PRICE;
			}
		}

		List<MenuItem> menu = tacoBellMenu.getMenuItems();
		
		switch (sortMethod) {
		case NAME:
			menu.sort(MenuItem.NAME_COMPARATOR);
			break;
		case PRICE:
			menu.sort(MenuItem.PRICE_COMPARATOR);
			break;
		case DEFAULT:
			break;
		default:
			throw new IllegalArgumentException("Error: Invalid sort option");
		}

		StringBuilder menuStr = new StringBuilder();
		Map<String, Object> map = new HashMap<>();
		
		for (MenuItem menuItem : menu) {
			menuStr.append(menuItem).append("\n");
			map.put("name", menuItem.getMenuItemName());
			map.put("price", menuItem.getMenuItemPrice());
		}

		System.out.println(menuStr);
		LOGGER.info(tacoBellMenu.getMenuItems().toString());
		
	    ObjectMapper mapper = new ObjectMapper();

	    mapper.writeValue(Paths.get("menu.json").toFile(), map);

	}

}
