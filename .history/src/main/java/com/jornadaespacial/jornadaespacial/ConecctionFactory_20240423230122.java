package com.jornadaespacial.jornadaespacial;
import java.sql.*;
import java.sql.DriverManager;

public class ConecctionFactory {
    String host = "bd-jornada-espacial-jornada-espacial.b.aivencloud.com";
    String port = "26738";
    String user = "avnadmin";
    String password = "AVNS_LzVr6FmUSvqU4Vic0gV";
    String database = "defaultdb";

    Connection conectar() throws Exception{
        var stringConexao = String.format(
            "jdbc:postgresql://%s:%s/%s", host, port, database);
        return DriverManager.getConnection(stringConexao, user, password);
    }
}
