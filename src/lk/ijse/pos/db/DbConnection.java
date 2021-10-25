package lk.ijse.pos.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static DbConnection dbConnection;
    private final Connection connection;

    private DbConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3305/supermarket",
                "root",
                "19980611");
    }

    public static DbConnection getDbConnection() throws SQLException, ClassNotFoundException {
        return dbConnection == null? dbConnection = new DbConnection() : dbConnection;
    }

    public Connection getConnection(){
        return connection;
    }


}
