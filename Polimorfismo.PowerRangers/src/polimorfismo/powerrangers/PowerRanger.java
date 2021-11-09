package polimorfismo.powerrangers;
public abstract class PowerRanger {
    protected String nome;
    protected int idade;
    protected String cor, moeda, animal;
    protected int poder;
     
    public abstract void transformar();
    public abstract void zord();
    
    public  void morfar(){
        System.out.println("Rangers: É hora de morfar!!!");
        
    }
    public void megazord(){
        System.out.println("--------Transformação Megazord!!!----");
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "PowerRanger: "+cor+ ", que é " + nome + ", o " + animal;
    }
    
    
}
/*
RangerVermelho: Líder, bem apessoado e de bom coração.

RangerAzul: Alívio cômico, sempre bem-humorado e otimista. 
Possui alto conhecimento tecnológico e, ao longo do tempo, criou e aprimorou diversos artefatos

RangerAmarela: Muitas vezes atua como a “segunda em comando”, por causa de sua inteligência. 
A Ranger Amarela é conhecida por se a típica “solteirona bem resolvida”. No filme da franquia, ela assumiu ser homossexual 

RangerRosa: O rostinho bonito da equipe. Antes de se tornar membro dos Power Rangers, 
a Rosa era uma garota popular, egoísta e superficial. Seu temperamento melhora quando assume seu lugar na equipe,
gentil, preocupada e unificadora da equipe.

PangerPreto: Revoltado e impulsivo, o Ranger Preto às vezes tem dificuldade 
em aceitar as ordens do Ranger Vermelho, mas acaba cedendo pelo bem da equipe. 

*/