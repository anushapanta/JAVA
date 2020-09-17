/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4_CRUD_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class UpdatePreparedStatement {

    public static void main(String[] args) throws SQLException {
//********************************************* Establishing Connection to the Database ************************************************
        String url = "jdbc:mariadb://localhost:3306/students";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, username, password);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Id no you want to update ::");
        int id = s.nextInt();
        System.out.println("Enter Name:");
        String name = s.next();
        System.out.println("Enter district:");
        String district = s.next();
        System.out.println("Enter age:");
        int age = s.nextInt();
        String sql = String.format(
                "update studentdata set name='%s',district='%s',"
                + "age='%d' where id = '%d' ", name, district, age, id
        );

        //********************** Sql Prepared Statement************************************
        PreparedStatement statement = connection.prepareStatement(sql);

        int resultSet = statement.executeUpdate();

        if (resultSet > 0) {
            System.out.println("Update Successfull");
        } else {
            System.out.println("Update Failed (May be the id donot exist)");
        }
        statement.close();

        connection.close();
    }
}
