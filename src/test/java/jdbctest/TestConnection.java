package jdbctest;

import java.sql.*;

public class TestConnection {
    public static void main(String[] args) throws SQLException {

        String dbUrl = "jdbc:oracle:thin:@ 34.227.173.52:1521:XE";
        String dbUserName = "hr";
        String dbPassword = "hr";


        Connection connection = DriverManager.getConnection("dbUrl,dbUserName,dbPassword");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");

////1. list the initials of all the employees
////2. list the full names of all employees ( fullname: Lastname FirstName)
////3. who has the logest name in the employees table?
////4. Show all employees who work in any one of these department id  90, 60, 100, 130, 120
////5. Show all employees who does not work in any one of these department id 90, 60,  100, 130, 120
/////6. divide employees into groups by using thier job id
///6.1 display the maximum salaries in each groups
////6.2 display the minium salaries in each groups
////6.3 display the average salary of each group
////6.4 how many employees are there in each group that have minimum salary of 5000 ?
////6.5 display the total budgests of each groups
////7. display employees' full email addresses and full names
////(assume that the domain of the email is @gmail)
////8. display full addresses from locations table in a single column
////(full address: Street_Addtess,  CityName  ZipCode,  Country_id)
        resultSet.close();
        statement.close();
        connection.close();

    }
}
