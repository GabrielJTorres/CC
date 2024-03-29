package polimorfismo.animal;
public class Ave extends Animal {
    private String corPena;
    
    public void fazerNinho(){
        System.out.println("Construindo ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Ave voa...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");  
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
