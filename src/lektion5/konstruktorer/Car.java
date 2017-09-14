package lektion5.konstruktorer;

/**
 * My first class and we simulate a car
 * @author jonas.andree
 * 
 */
public class Car {
	private int numberOfDoors = 5;
	private int numberOfWheels = 4;
	private String color = "purple";
	private int antaletRattar = 2;
	private String carBrand = "Volvo";
	private int speed = 0;

	/**
	 * Konstruktor f�r Bil classen Setter f�rgen p� bilen vid skapande.
	 */
	public Car(String selectedColor) {
		color = selectedColor;
	}

	/**
	 * �ndrar hastigheten p� bilen.
	 * @param newSpeed - int - den nyahastigheten som car objectet skall f� 
	 */
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}
	/**
	 * 
	 * @return
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * 
	 * @param newColor
	 */
	public void setColor(String newColor) {
		color = newColor;
	}
	/**
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}
}
