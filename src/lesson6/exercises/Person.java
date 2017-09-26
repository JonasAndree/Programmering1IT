package lesson6.exercises;

public class Person {

	private String name;

	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}
	
	public void writeName() {
		System.out.println("My name is " + name);
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
