package com.github.hashmaptest.run;

import java.io.IOException;
import java.util.Map.Entry;
import java.util.HashMap;

import com.github.hashmaptest.Person;
import com.github.javafaker.Faker;

public class Run {

	public static void main(String[] args) throws IOException {
//		Person person1 = new Person("Billy", 2);
//		Person person2 = new Person("Bob", 2);
//		Person person3 = new Person("Jimmy", 2);

//		people.put(hashmap1, 1);
//		people.put(hashmap2, 2);
//		people.put(hashmap3, 3);

//		System.out.print("\nEntries: ");
//		for (Entry<HashMapTest, Integer> entry : people.entrySet()) {
//			System.out.print(entry);
//			System.out.print(", ");
//		}
//		System.out.println();
//		
//		System.out.println(people.get(hashmap1));
//		System.out.println(people.get(hashmap2));
//		System.out.println(people.get(hashmap3));

		HashMap<Person, Integer> people = new HashMap<>();
		Faker faker = new Faker();

		String firstName;
		int age;

		for (int i = 0; i < 1000000; i++) {
			firstName = faker.name().firstName();
			age = faker.number().numberBetween(1, 99);
			people.put(new Person(firstName, age), i);
		}

//		System.out.println(people.get(???));

		System.out.print(people);

		for (Entry<Person, Integer> entry : people.entrySet()) {
			System.out.print(entry);
			System.out.print(", ");
		}

	}
}
