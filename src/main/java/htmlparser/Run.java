package htmlparser;

import java.io.IOException;

public class Run {

	public static void main(String[] args) throws IOException {
		ParseHtml.getElements("http://en.wikipedia.org/", "#mp-itn b a");

	}

}
