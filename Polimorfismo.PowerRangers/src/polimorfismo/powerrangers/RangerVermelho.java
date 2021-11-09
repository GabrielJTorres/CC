package polimorfismo.powerrangers;
public class RangerVermelho extends PowerRanger {
    private String relacionamento;
    private boolean comando;

    @Override
    public void transformar() {
        System.out.println("Tiranossauro Rex");
    }

    @Override
    public void zord() {
        System.out.println("Zord Rex, acoplar!");
    }

    public boolean isComando() {
        return comando;
    }

    public void setComando(boolean comando) {
        this.comando = comando;
    }

    public String getRelacionamento() {
        return relacionamento;
    }

    public void setRelacionamento(String relacionamento) {
        this.relacionamento = relacionamento;
    }

    
    @Override
    public String toString() {
        return super.toString()+ " que está no comando:" ;
    }
    
      
    
}



