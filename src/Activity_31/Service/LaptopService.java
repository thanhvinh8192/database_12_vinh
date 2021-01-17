package Activity_31.Service;

import Activity_31.Laptop;

import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LaptopService {
    Connection connection;

    public LaptopService(Connection connection) {
        this.connection = connection;
    }

    public List<Laptop> findLaptopByPrice(Float minPrice, Float maxPrice){
        List<Laptop> response = new ArrayList<>();
        try {
            String query = "SELECT * FROM laptop WHERE TRUE";
            if (minPrice!= null){
                query = query + " AND price>=" + minPrice;
            }
            if (maxPrice!= null){
                query = query + " AND price<=" + maxPrice;
            }
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString("name");
                String url = rs.getString("url");
                String maker = rs.getString("maker");
                String type = rs.getString("type");
                String ram = rs.getString("ram");
                String cpu = rs.getString("cpu");
                String ssd = rs.getString("ssd");
                String hdd = rs.getString("hdd");
                float price = rs.getFloat("price");
                String card = rs.getString("card");
                String screen_resolution = rs.getString("screen_resolution");
                float screen_size = rs.getFloat("screen_size");
                int sold = rs.getInt("sold");
                Timestamp created_timestamp = rs.getTimestamp("created_timestamp");
                Timestamp last_updated_timestamp = rs.getTimestamp("last_updated_timestamp");

                Laptop laptop = new Laptop(name, url, maker, type, ram, cpu, ssd, hdd, price, card, screen_resolution, screen_size, sold, created_timestamp, last_updated_timestamp);
                response.add(laptop);
            }
        }
        catch (Exception e){
            System.out.println("ERROR: " +e);
        }
        return response;
    }

    public List<Laptop> findLaptopByMaker(String brandName, boolean typeHardDisk){
        List<Laptop> response = new ArrayList<>();
        try {
            String query = "SELECT * FROM laptop WHERE TRUE";
            if (brandName!= null){
                query = query + " AND maker = '" + brandName + "'";
            }
            if (typeHardDisk){
                query = query + " AND ssd IS NOT NULL";
            }else {
                query = query + " AND hdd IS NOT NULL";
            }
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString("name");
                String url = rs.getString("url");
                String maker = rs.getString("maker");
                String type = rs.getString("type");
                String ram = rs.getString("ram");
                String cpu = rs.getString("cpu");
                String ssd = rs.getString("ssd");
                String hdd = rs.getString("hdd");
                float price = rs.getFloat("price");
                String card = rs.getString("card");
                String screen_resolution = rs.getString("screen_resolution");
                float screen_size = rs.getFloat("screen_size");
                int sold = rs.getInt("sold");
                Timestamp created_timestamp = rs.getTimestamp("created_timestamp");
                Timestamp last_updated_timestamp = rs.getTimestamp("last_updated_timestamp");

                Laptop laptop = new Laptop(name, url, maker, type, ram, cpu, ssd, hdd, price, card, screen_resolution, screen_size, sold, created_timestamp, last_updated_timestamp);
                response.add(laptop);
            }
        }
        catch (Exception e){
            System.out.println("ERROR: " +e);
        }
        return response;
    }
}
