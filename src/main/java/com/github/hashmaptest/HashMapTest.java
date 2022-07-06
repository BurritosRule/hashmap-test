package com.github.hashmaptest;

import lombok.EqualsAndHashCode;
import lombok.NonNull;

@EqualsAndHashCode
public class HashMapTest {

	private String name;

	private int age;

	public HashMapTest(@NonNull String name, int age) {
		
		this.name = name;
		this.age = age;

	}

	@Override
	public String toString() {
		return String.format("%s (age: %d)", name, age);
	}
}