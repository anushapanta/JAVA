/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassignment_2_3;


import java.awt.BorderLayout;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author student
 */
public class NotepadUI_Q9 extends JFrame{
    public static void main(String[] args) {
        NotepadUI_Q9 notepad=new NotepadUI_Q9();
        notepad.setVisible(true);
        notepad.setSize(400,400);
    }
    
    public NotepadUI_Q9(){
        super("Notepad");
        setLayout(new BorderLayout());
        
        JMenuBar menuBar=new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);
        
        JMenu formatMenu = new JMenu("Format");
        menuBar.add(formatMenu);
        
        JMenu viewMenu = new JMenu("View");
        menuBar.add(viewMenu);
        
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);
        
        JMenuItem newMenuItem = new JMenuItem("New");
        fileMenu.add(newMenuItem);      
        JMenuItem openMenuItem = new JMenuItem("Open");
        fileMenu.add(openMenuItem);
        JMenuItem saveMenuItem = new JMenuItem("Save");
        fileMenu.add(saveMenuItem);
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);
        
        JMenuItem cutMenuItem = new JMenuItem("Cut");
        editMenu.add(cutMenuItem);
        JMenuItem copyMenuItem = new JMenuItem("Copy");
        editMenu.add(copyMenuItem);  
        JMenuItem pasteMenuItem = new JMenuItem("Paste");
        editMenu.add(pasteMenuItem);
        
        JCheckBoxMenuItem wordwrapitem = new JCheckBoxMenuItem("Word Wrap");
        formatMenu.add(wordwrapitem);
        wordwrapitem.setSelected(false);
        JMenuItem fontMenuItem = new JMenuItem("Font");
        formatMenu.add(fontMenuItem);
        
        JCheckBoxMenuItem viewitem = new JCheckBoxMenuItem("Status Bar");
        viewMenu.add(viewitem);
        wordwrapitem.setSelected(false);
        
        JMenuItem viewhelpMenuItem = new JMenuItem("View Help");
        helpMenu.add(viewhelpMenuItem);
        JMenuItem abouthelpMenuItem = new JMenuItem("About Notepad");
        helpMenu.add(abouthelpMenuItem);
        
        JTextArea textArea = new JTextArea(10,50);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);
        
        
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    
}

