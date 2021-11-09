
package lar;

import java.util.Scanner;

public class Casa {
    String cor;
    Porta porta1, porta2, porta3;
    int open;
    Scanner ler = new Scanner(System.in);
    
    public void pinta(){
        System.out.println("Informe a cor com a qual a casa será pintada: ");
        cor = ler.nextLine();
    }
    
    public String portasAbertas(){
        open = 0;
        if (porta1.aberta = true){
            open++;
        }
        if (porta2.aberta = true){
            open++;
        }
        if (porta3.aberta = true){
            open++;
        }
        return "Esta casa possui um total de " +open + "portas abertas.";
        
    }
}
