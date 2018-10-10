package MyFirstGame;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class StoryGame {

	public static void main(String[] args) {
		// run intro scenn
		intro();
	}
	
	// function intro sceen to the game 
	public static void intro() {
		ImageIcon goatIcon = new ImageIcon("C:/Users/jonas.andree/Desktop/goat.png");
		Image tempImage = goatIcon.getImage(); // transform it 
		Image newTempImage = tempImage.getScaledInstance(512, 512,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		goatIcon = new ImageIcon(newTempImage);  // transform it back
		
		JOptionPane.showMessageDialog(null, "Intro about a goat!", "Intro", -1, goatIcon);
		// diaplay text 
		// display picuter of a goat 
		// cont button run sceen 1 
		sceenOne();
	}
	
	// function sceen 1
	public static void sceenOne() {
		String[] options = new String[] { "Go to mountain.", "Stay", "End Game!" };

		ImageIcon goatIcon = new ImageIcon("C:/Users/jonas.andree/Desktop/goat.png");
		Image tempImage = goatIcon.getImage(); // transform it 
		Image newTempImage = tempImage.getScaledInstance(512, 512,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		goatIcon = new ImageIcon(newTempImage);  // transform it back
		
		// vi ska skapa en JOptionPane som ger oss tre val 
		int response = JOptionPane.showOptionDialog(null, "Story \n sceen 1", "Sceen1", 
				JOptionPane.DEFAULT_OPTION, -1, goatIcon, options, options[2]);
		
		if (options[response] == "Go to mountain.") {
			mountain();
		} else if (response == 1) {
			intro();
		} else if (response == 2) {
			System.out.println("ölasmdölasm");
		}
		
	
	}
	  	// text
		//em knapp som visar introt igen
		// 4 kanppar som remprecenterar vädersträck
	
	// function sceen 2
	public static void mountain() {
		
	}
	
	// function sceen 3
	
	
	// function sceen 4
	

}
