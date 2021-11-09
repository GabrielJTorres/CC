package AppTrapezio;
import java.util.Scanner;
public class AppTrapezio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float baseMaior, baseMenor, altura;
        
        
        
        trapezio t = new trapezio();
        
        System.out.println("Digite a base maior: ");
        baseMaior = entrada.nextFloat();
        
        System.out.println("Digite a base menor: ");
        baseMenor = entrada.nextFloat();
        
        System.out.println("Digite a altura: ");
        altura = entrada.nextFloat();
        
        //configura o objeto
        t.setBaseMaior(baseMaior);
        t.setBaseMenor(baseMenor);
        t.setAltura(altura);
        
        //calcula a área
        System.out.println("A área do trapézio é: " + t.calcularArea() );
        System.out.println("");
        System.out.println("===== DADOS DO TRAPÉZIO =====");
        System.out.println( t.status() );
        
    }    
}

