package stel.jornadaespacial;

public class UsuarioDAO {
    boolean existe(Usuario u) throws Exception {
        // Comando SQL (SELECT)
        var sql = "SELECT * FROM tb_jornada_espacial_usuarios WHERE login = ? AND  senha = ?";

         //2. Estabelece uma conexão com o banco de dados
         var conexao = new ConnectionFactory().conectar();

         //3. Prepara o comando
        var ps = conexao.prepareStatement(sql);
        
        //4. Substituir os eventuais placeholders
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());

        //5. Executa o comando
        var rs = ps.executeQuery();

         //6. Tratar o resultado e devolver true ou false
         var usuarioExiste = rs.next();
       
         //7. Fechar a conexão
        rs.close();
        ps.close();
        conexao.close();
        return usuarioExiste;
    }
}
