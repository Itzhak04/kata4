package Ulpgc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SqliteLoaderChampion  implements LoaderChampion{
    private static final String SQL = "select * from nombre_de_la_tabla";
    private final Connection connection;

    public SqliteLoaderChampion(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Champion> load() {
        try {
            return load(queryAll());
        } catch (SQLException e) {
            return Collections.emptyList();
        }
    }

    private List<Champion> load(ResultSet resultSet) throws SQLException {
        List<Champion> result= new ArrayList<>();
        while (resultSet.next()){
            result.add(championFrom(resultSet));
        }
        return result;
    }

    private Champion championFrom(ResultSet resultSet) throws SQLException {
        return new Champion(
                resultSet.getString("N"),
                resultSet.getString("Name"),
                resultSet.getString("Clase"),
                resultSet.getString("Style"),
                resultSet.getString("Difficulty"),
                resultSet.getString("DamageType"),
                resultSet.getString("Damage"),
                resultSet.getString("Sturdiness"),
                resultSet.getString("CrowdControl"),
                resultSet.getString("Mobility"),
                resultSet.getString("Functionality")
        );
    }

    private ResultSet queryAll() throws SQLException {
        return connection.createStatement().executeQuery(SQL);
    }
}
