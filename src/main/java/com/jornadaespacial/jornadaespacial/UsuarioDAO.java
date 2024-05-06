package com.jornadaespacial.jornadaespacial;

public class UsuarioDAO {
    boolean existe(Usuario u) throws Exception{

        var sql = "SELECT *  FROM tb_jornada_espacial WHERE login = ? AND senha =?";
        var conexao = new ConnectionFactory().conectar();
        var ps = conexao.prepareStatement(sql);

        ps.setString(1, u.login);
        ps.setString(2, u.senha);

        var rs = ps.executeQuery();
        var usuarioExiste = rs.next();

        rs.close();
        ps.close();
        conexao.close();

        return usuarioExiste;
    }
}
