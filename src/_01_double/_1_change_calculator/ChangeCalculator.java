package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {
String input=JOptionPane.showInputDialog("How many nickels do you have?");
int convert = Integer.parseInt(input);
String input1=JOptionPane.showInputDialog("How many dimes do you have?");
int convert1 = Integer.parseInt(input1);
String input2 = JOptionPane.showInputDialog("How many quarters do you have?");
int convert2 = Integer.parseInt(input2);
double convert3 = convert*0.05+convert1*0.1+convert2*0.25;

JOptionPane.showMessageDialog(null, "Your total is "+ convert3);
		// Ask the user how many nickels they have

		// Convert their answer to an int.   Hint: Integer.parseInt()  

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

