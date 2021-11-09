package apponibus;

import javax.swing.JOptionPane;

public class Passageiro {
    
    
   public Passageiro(){        
    }

    //atributos
    private String nome;
    private String RG;
    private String destino;
    private int assento;
    
    
    public String getNome(){
    return nome;
    }
    
    public void setNome(String nome){
    this.nome = nome;
    }  
    
    public String getRG(){
    return RG;
    }
    
    public void setRG(String RG){
    this.RG = RG;
    } 
    
    
    public String getDestino(){
    return destino;
    }
    
    public void setDestino(String destino){
    this.destino = destino;
    } 
    
    
    public int getAssento(){
    return assento;
    }
    
    public void setAssento(int assento){
    this.assento = assento;
    }
    
    
    
    //imprimir os dados da Pessoa
    public String status(){
    return "Nome: "+nome+"\nAssento: "+assento+
    "\nRG: "+RG+"\nDestino: "+destino;
    }
    
}
