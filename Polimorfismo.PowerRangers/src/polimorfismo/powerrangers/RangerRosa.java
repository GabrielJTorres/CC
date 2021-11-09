package polimorfismo.powerrangers;
public class RangerRosa extends PowerRanger{
    private String temperamento;
    
     @Override
    public void transformar() {
        System.out.println("Pterodáctilo");
    }

    @Override
    public void zord() {
        System.out.println("Zord Pterodactilo, acoplar!");
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }
    
    
}
