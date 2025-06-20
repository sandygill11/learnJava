package constructorqa;

public class Parent {

	String surName;

	protected Parent() {
		System.out.println("super");
	}

	public Parent(String surName) {

		this.surName = surName;

		System.out.println("parent constructor");
	}

}
