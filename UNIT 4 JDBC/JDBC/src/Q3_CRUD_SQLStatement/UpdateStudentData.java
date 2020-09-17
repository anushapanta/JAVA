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
public class UpdateStudentData {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mariadb://localhost:3306/students";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = (Statement) connection.createStatement();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ID number you want to update :");
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
        ResultSet rows = statement.executeQuery(sql);

        statement.close();
        connection.close();
    }

}
