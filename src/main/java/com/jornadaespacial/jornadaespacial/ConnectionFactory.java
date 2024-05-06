package com.jornadaespacial.jornadaespacial;
import java.sql.*;

public class ConnectionFactory {
    String host = "bd-jornada-espacial-jornada-espacial.b.aivencloud.com";
    String port = "26738";
    String user = "avnadmin";
    String password = "AVNS_LzVr6FmUSvqU4Vic0gV";
    String database = "defaultdb";

    Connection conectar() throws Exception{
        var stringConexao = String.format(
            "jdbc:postgresql://%s:%s/%s?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory", host, port, database);
        return DriverManager.getConnection(stringConexao, user, password);
    }
}
