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
import javax.swing.JDialog;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

/**
 *
 * @author user
 */
public class HelpMenu_Q12 extends JFrame {

    public static void main(String[] args) {
        HelpMenu_Q12 menu = new HelpMenu_Q12();
        menu.setVisible(true);
        menu.setSize(400, 400);
    }

    public HelpMenu_Q12() {
        setLayout(new FlowLayout());
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        JMenuItem aboutMenuItem = new JMenuItem("About App");
        helpMenu.add(aboutMenuItem);

        aboutMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JDialog dialog = new JDialog(HelpMenu_Q12.this, "About the App");
                dialog.setLayout(new FlowLayout());
                dialog.setBounds(100, 70, 500, 100);
                dialog.setVisible(true);
                JTextArea text = new JTextArea();
                text.setText("Name:Helping App\nVersion:1.0\nCopyright:This app content is subject to copyright.@2020");
                JButton close = new JButton("Close");
                dialog.add(text);
                dialog.add(close);

                close.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        dialog.dispose();
                    }
                });

            }
        }
        );

        pack();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
