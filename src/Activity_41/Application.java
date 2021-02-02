package Activity_41;

import Activity_31.Laptop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Timestamp;
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
            /*List<Statistic> rs1 = laptopService.getStatisticByMaker1();
            System.out.println(rs1);
            List<Statistic> rs = laptopService.getStatisticByMaker2();
            System.out.println(rs);*/
            /*while (true){
                Scanner input = new Scanner(System.in);
                System.out.print("name: ");
                String name = input.nextLine();
                System.out.print("url: ");
                String url = input.nextLine();
                System.out.print("maker: ");
                String maker = input.nextLine();
                System.out.print("type: ");
                String type = input.nextLine();
                System.out.print("ram: ");
                String ram = input.nextLine();
                System.out.print("cpu: ");
                String cpu = input.nextLine();
                System.out.print("ssd: ");
                String ssd = input.nextLine();
                System.out.print("hdd: ");
                String hdd = input.nextLine();
                System.out.print("price: ");
                float price = input.nextFloat();input.nextLine();
                System.out.print("card: ");
                String card = input.nextLine();
                System.out.print("screen_resolution: ");
                String screen_resolution = input.nextLine();
                System.out.print("screen_size: ");
                float screen_size = input.nextFloat();
                System.out.print("sold: ");
                int sold = input.nextInt();
                laptopService.insertLaptop(name, url, maker, type, ram, cpu, ssd, hdd, price, card, screen_resolution, screen_size, sold);
            }*/
            laptopService.insertLaptop("HP Envy", "https://jp.ext.hp.com/notebooks/personal/envy_15_ep0000/", "HP", "Envy", "8GB", "Intel Core i9", "512GB", "", 30000000, "Not card", "Full HD", 15, 92);
        }
        catch (Exception e) {
            System.out.println("Connection Failed! Check output console" + e);
            return;
        }

    }
}
