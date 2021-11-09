package polimorfismo.powerrangers;
public class RangerAmarela extends PowerRanger {
    private boolean comando;
    
    @Override
    public void transformar() {
        System.out.println("Tigre dente de Sabre");
    }

    @Override
    public void zord() {
        System.out.println("Zord Tigre dente de Sabre, acoplar!");
    }    

    public boolean isComando() {
        return comando;
    }

    public void setComando(boolean comando) {
        this.comando = comando;
    }
    
    
  
}
