
package apppessoa;

import java.util.ArrayList;

public class GerenciaPessoa {
    
    private ArrayList <Pessoa>
    listaPessoa = new ArrayList();
    
    public ArrayList<Pessoa>
            
    getListaPessoa() {
    return listaPessoa;
    }//get do listaPessoa
    
    
    public void setListaPessoa(ArrayList<Pessoa> listaPessoa) {
    this.listaPessoa = listaPessoa;
    }//set do listaPessoa
    
    
    public void inserePessoa (Pessoa p){
    listaPessoa.add(p);
    }
    
    
    public String listarPessoas(){
    String saida = " ";
    if (listaPessoa.isEmpty()){
    saida = "Nenhuma pessoa cadastrada";
        }  
        else{
        for(Pessoa p: listaPessoa){
        saida = saida + p.toString()+"\n";
            }
        
        }  
    return saida;
    }
    
}
