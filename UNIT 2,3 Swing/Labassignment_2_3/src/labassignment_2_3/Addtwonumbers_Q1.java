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


public class Addtwonumbers_Q1 extends JFrame{
    public static void main(String[] args) {
        Addtwonumbers_Q1 add=new Addtwonumbers_Q1();
        add.setVisible(true);
    }
    public Addtwonumbers_Q1(){
        setLayout(new FlowLayout());
        
         add(new JLabel("Enter first number:"));
         JTextField oneTextField=new JTextField(20);
         add(oneTextField);
         
         add(new JLabel("Enter second number:"));
         JTextField secondTextField=new JTextField(20);
         add(secondTextField);
         
         add(new JLabel("Sum"));
         JTextField sumTextField=new JTextField(20);
         sumTextField.setEditable(false);
         add(sumTextField);
         
         JButton calculateButton=new JButton("Calculate Sum");
         add(calculateButton);
         
         calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               double a=Double.parseDouble(oneTextField.getText());
               double b=Double.parseDouble(secondTextField.getText());
               double sum=a+b;
               sumTextField.setText(String.valueOf(sum));
            }
        });
         
         pack();
         setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
