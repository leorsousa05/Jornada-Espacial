package com.jornadaespacial.jornadaespacial;

public class UsuarioDAO {
    boolean existe(Usuario u) throws Exception{

        var sql = "SELECT *  FROM tb_jornada_espacial WHERE login =? AND senha =?";
        var conexao = new ConecctionFactory().conectar();
        var ps = conexao.prepareStatement(sql);
        ps.setString(1, u.login);
        ps.setString(1, u.senha);
        var rs = ps.executeQuery();
        var usuarioExiste = rs.next();
        rs.close();
        ps.close();
    }
}
