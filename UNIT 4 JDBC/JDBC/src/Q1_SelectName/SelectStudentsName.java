/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1_SelectName;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class SelectStudentsName {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mariadb://localhost:3306/students";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = (Statement) connection.createStatement();
        String sql = "select * from studentdata where district='kathmandu' ";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            System.out.printf("%d %s %s \n",
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("district"),
                    rs.getInt("age"));
        }
          
        statement.close();
        connection.close();
    }
}
