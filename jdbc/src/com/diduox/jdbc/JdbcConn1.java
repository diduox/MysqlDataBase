package com.diduox.jdbc;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcConn1 {
    public static void main(String[] args) throws SQLException {
        Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/db02";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","");
        Connection connect = driver.connect(url, properties);
        String sql = "INSERT INTO actor VALUES(null,'王嘉然','女','1971-12-12','120')";
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);
        statement.close();
        connect.close();
    }
}
