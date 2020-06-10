package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Test_Scores {

	public static void main(String[] args) {
		String input=       JOptionPane.showInputDialog("What is your test score?");
		double convert=Double.parseDouble(input);
		if (convert>=90) {
			JOptionPane.showMessageDialog(null, "DO BETTER GET score 10000 do YOUR EXTRA CREDIT!!!!!");
		}
		if(convert>=80&&convert<=89) {
			JOptionPane.showMessageDialog(null, "FROM NOW ON YOU WILL ONLY DATE YOUR HOMEWORK!!!! NO VIDEO GAMES!!!!");
				}
		
if(convert>=70&&convert<=79) {
	JOptionPane.showMessageDialog(null,"JEEZ You are CRAZY!!!! YOU NEED TO GO TO SUMMER SCHOOL!!!! I WILL NEVER HAVE BILL GATES AS A SON NOW!");
}
if(convert>=60&&convert<=69) {
	JOptionPane.showMessageDialog(null, "Do YOU want TO DIEEEEEEEE?????");
}
if(convert<=59) {
	JOptionPane.showMessageDialog(null, "Congradulations! You died.");
}
	}

}
