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
public class SelectStudentData {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mariadb://localhost:3306/students";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = (Statement) connection.createStatement();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ID no you want to search for :");
        int Id = s.nextInt();
        String sql = String.format(
                "select * from  studentdata where id='%d '", Id
        );
        ResultSet rows = statement.executeQuery(sql);
        while (rows.next()) {
            System.out.printf("%d %s %s %d \n",
                    rows.getInt("id"),
                    rows.getString("name"),
                    rows.getString("district"),
                    rows.getInt("age"));
        }
        statement.close();
        connection.close();
    }

}
