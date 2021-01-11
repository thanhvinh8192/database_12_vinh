package Activity_21;

import java.sql.*;

public class Application {
    public static void main(String[] args) {
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;
        try {
            String databaseUrl = "jdbc:mysql://localhost:3306/student_cms_plusplus?characterEncoding=utf8";
            String user = "root";
            String pass = "272253441";
            connection = DriverManager
                    .getConnection(databaseUrl, user, pass);
            System.out.println("SQL Connection to database established!");

            //Querry DB
            Statement statement = connection.createStatement();
            String query ="SELECT * FROM student_cms_plusplus.student;";

            statement.execute(query);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String mssv = resultSet.getString("mssv");
                String password = resultSet.getString("password");
                String phone = resultSet.getString("phone");
                String address = resultSet.getString("address");
                short age = resultSet.getShort("age");
                String email = resultSet.getString("email");
                Timestamp create_timestamp = resultSet.getTimestamp("create_timestamp");
                Timestamp last_update_timestamp = resultSet.getTimestamp("last_update_timestamp");
                System.out.println("id: " + id +
                        "   name: " + name +
                        "   mssv: " + mssv +
                        "   password: " + password +
                        "   phone: " + phone +
                        "   address: " + address +
                        "   age: " + age +
                        "   email: " + email +
                        "   create_timestamp: " + create_timestamp +
                        "   last_update_timestamp: " + last_update_timestamp );

            }
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console"  + e);
            return;
        }
    }
}

