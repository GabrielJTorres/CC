package polimorfismo.powerrangers;
public class RangerPreto extends PowerRanger {
    private String temperamento;
    private boolean seguirRegras;
    
    @Override
    public void transformar() {
        System.out.println("Mastodonte");
    }

    @Override
    public void zord() {
        System.out.println("Zord Mastodonte, acoplar!");
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }

    public boolean isSeguirRegras() {
        return seguirRegras;
    }

    public void setSeguirRegras(boolean seguirRegras) {
        this.seguirRegras = seguirRegras;
    }
    
    
}
