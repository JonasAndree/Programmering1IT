package lektion5.konstruktorer;
/**
 * 
 * @author jonas.andree
 *
 */
public class CarGame {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Creats a object of a car som vi ger f�rgen dark green
		Car jonasBil = new Car("dark green");
		
		// skriver ut och h�mtar bilens hanstighet
		System.out.println(jonasBil.getSpeed());
		
		// s�tter bilens hastighet 
		jonasBil.setSpeed(200);
		
		/*
		 *  hskriver ut och h�mtar bilens hastighet igen
		 *  wedfkviosdjp
		 *  edfpvpsd
		 *  sdfnmpvkmsdpfzmvpok
		 *  srdgfvmpsdvcpzsdfmpvm
		 *  edfvpompmsdfvp�
		 *  sdvmpmpksdfmp�sdvp�n
		 */
		System.out.println(jonasBil.getSpeed());
		
		
		
		
		
		
		

	}

}
