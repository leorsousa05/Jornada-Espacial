package stel.jornadaespacial;

public class Usuario {
    
    // Dados referntes ao usuário
    private int codigo;
    private String login;
    private String senha;
    private String tipo;
    private String nomeCompleto;
    private int idade;
    private String sexo;
    private String email;
    private String cpf;
    private String telefone;
    
    
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

