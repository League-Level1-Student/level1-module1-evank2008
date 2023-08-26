package _07_duck;

import javax.swing.JOptionPane;

public class duckRunner {
public static void main(String[] args) {
	duck duc = new duck(JOptionPane.showInputDialog("What is duck's favorite food?"),Integer.parseInt(JOptionPane.showInputDialog("How many friends does duck have?")));
	duc.quack();
	duc.waddle();
}
}
