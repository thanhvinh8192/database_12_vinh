package Activity_41;

import Activity_31.Laptop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;
        try {
            String databaseUrl = "jdbc:mysql://localhost:3306/store_cms_plusplus?characterEncoding=utf8";
            String user = "root";
            String pass = "272253441";
            connection = DriverManager
                    .getConnection(databaseUrl, user, pass);
            System.out.println("SQL Connection to database established!");

            LaptopService laptopService = new LaptopService(connection);
            //List<Counter> result = laptopService.getCounterByMaker();
            //System.out.println(result);
            List<Statistic> rs1 = laptopService.getStatisticByMaker1();
            System.out.println(rs1);
            List<Statistic> rs = laptopService.getStatisticByMaker2();
            System.out.println(rs);
        }
        catch (Exception e) {
            System.out.println("Connection Failed! Check output console" + e);
            return;
        }

    }
}
