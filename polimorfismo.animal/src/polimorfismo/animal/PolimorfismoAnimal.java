package polimorfismo.animal;
public class PolimorfismoAnimal {
    public static void main(String[] args) {
        //Animal n = new Animal(); //não pode instanciar objetos da classe principal
        Mamifero m = new Mamifero();
        Reptil Jacarelvis = new Reptil();
        Peixe nemo = new Peixe();        
        Ave Rio = new Ave();
        
        m.setPeso(35.5f);
        m.setCorPelo("Marrom");
        System.out.println("Cor do mamífero: "+m.getCorPelo());
        m.locomover();
        
        Rio.locomover();
        nemo.locomover();
        Jacarelvis.locomover(); 
        Jacarelvis.alimentar();
    }
}
