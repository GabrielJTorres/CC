
package exceções;

public class Exceções {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.In);
        System.out.println("Eu sei dividir");
        System.out.println("Informe o primeiro valor: ");
        int x = teclado.nextInt();
        
        try{
            x = Integer.parseInt(teclado.nextInt());
            
        }catch(NumberFormatException e){
            System.out.println("Digite um número! \n" +e.getMessage());
        }
        
        System.out.println("Informe o segundo valor: ");
        int y = teclado.nextInt();
        
        
        
        double r = (x/y);
        System.out.println("O resultado da divisão é "+r);
     
    }
    
}
