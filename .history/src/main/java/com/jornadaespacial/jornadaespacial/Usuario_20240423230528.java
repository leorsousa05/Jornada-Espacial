package com.jornadaespacial.jornadaespacial;

public class Usuario {
    int codigo;
    String login;
    String senha;

    Usuario(){}

    Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
}
