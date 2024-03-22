/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config.java;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author tuann
 */
public class MyConnect {

    String hostName = "localhost";
    String user = "root";
    String pass = "";
    String dbName = "project_j";
    String url = "jdbc:mysql://" + hostName + "/" + dbName + "?user=" + user + "&password=" + pass;
    Connection conn = null;

    public MyConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        try {
            if (conn == null) {
                DriverManager.getConnection(url);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
