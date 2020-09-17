/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassignment_2_3;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;



/**
 *
 * @author user
 */
public class GridbaglayoutSimpleInterest_Q6_c extends JFrame {
    public static void main(String[] args) {
        GridbaglayoutSimpleInterest_Q6_c g = new GridbaglayoutSimpleInterest_Q6_c();      
        g.setVisible(true);
        
    }
    public GridbaglayoutSimpleInterest_Q6_c(){
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        
        
        c.gridx=1;
        c.gridy=0;
        add(new JLabel("Principal:"),c);
        JTextField pTextField = new JTextField(10);
        c.gridx=2;
        c.gridy=0;
        c.weightx=0.5;
        add(pTextField,c);

        c.gridx=1;
        c.gridy=1;
        add(new JLabel("Rate:"),c);
        JTextField rTextField = new JTextField(10);
        c.gridx=2;
        c.gridy=1;
        c.weightx=0.5;
        add(rTextField,c);

        c.gridx=1;
        c.gridy=2;
        add(new JLabel("Time:"),c);
        JTextField tTextField = new JTextField(10);
        c.gridx=2;
        c.gridy=2;
        c.weightx=0.5;
        add(tTextField,c);

        c.gridx=1;
        c.gridy=3;
        add(new JLabel("Interest:"),c);
        JTextField interestTextField = new JTextField(10);
        interestTextField.setEditable(false);
        c.gridx=2;
        c.gridy=3;
        c.weightx=0.5;
        add(interestTextField,c);

        JButton calculateButton = new JButton("Calculate");
        c.gridx=1;
        c.gridy=4;
        c.gridwidth=0;
        add(calculateButton,c);
        
        setPreferredSize(new Dimension(300,300));

        calculateButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double p = Double.parseDouble(pTextField.getText());
                    double r = Double.parseDouble(rTextField.getText());
                    double t = Double.parseDouble(tTextField.getText());
                    double interest = (p * t * r) / 100;
                    interestTextField.setText(String.valueOf(interest));
                } catch (NumberFormatException er) {   
                    System.out.println("Error:Enter integer,not string..");


                    

                }
            }

        });

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
  }
