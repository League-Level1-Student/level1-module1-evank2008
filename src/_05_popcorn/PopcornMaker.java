package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Popcorn poppy = new Popcorn(JOptionPane.showInputDialog("What flavor of popcorn do you want?"));
	Microwave mike = new Microwave();
	mike.putInMicrowave(poppy);
	mike.setTime(Integer.parseInt(JOptionPane.showInputDialog("How many minutes do we cook it for?")));
	mike.startMicrowave();
}
}
