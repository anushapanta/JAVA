/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassignment_2_3;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class BorderLayout_Q5 extends JFrame {
    public static void main(String[] args) {
        BorderLayout_Q5 border=new BorderLayout_Q5();
        border.setVisible(true);
    }
    public BorderLayout_Q5(){
        setLayout(new BorderLayout());
        add(new JButton("I am North."),BorderLayout.NORTH);
        add(new JButton("I am West."),BorderLayout.WEST);
        add(new JButton("I am Center."),BorderLayout.CENTER);
        add(new JButton("I am East."),BorderLayout.EAST);
        add(new JButton("I am South."),BorderLayout.SOUTH);
        
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}
