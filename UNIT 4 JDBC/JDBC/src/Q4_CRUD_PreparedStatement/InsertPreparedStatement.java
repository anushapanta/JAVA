/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4_CRUD_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class InsertPreparedStatement {

    public static void main(String[] args) throws SQLException {
//********************************************* Establishing Connection to the Database ************************************************
        String url = "jdbc:mariadb://localhost:3306/students";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, username, password);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = s.nextLine();
        System.out.println("Enter district:");
        String district = s.nextLine();
        System.out.println("Enter age:");
        int age = s.nextInt();
        String sql = String.format(
                "insert into studentdata (name, district,age) values ('%s', '%s','%d')",
                name,
                district, age
        );

        //********************** Sql Prepared Statement************************************
        PreparedStatement statement = connection.prepareStatement(sql);

        int resultSet = statement.executeUpdate();

        if (resultSet > 0) {
            System.out.println("Insert Successfull");
        } else {
            System.out.println("Insertion Failed");
        }
        statement.close();

        connection.close();
    }

}
