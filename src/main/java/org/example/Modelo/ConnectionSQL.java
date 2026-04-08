package org.example.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQL {

    private Connection connection;
    private static ConnectionSQL instancia;
    private String password = "root";
    private String url = "jdbc:mysql://localhost:3306/alumnos";
    private String username = "root";

    public ConnectionSQL() throws SQLException {
        this.connection = DriverManager.getConnection(url, username, password);
    }

    public static ConnectionSQL getInstancia() throws SQLException {

        if (instancia == null || instancia.connection.isClosed()) {
            instancia = new ConnectionSQL();
        }

        return instancia;

    }

    public Connection getConnection() {
        return connection;
    }
}
