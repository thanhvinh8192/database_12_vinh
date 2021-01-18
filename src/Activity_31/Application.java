package Activity_31;

import Activity_31.Service.LaptopService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.LongAccumulator;

public class Application {
    public static void main(String[] args) {
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
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

            /*List<Laptop> laptops = laptopService.findLaptopByPrice(null, 30000000f);
            for (Laptop laptop :laptops) {
                System.out.println(laptop.toString());
            }*/

            while (true){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhap ten hang san xuat: ");
                String brandName = scanner.nextLine();
                //System.out.println();
                System.out.print("Nhap loai o cung (TRUE = ssd, FALSE = hdd): ");
                boolean type = scanner.nextBoolean();
                List<Laptop> laptops = laptopService.findLaptopByMaker(brandName, type);
                for (Laptop laptop :laptops) {
                    System.out.println(laptop.toString());
                }
            }

        }
        catch (Exception e) {
            System.out.println("Connection Failed! Check output console" + e);
            return;
        }

    }
}
