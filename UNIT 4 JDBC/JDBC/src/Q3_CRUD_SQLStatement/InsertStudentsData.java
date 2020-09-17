//question ::Implement CRUD operation for student table.Ask for user input
//where applicable
package Q3_CRUD_SQLStatement;

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
public class InsertStudentsData {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mariadb://localhost:3306/students";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = (Statement) connection.createStatement();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Name:");
        String name=s.nextLine();
        System.out.println("Enter district:");
        String district=s.nextLine();
        System.out.println("Enter age:");
        int age=s.nextInt();
        String sql = String.format(
            "insert into studentdata (name, district,age) values ('%s', '%s','%d')", 
            name,
            district,age
        );
        int rowsInserted = statement.executeUpdate(sql);
        if(rowsInserted > 0)
            System.out.println("Insert successful");
        else 
            System.out.println("Insert failed");
        
          
        statement.close();
        connection.close();
    }
}
