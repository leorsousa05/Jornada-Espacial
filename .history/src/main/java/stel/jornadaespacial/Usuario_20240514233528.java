package stel.jornadaespacial;

public class Usuario {
    private String login;
    private String senha;

    Usuario(){}
    
    Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    
    public String getLogin(){
        return login;
    }

    public String getSenha() {
        return senha;
    }
}

