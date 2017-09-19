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
		// Creats a object of a car som vi ger färgen dark green
		Car jonasBil = new Car("dark green");
		
		// skriver ut och hämtar bilens hanstighet
		System.out.println(jonasBil.getSpeed());
		
		// sätter bilens hastighet 
		jonasBil.setSpeed(200);
		
		/*
		 *  hskriver ut och hämtar bilens hastighet igen
		 *  wedfkviosdjp
		 *  edfpvpsd
		 *  sdfnmpvkmsdpfzmvpok
		 *  srdgfvmpsdvcpzsdfmpvm
		 *  edfvpompmsdfvpö
		 *  sdvmpmpksdfmpåsdvpön
		 */
		System.out.println(jonasBil.getSpeed());
		
		
		
		
		
		
		

	}

}
