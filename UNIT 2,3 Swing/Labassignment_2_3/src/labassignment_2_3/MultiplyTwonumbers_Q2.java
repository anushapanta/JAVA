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
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MultiplyTwonumbers_Q2 extends JFrame{
    public static void main(String[] args) {
        MultiplyTwonumbers_Q2 add=new MultiplyTwonumbers_Q2();
        add.setVisible(true);
    }
    public MultiplyTwonumbers_Q2(){
        setLayout(new FlowLayout());
        
         add(new JLabel("Enter first number:"));
         JTextField oneTextField=new JTextField(20);
         add(oneTextField);
         
         add(new JLabel("Enter second number:"));
         JTextField secondTextField=new JTextField(20);
         add(secondTextField);
         
         add(new JLabel("Multiply"));
         JTextField multiplyTextField=new JTextField(20);
         multiplyTextField.setEditable(false);
         add(multiplyTextField);
         
         JButton calculateButton=new JButton("Calculate Multiply");
         add(calculateButton);
         
         calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               double a=Double.parseDouble(oneTextField.getText());
               double b=Double.parseDouble(secondTextField.getText());
               double sum=a*b;
               multiplyTextField.setText(String.valueOf(sum));
            }
        });
         
         pack();
         setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

