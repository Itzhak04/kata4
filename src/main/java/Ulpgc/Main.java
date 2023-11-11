package Ulpgc;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        try(Connection connection = DriverManager.getConnection(urlOff("base_de_datos.db"))) {
            LoaderChampion loader = new SqliteLoaderChampion(connection);
            List<Champion> champions = loader.load();
            HashMap<String, Integer> chart = new HashMap<>();
            for (Champion champion : champions) {
                String clase = champion.getClase();
                chart.put(clase, chart.getOrDefault(clase, 0) + 1);
            }
            for (String key : chart.keySet()) {
                System.out.println(key + ": " + chart.get(key));
            }
        }



    }

    private static String urlOff(String filename) {
        return "jdbc:sqlite:"+filename;
    }


}
