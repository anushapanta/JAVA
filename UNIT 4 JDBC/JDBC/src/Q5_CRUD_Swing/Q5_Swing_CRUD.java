/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q5_CRUD_Swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class Q5_Swing_CRUD extends JFrame {

    public static void main(String[] args) throws SQLException, NullPointerException {
        Q5_Swing_CRUD crud = new Q5_Swing_CRUD();
        crud.setVisible(true);
        crud.setSize(370, 150);
    }
    int rows;
    Object[][] cells;
    JTable table;
    ResultSet result;
    Statement statement;
    Connection connection;
    JDialog dialogbox;

    public Q5_Swing_CRUD() throws SQLException {

        super("Database Operation");
        setLayout(new FlowLayout());
        dialogbox = new JDialog(Q5_Swing_CRUD.this, "Database");
        dialogbox.setLayout(new FlowLayout());
        dialogbox.setBounds(100, 70, 500, 100);

        JLabel label = new JLabel("Which database operation do you want to perform?");
        add(label);
        JButton selectButton = new JButton("SELECT");
        add(selectButton);
        JButton insertButton = new JButton("INSERT");
        add(insertButton);
        JButton updateButton = new JButton("UPDATE");
        add(updateButton);
        JButton deleteButton = new JButton("DELETE");
        add(deleteButton);

        try {
            String url = "jdbc:mariadb://localhost:3306/students";
            String username = "root";
            String password = "";
            connection = DriverManager.getConnection(url, username, password);
            statement = (Statement) connection.createStatement();
        } catch (SQLException e) {
            System.out.println("Error is" + e);
        }

        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    result = statement.executeQuery("select * from studentdata");
                    result.last();
                    rows = result.getRow();
                    result.first();
                } catch (SQLException e) {
                    System.out.println("Error is" + e);
                }
                cells = new Object[rows][4];
                try {
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < 4; j++) {
                            cells[i][j] = result.getString(j + 1);
                        }
                        result.next();
                    }
                } catch (SQLException e) {
                    System.out.println("Error is" + e);
                }
                JFrame frame = new JFrame("Selected Database Details!!");
                frame.setVisible(true);
                frame.setSize(500, 300);
                String[] columnNames = {"ID", "Name", "District", "Age"};
                table = new JTable(cells, columnNames);
                frame.getContentPane().add(new JScrollPane(table));

            }
        });

        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JFrame frame = new JFrame("Insert Into Database!!");
                frame.setVisible(true);
                frame.setSize(500, 200);
                frame.setLayout(new GridLayout(4, 2));

                frame.add(new JLabel("Name"));
                JTextField nameField = new JTextField(20);
                frame.add(nameField);

                frame.add(new JLabel("District"));
                JTextField districtField = new JTextField(20);
                frame.add(districtField);

                frame.add(new JLabel("Age"));
                JTextField ageField = new JTextField(20);
                frame.add(ageField);

                JButton insert = new JButton("Insert Into Database");
                frame.add(insert);

                insert.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        try {

                            String name = nameField.getText();
                            int age = Integer.parseInt(ageField.getText());
                            String district = districtField.getText();

                            String sql = String.format(
                                    "insert into studentdata (name, district,age) values ('%s', '%s','%d')",
                                    name,
                                    district, age
                            );
                            int rowsInserted = statement.executeUpdate(sql);
                            if (rowsInserted > 0) {

                                JTextArea text = new JTextArea();
                                text.setText("Insert Succesfull");
                                dialogbox.add(text);
                                dialogbox.setVisible(true);

                            } else {
                                JTextArea text = new JTextArea();
                                text.setText("Insert Failed");
                                dialogbox.add(text);
                                dialogbox.setVisible(true);
                            }

                            statement.close();
                            connection.close();
                        } catch (SQLException ex) {
                            System.out.println("Error is" + ex);
                        }
                    }

                }
                );
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JFrame frame = new JFrame("Delete From Database!!");
                frame.setVisible(true);
                frame.setSize(500, 200);
                frame.setLayout(new GridLayout(4, 2));

                frame.add(new JLabel("ID"));
                JTextField idField = new JTextField(20);
                frame.add(idField);

                JButton delete = new JButton("Delete From Database");
                frame.add(delete);

                delete.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        try {

                            int id = Integer.parseInt(idField.getText());

                            String sql = String.format(
                                    "delete from studentdata where id='%d'", id
                            );
                            int rowsDeleted = statement.executeUpdate(sql);
                            if (rowsDeleted > 0) {

                                JTextArea text = new JTextArea();
                                text.setText("Delete Succesfull");
                                dialogbox.add(text);
                                dialogbox.setVisible(true);

                            } else {
                                JTextArea text = new JTextArea();
                                text.setText("Delete Failed");
                                dialogbox.add(text);
                                dialogbox.setVisible(true);
                            }

                            statement.close();
                            connection.close();
                        } catch (SQLException ex) {
                            System.out.println("Error is" + ex);
                        }
                    }

                }
                );
            }
        });
        
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JFrame frame = new JFrame("Update Into Database!!");
                frame.setVisible(true);
                frame.setSize(500, 200);
                frame.setLayout(new GridLayout(5, 2));
                
                frame.add(new JLabel("Id"));
                JTextField idField = new JTextField(20);
                frame.add(idField);

                frame.add(new JLabel("Name"));
                JTextField nameField = new JTextField(20);
                frame.add(nameField);

                frame.add(new JLabel("District"));
                JTextField districtField = new JTextField(20);
                frame.add(districtField);

                frame.add(new JLabel("Age"));
                JTextField ageField = new JTextField(20);
                frame.add(ageField);

                JButton update = new JButton("Update Into Database");
                frame.add(update);

                update.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        try {
                            int id = Integer.parseInt(idField.getText());

                            String name = nameField.getText();
                            int age = Integer.parseInt(ageField.getText());
                            String district = districtField.getText();

                            String sql = String.format(
                                    "update studentdata set name='%s',district='%s',age='%d' where id='%d'",
                                    name,
                                    district, age,id
                            );
                            ResultSet rs = statement.executeQuery(sql);


                            statement.close();
                            connection.close();
                        } catch (SQLException ex) {
                            System.out.println("Error is" + ex);
                        }
                    }

                }
                );
            }
        });


        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
