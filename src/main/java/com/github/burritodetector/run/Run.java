package com.github.burritodetector.run;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.burritodetector.menuparser.MenuParser;
import com.github.burritodetector.menuparser.TacoBellMenuParser;

public class Run {
	private static final Logger LOGGER = LoggerFactory.getLogger(Run.class);

	public static void main(String[] args) throws IOException {
		MenuParser tacoBellMenu = new TacoBellMenuParser();

		StringBuilder str = new StringBuilder();

		// Getting error "Can only iterate over an array or an instance of
		// java.lang.Iterable"
		// tacoBellMenu is an object... do I need to convert it to a list?
		for (MenuParser menuItem : tacoBellMenu) {
			// code block to be executed
		}

		LOGGER.info(tacoBellMenu.getMenuItems().toString());

	}

}
