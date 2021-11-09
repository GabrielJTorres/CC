
package lar;

import java.util.Scanner;

public class Porta {
    boolean aberta;
    private String cor;
    double altura, largura;
    Scanner ler = new Scanner(System.in);
    
    public void abre(){
        boolean aberta = true;
    }
    
    public void fecha(){
        boolean aberta = false;
    }
    
    public void Pinta(){
        System.out.println("Qual será a cor da porta? ");
        cor = ler.nextLine();
    }
    
    public void estaAberta(){
        if(aberta = true){
            System.out.println("A porta está aberta.");
        }
        else{
            System.out.println("A porta está fechada.");
        }
    }
            
}
