package com.github.hashmaptest.run;

import java.io.IOException;
import java.util.Map.Entry;
import java.util.HashMap;

import com.github.hashmaptest.HashMapTest;

public class Run {

	public static void main(String[] args) throws IOException {
		HashMapTest hashmap1 = new HashMapTest("Billy", 2);
		HashMapTest hashmap2 = new HashMapTest("Bob", 65);
		HashMapTest hashmap3 = new HashMapTest("Jimmy", 19);

		HashMap<Integer, HashMapTest> people = new HashMap<>();
		people.put(1, hashmap1);
		people.put(2, hashmap2);
		people.put(3, hashmap3);

		System.out.print("\nEntries: ");
		for (Entry<Integer, HashMapTest> entry : people.entrySet()) {
			System.out.print(entry);
			System.out.print(", ");
		}

	}
}
