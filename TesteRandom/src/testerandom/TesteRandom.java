
package testerandom;

import java.util.Random;

public class TesteRandom {

    public static void main(String[] args) {
        
    Random aleatorio = new Random();
    int valor = aleatorio.nextInt(10) + 1;
    System.out.println("Número gerado: " + valor);
  }
}

