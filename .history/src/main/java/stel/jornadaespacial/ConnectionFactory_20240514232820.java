package stel.jornadaespacial;
// importações 
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    // Dados do banco 
    String host = "jornada-espacial-banco-de-dados-jornada-espacial.f.aivencloud.com";
    String port = "18884";
    String user = "avnadmin";
    String password = "AVNS_M5c0gyyQgAlMG5WniRc";
    String database = "defaultdb";
    
    Connection conectar() throws Exception{
        var stringConexao = String.format(
            "jdbc:postgresql://%s:%s/%s",
            host, port, database
        );
        return DriverManager.getConnection(
            stringConexao, user, password
        );    
}
}