package Activity_41;

import Activity_31.Laptop;

import javax.print.DocFlavor;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class LaptopService {
    Connection connection;

    public LaptopService(Connection connection) {
        this.connection = connection;
    }

    public List<Counter> getCounterByMaker() {
        List<Counter> response = new ArrayList<>();
        try {
            String query = "SELECT maker, count(maker) AS quantity FROM laptop WHERE TRUE GROUP BY maker ORDER BY quantity;";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String maker = resultSet.getString("maker");
                Integer quantity = resultSet.getInt("quantity");
                Counter counter = new Counter(maker, quantity);
                response.add(counter);
            }
        } catch (Exception e) {
            System.out.println("ERROR" + e);
        }
        return response;
    }

    public List<Statistic> getStatisticByMaker1() {
        List<Statistic> response = new ArrayList<>();
        try {
            String query = "SELECT maker, SUM(sold) AS sold, SUM(sold*price) AS totalMoney FROM laptop WHERE TRUE GROUP BY maker ORDER BY totalMoney;";

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                String maker = rs.getString("maker");
                Integer sold = rs.getInt("sold");
                Float totalMoney = rs.getFloat("totalMoney");
                Statistic statistic = new Statistic(maker, sold, totalMoney);
                response.add(statistic);
            }
        } catch (Exception e) {
            System.out.println("ERROR" + e);
        }
        return response;
    }

    public List<Statistic> getStatisticByMaker2() {
        List<Statistic> response = new ArrayList<>();
        try {
            String query = "SELECT DISTINCT maker FROM laptop;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            List<String> makerList = new ArrayList<>();
            while (resultSet.next()) {
                String maker = resultSet.getString("maker");
                makerList.add(maker);
            }
            for (String maker : makerList) {
                String queryLaptop = "SELECT price, sold FROM laptop WHERE maker = '" + maker + "';";
                Statement statementLaptop = connection.createStatement();
                ResultSet resultSetLaptop = statementLaptop.executeQuery(queryLaptop);
                Float totalMoney = 0f;
                Integer quantity = 0;
                while (resultSetLaptop.next()){
                    Integer price = resultSetLaptop.getInt("price");
                    Integer sold = resultSetLaptop.getInt("sold");
                    totalMoney += price*sold;
                    quantity += sold;
                }
                Statistic statistic = new Statistic(maker, quantity, totalMoney);
                response.add(statistic);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return response;
    }

    public void insertLaptop(String name, String url, String maker, String type, String ram, String cpu, String ssd, String hdd, float price, String card, String screen_resolution, float screen_size, int sold){
        try{
            String query = "INSERT INTO laptop (`name`, `url`, `maker`, `type`, `ram`, `cpu`, `ssd`, `hdd`, `price`, `card`, `screen_resolution`, `screen_size`, `sold`) VALUES" +
                    "('" + name+ "', '" + url + "', '" + maker + "', '" + type + "', '" + ram + "', '" + cpu + "', '" + ssd + "', '" + hdd + "', " + price + ", '" + card + "', '" + screen_resolution + "', " + screen_size + ", " +sold + ");";
            Statement insertSt = connection.createStatement();
            Boolean rs = insertSt.execute(query);
            if (rs.equals(true)){
                System.out.println("Inserted record into table");
            }
            else {
                System.out.println("Error");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void updateLaptopSold(int idLaptop, int quantity){
        try{
            String qrUpdate = "UPDATE laptop SET sold = sold+" + quantity + " WHERE id = " +idLaptop+ ";";
            Statement  updateSt = connection.createStatement();
            int rs = updateSt.executeUpdate(qrUpdate);
                System.out.println("Updated record into tabel");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
