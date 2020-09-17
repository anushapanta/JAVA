/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassignment_2_3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author user
 */
public class StudentsRecordForm_Q13 extends JFrame {

    public static void main(String[] args) {
        StudentsRecordForm_Q13 record = new StudentsRecordForm_Q13();
        record.setVisible(true);
        record.setTitle("Student Record Form");
        record.setSize(500, 400);
    }
    JTextField firstname, lastname, age;
    JRadioButton maleRadiobutton, femaleRadiobutton;
    JComboBox cb, sem;
    JTextArea remarks;
    ButtonGroup group;

    public StudentsRecordForm_Q13() {
        setLayout(new GridLayout(10, 2));
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem resetMenuItem = new JMenuItem("Reset");
        fileMenu.add(resetMenuItem);
        JMenuItem saveMenuItem = new JMenuItem("Save");
        fileMenu.add(saveMenuItem);
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);

        add(new JLabel("First Name"));
        firstname = new JTextField(25);
        add(firstname);

        add(new JLabel("Last Name"));
        lastname = new JTextField(25);
        add(lastname);

        add(new JLabel("Age"));
        age = new JTextField(25);
        add(age);

        add(new JLabel("Faculty"));
        String faculty[] = {"BScCSIT", "BIT", "BCA", "BBS", "BSW", "BBM"};
        cb = new JComboBox(faculty);
        add(cb);

        add(new JLabel("Semester"));
        String semester[] = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth"};
        sem = new JComboBox(semester);
        sem.setBounds(50, 50, 90, 20);
        add(sem);

        add(new JLabel("Remarks"));
        remarks = new JTextArea(50, 50);
        add(remarks);

        add(new JLabel("\nGender"));
        group = new ButtonGroup();
        femaleRadiobutton = new JRadioButton("Female");
        add(femaleRadiobutton);
        add(new JLabel("\nGender"));
        group.add(femaleRadiobutton);
        maleRadiobutton = new JRadioButton("Male");
        add(maleRadiobutton);
        group.add(maleRadiobutton);

        JToolBar toolBar = new JToolBar();
        add(toolBar);

        JButton saveButton = new JButton("SAVE");
        toolBar.add(saveButton);
        toolBar.addSeparator();
        toolBar.addSeparator();
        JButton resetButton = new JButton("RESET FORM");
        toolBar.add(resetButton);
        toolBar.addSeparator();
        toolBar.addSeparator();
        JButton exitButton = new JButton("EXIT");
        toolBar.add(exitButton);

        saveMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String[] text = getFieldValue();
                try {
                    saveFormData(text);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        resetMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                resetMethods();
            }
        });
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String[] text = getFieldValue();
                try {
                    saveFormData(text);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                resetMethods();

            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

//********************** Methods for Reset and Save ********************************************************************************
    private void resetMethods() {
        firstname.setText("");
        lastname.setText("");
        age.setText("");
        group.clearSelection();
        cb.setSelectedIndex(0);
        sem.setSelectedIndex(0);
        remarks.setText("");
    }

    private String[] getFieldValue() {
        maleRadiobutton.setActionCommand("Male");
        femaleRadiobutton.setActionCommand("Female");

        String[] text = {
            firstname.getText(),
            lastname.getText(),
            age.getText(),
            group.getSelection().getActionCommand(),
            (String) cb.getSelectedItem(),
            (String) sem.getSelectedItem(),
            remarks.getText()
        };
        return text;
    }

    @SuppressWarnings("empty-statement")
    private void saveFormData(String[] text) throws IOException {
        String userDir = System.getProperty("user.home");
        JFileChooser chooser = new JFileChooser(userDir + "/Desktop");

        chooser.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));
        chooser.setSelectedFile(new File(".txt"));
        int result = chooser.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try (PrintWriter out = new PrintWriter(file)) {
                String[] data = {"FirstName", "LastName", "Age", "Gender",
                     "Faculty", "Semester", "Remarks"};

                out.println("Student Record of" + " " + text[0] + "..!!!!\n");
                for (int i = 0; i < text.length; i++) {

                    out.print(data[i] + "=" + text[i] + "\n");

                }
            }
        } else {
            return;
        }

    }

}
