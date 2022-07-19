package com.github.hashmaptest;

import lombok.EqualsAndHashCode;
import lombok.NonNull;

public class Person {

	private String name;

	private int age;

	public Person(@NonNull String name, int age) {
		
		this.name = name;
		this.age = age;

	}

	@Override
	public String toString() {
		return String.format("%s (age: %d)", name, age);
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
}