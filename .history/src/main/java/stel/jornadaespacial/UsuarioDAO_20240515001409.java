package stel.jornadaespacial;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    
    private boolean existe(Usuario u) throws SQLException {
        // Comando SQL (SELECT)
        String sql = "SELECT * FROM tb_jornada_espacial_usuarios WHERE login = ? AND senha = ?";
        
        try (Connection conexao = new ConnectionFactory().conectar();
             PreparedStatement ps = conexao.prepareStatement(sql)) {
            
            // Substituir os eventuais placeholders
            ps.setString(1, u.getLogin());
            ps.setString(2, u.getSenha());
            
            // Executa o comando
            try (ResultSet rs = ps.executeQuery()) {
                // Tratar o resultado e devolver true ou false
                return rs.next();
            }
        }
    }

    /**
     * Verifica se um usuário existe no banco de dados.
     * 
     * @param u O usuário a ser verificado
     * @return true se o usuário existe, false caso contrário
     */
    public boolean verificarExistenciaUsuario(Usuario u) {
        try {
            return existe(u);
        } catch (SQLException e) {
            // Tratar exceção de forma apropriada
            System.err.println("Falha a existência do usuário: " + e.getMessage());
            return false;
        }
    }
}
