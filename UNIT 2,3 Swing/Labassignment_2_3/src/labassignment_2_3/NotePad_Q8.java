/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassignment_2_3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author user
 */
public class NotePad_Q8 extends JFrame {

    public static void main(String[] args) {
        NotePad_Q8 note = new NotePad_Q8();
        note.setVisible(true);
        note.setSize(500, 500);

    }

    public NotePad_Q8() {
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();

        JButton newfilebutton = new JButton("New");
        panel.add(newfilebutton);

        JButton openbutton = new JButton("Open");
        panel.add(openbutton);

        JButton savebutton = new JButton("Save");
        panel.add(savebutton);

        JButton exitbutton = new JButton("Exit");
        panel.add(exitbutton);

        add(panel, BorderLayout.PAGE_START);
        panel.setSize(300, 100);

        JTextArea textArea = new JTextArea(10, 50);
        add(textArea);

        newfilebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                textArea.setText("");
            }

        });

        openbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                BufferedReader in = null;
                try {
                    in = new BufferedReader(new FileReader("source.txt"));
                    String line;
                    while (true) {
                        line = in.readLine();
                        if (line == null) {
                            break;
                        }
                        textArea.append(line);

                    }
                } catch (IOException ex) {
                    Logger.getLogger(NotePad_Q8.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

        savebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PrintWriter out = null;

                try {
                    String title = textArea.getText();
                    FileWriter fw = new FileWriter(new File("destination.txt"));
                    fw.write(title);
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(NotePad_Q8.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
        );

        exitbutton.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae
            ) {
                System.exit(0);
            }

        }
        );

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
