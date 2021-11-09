package polimorfismo.powerrangers;
public class RangerVerde extends PowerRanger {
    private String relacionamento;
        
    @Override
    public void transformar() {
        System.out.println("DragonZord");

    }

    @Override
    public void zord() {
        System.out.println("DragonZord, acoplar!");
    }

    public String getRelacinamento() {
        return relacionamento;
    }

    public void setRelacinamento(String relacinamento) {
        this.relacionamento = relacionamento;
    }
    
    
}
