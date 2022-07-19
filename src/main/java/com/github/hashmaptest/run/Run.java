package com.github.hashmaptest.run;

import java.io.IOException;
import java.util.Map.Entry;
import java.util.HashMap;

import com.github.hashmaptest.HashMapTest;

public class Run {

	public static void main(String[] args) throws IOException {
		HashMapTest hashmap1 = new HashMapTest("Billy", 2);
		HashMapTest hashmap2 = new HashMapTest("Bob", 2);
		HashMapTest hashmap3 = new HashMapTest("Jimmy", 2);

		HashMap<HashMapTest, Integer> people = new HashMap<>();
		people.put(hashmap1, 1);
		people.put(hashmap2, 2);
		people.put(hashmap3, 3);

		System.out.print("\nEntries: ");
		for (Entry<HashMapTest, Integer> entry : people.entrySet()) {
			System.out.print(entry);
			System.out.print(", ");
		}
		System.out.println();
		
		System.out.println(people.get(hashmap1));
		System.out.println(people.get(hashmap2));
		System.out.println(people.get(hashmap3));

	}
}
