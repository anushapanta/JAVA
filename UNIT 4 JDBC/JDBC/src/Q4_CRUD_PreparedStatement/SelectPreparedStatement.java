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
public class SelectPreparedStatement {

    public static void main(String[] args) throws SQLException {
//********************************************* Establishing Connection to the Database ************************************************
        String url = "jdbc:mariadb://localhost:3306/students";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, username, password);

// **************** If user want to select but he/she don't know what values are  inside database table ***********************************
        System.out.println("Do You want to see database table before making Selection Query??(Y/N):");
        Scanner in = new Scanner(System.in);
        char userChoice = in.next().charAt(0);

        if (userChoice == 'Y') {
            String sql = "select * from studentdata";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.printf("%d, %s, %s, %d, \n",
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("district"),
                        resultSet.getInt("age")
                );
            }
            statement.close();
        }

// **************** If user want to select but he/she don't know what values are  inside database table ***********************************
        if (userChoice == 'N') {
            System.out.println("ok..");
        }
            //************************** Taking user input *******************************
            System.out.println("Enter the Id to select from database:");
            int id = in.nextInt();

            //********************** Sql Prepared Statement************************************
            String sql = "select * from studentdata where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                System.out.printf("%d, %s, %s, %d \n",
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("district"),
                        resultSet.getInt("age")
                );
            }
            statement.close();
        

        connection.close();
    }
}
