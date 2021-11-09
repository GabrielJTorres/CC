/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapsort;

import java.util.Scanner;

/**
 *
 * @author BrunoMulina
 */
public class Heapsort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] vetor = {1, 4, 8, 2, 5, 1, 0, 3, 7, 3, 10, 50, 0, 77, -8};
        
        
        Lista ls = new Lista();
        for (int i = 0; i < vetor.length; i++) {
            ls.insereFinal(vetor[i]);
        }
        ls.imprime();
        
        /*
        ordenacao.heapSort(vetor);
        ordenacao2.heapSort2(ls);
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        
        ls.imprime();
        */
        
        
        //bubblesort
        for (int i = 0; i < ls.length(); i++) {
            for (int j = 0; j < ls.length() - 1; j++){
                
                if (ls.leElemento(j) > ls.leElemento(j+1)) {
                    double temp = ls.removeMeio(j+1);
                    ls.insereMeio(temp, j);  
                } 
            }
        }
        System.out.println("-------------------------------");
        ls.imprime();
        
        
        
        //insere ordenado
        Scanner sc = new Scanner(System.in);
        String op = "";
        double valorainserir = 0;
        
        
        do {
            
            System.out.println("Digite um valor numérico - um texto para parar");
            op = sc.nextLine();
            
            try {
                valorainserir = Double.parseDouble(op);
                op = "";
                
                int pos = 0;
                while ((valorainserir > ls.leElemento(pos)) && (pos < ls.length())) {
                    pos++;
                }
                ls.insereMeio(valorainserir, pos);

                System.out.println("-------------------------------");
                ls.imprime();
             }

            catch (Exception ex) {
                op = "texto";
                System.out.println("vc digitou um texto");
            }

        } while (op == "");
        
        

        //inverter uma lista
        /*
        double v1 = 0;
        double v2 = 0;
        for (int i = 0; i < ls.length()/2 ; i++) {
            v1 = ls.removeMeio(i);
            v2 = ls.removeMeio(ls.length()-i-1);
            
            ls.insereMeio(v1, ls.length()-i);
            ls.insereMeio(v2, i);
        }
        
        System.out.println("-------------------------------");
        ls.imprime();
        */
        
        //v2 inverter
        double v1 = 0;
        
        for (int i = 0; i < ls.length() - 1; i++) {
            v1 = ls.removeComeco();
            ls.insereMeio(v1, ls.length() - i);
        }
        System.out.println("-------------------------------");
        ls.imprime();

        
        
        
        
        
        
        
        
        
        
        
        
        
     }
    
}
