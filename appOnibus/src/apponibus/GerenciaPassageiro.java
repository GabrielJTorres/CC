package apponibus;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerenciaPassageiro {
    
    private ArrayList <Passageiro>
    listaPassageiro = new ArrayList();
    
    public ArrayList<Passageiro>
            
    getListaPassageiro() {
    return listaPassageiro;
    }//get do listaPessoa
    
    
    public void setListaPassageiro(ArrayList<Passageiro> listaPassageiro) {
    this.listaPassageiro = listaPassageiro;
    }//set do listaPassageiro
    
    
    public void inserePassageiro (Passageiro p){
    listaPassageiro.add(p);
    }
    
    
    public String listarPassageiros(){
    String saida = " ";
    if (listaPassageiro.isEmpty()){
    saida = "Nenhuma pessoa cadastrada";
        }  
        else{
        for(Passageiro p: listaPassageiro){
        saida = saida + p.toString()+"\n";
            }
        
        }  
    return saida;
    }
    
}
