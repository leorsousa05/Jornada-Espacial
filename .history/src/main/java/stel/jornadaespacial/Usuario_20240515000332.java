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
    
    // Será utilizado para logar
    Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    
   // Getters  e Setters
   public int getCodigo() {
    return codigo;
}

public void setCodigo(int codigo) {
    this.codigo = codigo;
}

public String getLogin() {
    return login;
}

public void setLogin(String login) {
    this.login = login;
}

public String getSenha() {
    return senha;
}

public void setSenha(String senha) {
    this.senha = senha;
}

public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

public String getNomeCompleto() {
    return nomeCompleto;
}

public void setNomeCompleto(String nomeCompleto) {
    this.nomeCompleto = nomeCompleto;
}

public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public String getSexo() {
    return sexo;
}

public void setSexo(String sexo) {
    this.sexo = sexo;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getCpf() {
    return cpf;
}

public void setCpf(String cpf) {
    this.cpf = cpf;
}

public String getTelefone() {
    return telefone;
}

public void setTelefone(String telefone) {
    this.telefone = telefone;
}
   
    
}

