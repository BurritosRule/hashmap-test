package htmlparser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class ParseHtml {

	public static void getElements(String url, String elementId) throws IOException {
		Document doc = Jsoup.connect(url).get();
		log(doc.title());

		Elements selectedElements = doc.select(elementId);
		for (Element selectedElement : selectedElements) {
			log("%s\n\t%s", selectedElement.attr("title"), selectedElement.absUrl("href"));
		}
	}

	private static void log(String msg, String... vals) {
		System.out.println(String.format(msg, vals));
	}

}
