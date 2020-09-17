/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q6_SQL_Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q6_BalanceTransfer {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mariadb://localhost:3306/bank_transactions";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = (Statement) connection.createStatement();
        connection.setAutoCommit(false);

        Scanner in = new Scanner(System.in);

        System.out.println("**** Transfer Money  *****");
        System.out.println("Enter Semder's id: ");
        int senderId = in.nextInt();

        System.out.println("Enter Recipient's id: ");
        int recipientId = in.nextInt();

        System.out.println("Enter amount: ");
        int amount = in.nextInt();

        try {
            
            String sqlsenderupdate = String.format(
                    "update account_detail set Balance=Balance-'%d' where Id='%d'",
                    amount, senderId
            );
            
            String sqlreceiverupdate = String.format(
                    "update account_detail set Balance=Balance+'%d' where Id='%d'",
                    amount, recipientId
            );
            
            ResultSet senderupdate = statement.executeQuery(sqlsenderupdate);
            ResultSet receiverupdate = statement.executeQuery(sqlreceiverupdate);
            connection.commit();
            
            System.out.println("Amount: Rs " + amount +" has been successfully transferred from id: " + senderId+
                    " to Recipient's id: "+ recipientId);
            
        }
        catch(SQLException e){
            connection.rollback();
            System.out.println("Transfer Failed!!!Try Again.....");
        }

    }
}
