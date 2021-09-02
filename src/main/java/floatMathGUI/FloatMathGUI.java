package floatMathGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FloatMathGUI {
    
	public static void main(String[] args) {
        JFrame frame = new JFrame("Float Math GUI");
        frame.setVisible(true);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        // define panel GUI components
        final JLabel labelX = new JLabel();
        final JLabel labelY = new JLabel();
        final JLabel output = new JLabel();
        final JTextField inputX = new JTextField(5);
        final JTextField inputY = new JTextField(5);
        final JButton button = new JButton("multiply");

        //initialize label texts
        labelX.setText("X");
        labelY.setText("Y");
        output.setText("NaN");
        
        // add all to panel
        panel.add(labelX);
        panel.add(inputX);
        panel.add(labelY);
        panel.add(inputY);
        panel.add(button);
        panel.add(output);

        button.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
            	float valueX = 0;
            	float valueY = 0;
            	boolean validInputs = true;
            	
            	try {
            		valueX = Float.parseFloat(inputX.getText());
            		valueY = Float.parseFloat(inputY.getText());
            	} catch (NumberFormatException ex) {
            		output.setText("Invalid input value(s)");
            		validInputs = false;
            	}
            	
            	if (validInputs) {
	            	//multiply
	            	float result = valueX * valueY;
	            	output.setText(Float.toString(result));           	
            	}
            }
        });
    }
}
