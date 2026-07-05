package IPL.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ImportPlayers{

    public static void importData() {

        String sql = "INSERT INTO players(team,name,bid,role) VALUES(?,?,?,?)";

        try (
            Connection con = JDBC.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\Shravani\\Downloads\\ipl_players.txt"))
        ) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                ps.setString(1, data[0].trim());
                ps.setString(2, data[1].trim());
                ps.setDouble(3, Double.parseDouble(data[2].trim()));
                ps.setString(4, data[3].trim());

                ps.addBatch();
            }

            ps.executeBatch();

            System.out.println("All players imported successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
