/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testelistadupla;

/**
 *
 * @author BrunoMulina
 */
public class TesteListaDupla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaDupla ld = new ListaDupla();
        
        /*
        ld.insereComeco(45);
        ld.insereComeco(13);
        ld.insereComeco(123);
        */
        
        /*
        ld.insereFinal(86);
        ld.insereFinal(864);
        ld.insereFinal(6943);
        */
        
        ld.insereMeio(0, 5);
        ld.insereMeio(1, 78);
        ld.insereMeio(0, 951);
        
        System.out.println(ld.length());
         
        ld.imprime();
        System.out.println("****************");
        ld.imprimeinverso();
        
        
    }
    
}
