package com.github.burritodetector.menuparser;

import java.io.IOException;
import java.util.List;

public interface MenuParser {
	public List<MenuItem> getMenuItems(String sortMethod) throws IOException;
}