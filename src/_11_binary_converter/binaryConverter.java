package _11_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryConverter implements ActionListener {
	JLabel label =  new JLabel();
		JTextField field = new JTextField(20);	JFrame frame = new JFrame();

public static void main(String[] args) {
	binaryConverter bc = new binaryConverter();
bc.run();

}
void run() {
	JPanel panel = new JPanel();
panel.add(label);
	frame.add(panel);
	panel.add(field);
	frame.setVisible(true);
	JButton button = new JButton();
	panel.add(button);
	button.addActionListener(this);
	button.setText("convert");
	frame.pack();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	label.setText(convert(field.getText()));
	frame.pack();
}
String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}
}
