package com.github.burritodetector.menus;

import com.github.burritodetector.menuparser.MenuParser;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class TacoBellMenuParser implements MenuParser {
	private static final String url = "https://www.tacobell.com/food/new";

	public Object getMenuItems() throws IOException {

		Document tacoBell = Jsoup.connect(url).get();
		return tacoBell;

	}
}