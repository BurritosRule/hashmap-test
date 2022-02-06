package com.github.burritodetector.run;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.burritodetector.menuparser.MenuParser;
import com.github.burritodetector.menuparser.TacoBellMenuParser;

public class Run {
	private static final Logger LOGGER = LoggerFactory.getLogger(Run.class);

	public static void main(String[] args) throws IOException {
		MenuParser tacoBellMenu = new TacoBellMenuParser();

		LOGGER.info(tacoBellMenu.getMenuItems().toString());
	}

}
