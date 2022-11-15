package TimeTable;

import java.sql.*;

public class DatabaseConnection {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/TimeTable";
    static final String USER = "root";
    static final String PASS = "rootroot";
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    DatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException | ClassNotFoundException se) {
        }
    }

    public Connection conn() {
        return this.conn;
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
        }
    }

    public ResultSet executeQuery(String sql) {
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
        }
        return rs;
    }

    public void executeUpdate(String sql) {
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
        }
    }
}