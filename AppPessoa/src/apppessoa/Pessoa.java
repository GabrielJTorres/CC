
package apppessoa;

public class Pessoa {
    
    
    //atributos
    private String nome;
    private int idade;
    private String sexo;
    private String profissao;
    private String receberEmail;
    public String getNome(){
    return nome;
    }
    
    public void setNome(String nome){
    this.nome = nome;
    }  
    
    public int getIdade(){
    return idade;
    }
    
    public void setIdade(int idade){
    this.idade = idade;
    }
    
    public String getSexo() {
    return sexo;
    }
    
    public void setSexo(String sexo) {
    this.sexo = sexo;
    }
    
    public String getProfissao() {
    return profissao;
    }
    
    public void setProfissao(String profissao) {
    this.profissao = profissao;
    }
    
    public String getReceberEmail() {
    return receberEmail;
    }
    
    public void setReceberEmail(String receberEmail) {
        this.receberEmail = receberEmail;
    }
    
    
    //imprimir os dados da Pessoa
    public String status(){
    return "Nome: "+nome+"\nIdade: "+idade+
    "\nSexo: "+sexo;
    }
    
}
