/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassignment_2_3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author student
 */
public class LoginForm_Q7 extends JFrame {
    public static void main(String[] args) {
        LoginForm_Q7 login = new LoginForm_Q7();
        login.setVisible(true);
    }
    public LoginForm_Q7(){
        setLayout(new FlowLayout());
       
        add(new JLabel("Username"));
        JTextField userTextField = new JTextField(20);
        add(userTextField);
       
        add(new JLabel("Password"));
        JPasswordField pwdTextField = new JPasswordField(20);
        add(pwdTextField);
       
        JButton loginbutton = new JButton("Login");
        add(loginbutton);
       
        pack();
       
        loginbutton.addActionListener(new ActionListener(){
            @Override

            public void actionPerformed(ActionEvent e) {
                String username = userTextField.getText();
                char[] password = pwdTextField.getPassword();
                char[] actualPassword = {'a','d','m','i','n'};
                if(username.equals("admin") && Arrays.equals(password,actualPassword)){
                    System.out.println("Access Granted....");    
                }
                else{
                    System.out.println("Access Denied....");
                }
            }
        });
       
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
    }
   
}

