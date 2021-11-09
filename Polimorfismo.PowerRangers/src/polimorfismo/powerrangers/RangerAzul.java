package polimorfismo.powerrangers;
public class RangerAzul extends PowerRanger {
    private String humor;
    
    @Override
    public void transformar() {
        System.out.println("Triceratops");
    }

    @Override
    public void zord() {
        System.out.println("Triceratops, acoplar!");
    }
    
    public void desenvolverArtefatos(){
        System.out.println("Novos artefatos sendo desenvolvidos");
    }

    public String getHumor() {
        return humor;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }
    
    
}
