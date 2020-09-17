/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassignment_2_3;

import java.util.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class Palindrome_Reverse_Vowels_Q4 extends JFrame {

    public static void main(String[] args) {
        Palindrome_Reverse_Vowels_Q4 app = new Palindrome_Reverse_Vowels_Q4();
        app.setVisible(true);
    }

    public Palindrome_Reverse_Vowels_Q4() {
        setLayout(new FlowLayout());
        add(new JLabel("Input The String :"));
        JTextField inputTextField = new JTextField(20);
        add(inputTextField);

        add(new JLabel("Result :"));
        JTextField resultTextField = new JTextField(20);
        resultTextField.setEditable(false);
        add(resultTextField);

        JButton palindrome = new JButton("Check Palindrome");
        add(palindrome);
        JButton reverse = new JButton("Check Reverse");
        add(reverse);
        JButton vowels = new JButton("Check Vowels");
        add(vowels);

        palindrome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputTextField.getText();
                int length = input.length();
                String reverse = "";
                for (int i = length - 1; i >= 0; i--) {
                    reverse = reverse + input.charAt(i);
                }
                if (input.equals(reverse)) {
                    resultTextField.setText("Entered string is a palindrome.");
                } else {
                    resultTextField.setText("Entered string isn't a palindrome.");
                }

            }

        });

        reverse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputTextField.getText();
                int length = input.length();
                String reverse = "";
                for (int i = length - 1; i >= 0; i--) {
                    reverse = reverse + input.charAt(i);
                }

                resultTextField.setText(reverse);

            }
        });

        vowels.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String string = inputTextField.getText();
                String input = string.toLowerCase();
                int length = input.length();
                String vowellist = "";
                char[] vowel = new char[length];
                for (int i = 0; i < length; i++) {
                    if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i'
                            || input.charAt(i) == 'o' || input.charAt(i) == 'u') {

                        vowel[i] = input.charAt(i);
                        vowellist = vowellist + String.valueOf(vowel[i]);
                    }
                        System.out.println(vowellist);
                }
                resultTextField.setText(vowellist);

            }
        });

        pack();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
