/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassignment_2_3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author student
 */
public class FlSimpleInterest_Q3 extends JFrame {

    public static void main(String[] args) {
        FlSimpleInterest_Q3 flow = new FlSimpleInterest_Q3();
        flow.setVisible(true);
    }

    public FlSimpleInterest_Q3() {
        setLayout(new FlowLayout());

        add(new JLabel("Principal:"));
        JTextField pTextField = new JTextField(10);
        add(pTextField);

        add(new JLabel("Rate:"));
        JTextField rTextField = new JTextField(10);
        add(rTextField);

        add(new JLabel("Time:"));
        JTextField tTextField = new JTextField(10);
        add(tTextField);

        add(new JLabel("Interest:"));
        JTextField interestTextField = new JTextField(10);
        interestTextField.setEditable(false);
        add(interestTextField);

        JButton calculateButton = new JButton("Calculate");
        add(calculateButton);

        calculateButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                double p = Double.parseDouble(pTextField.getText());
                double r = Double.parseDouble(rTextField.getText());
                double t = Double.parseDouble(tTextField.getText());
                double interest = (p * t * r) / 100;
                interestTextField.setText(String.valueOf(interest));
                }
                catch(NumberFormatException er){
                    System.out.print("Enter number,not string");
                }
            }

        });
       
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
