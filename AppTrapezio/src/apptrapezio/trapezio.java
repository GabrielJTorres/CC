package AppTrapezio;
public class trapezio {
    //atributos
    private float baseMaior;
    private float baseMenor;
    private float altura;
    
    //Construtores
    public trapezio(){} //default
    //com parâmetros - sobrecarregado
    public trapezio(float baseMaior, float baseMenor, float altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }    
    //métodos de acesso
    public float getBaseMaior() {
        return baseMaior;
    }
    public void setBaseMaior(float baseMaior) {
        this.baseMaior = baseMaior;
    }
    public float getBaseMenor() {
        return baseMenor;
    }
    public void setBaseMenor(float baseMenor) {
        this.baseMenor = baseMenor;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {        
        this.altura = altura;        
    }
    
//métodos da classe
    public float calcularArea(){
        float area;        
        area = ( (baseMaior+baseMenor) * altura ) / 2;        
        return area;
    }
    
    public String status(){
        return "Base Maior: " + baseMaior + "\nBase Menor: " + baseMenor +
                "\nAltura: " + altura;
    }
}

