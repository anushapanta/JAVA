/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2_SQLLstatement;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class SqlInsertDemo {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mariadb://localhost:3306/java";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = (Statement) connection.createStatement();
        String sql = "insert into contacts (name,address) " + "values('anu','dhading')";
        ResultSet rs = statement.executeQuery(sql);
        
        statement.close();
        connection.close();

    }

}

