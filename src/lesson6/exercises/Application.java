package lesson6.exercises;

public class Application {

	public static void main(String[] args) {
		System.out.println("Hello World");
		// Vi har skapat ett object av klassen Person
		Person jonasPerson = new Person("Jonas the GOD of all students!");
		jonasPerson.writeName();
		
		jonasPerson.setName("Moe");
		jonasPerson.writeName();
		
	}

}
