package polimorfismo.animal;
public class Peixe extends Animal{
    private String corEscama;

    public void fazerBolha(){
        System.out.println("Soltou uma Bolha");
    }
            
    @Override
    public void locomover() {
        System.out.println("Peixe nada...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo planctons e outras substâncias da água");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}

