/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassignment_2_3;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class Tic_Tac_Toe_UI_Q10 extends JFrame {
    public static void main(String[] args) {
        Tic_Tac_Toe_UI_Q10 tictactoe=new Tic_Tac_Toe_UI_Q10();
        tictactoe.setVisible(true);
        tictactoe.setBounds(200,200,200,200);
    }
    public Tic_Tac_Toe_UI_Q10() {
        setLayout(new GridLayout(3,3));
        JButton[] JButtonArray = new JButton[9];
        setLayout(new GridLayout(3,3));

        for (int i=0; i<9; i++)
        {
            JButtonArray[i] = new JButton();
            add(JButtonArray[i]);
        }
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
}
