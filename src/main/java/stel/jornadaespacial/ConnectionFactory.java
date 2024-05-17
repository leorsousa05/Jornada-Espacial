package stel.jornadaespacial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private String host = "jornada-espacial-banco-de-dados-jornada-espacial.f.aivencloud.com";
    private String port = "18884";
    private String user = "avnadmin";
    private String password = "AVNS_M5c0gyyQgAlMG5WniRc";
    private String database = "defaultdb";

    public Connection conectar() throws SQLException {
        String stringConexao = String.format(
            "jdbc:postgresql://%s:%s/%s",
            host, port, database
        );

        try {
            return DriverManager.getConnection(
                stringConexao, user, password
            );
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            throw e;
        }
    }

    public void fecharConexao(Connection conexao) {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }

   
}
