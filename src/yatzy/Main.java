package yatzy;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		printBoard();
	}
	/**
	 * Print the game board!
	 */
	private static void printBoard() {
		ImageIcon icon = new ImageIcon("C:/Users/jonas.andree/Desktop/dice.png");
		JOptionPane.showMessageDialog(null, "Dice Message", "Dice Message Titel", -1, icon);
		
		JOptionPane.showMessageDialog(null, "message", "Board", -1);
		
		String name = JOptionPane.showInputDialog("Enter you name:");
		JOptionPane.showInputDialog("Min mamma", "Är snäll");
		JOptionPane.showInputDialog(null, "Dice", "Dice", -1, icon, null, null);
		JOptionPane.showMessageDialog(null, "So your name is " + name);
	}
}
