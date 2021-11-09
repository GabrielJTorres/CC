
package banco;

public class ContaCorrente extends Conta{
    // Atributos
    private double limite = 0;

    Conta contas = new Conta();
    
    // Métodos Construtores
    public ContaCorrente(int numeroConta, String nomeCliente, int cpf) {
        super(numeroConta, nomeCliente, cpf);
    }

    public ContaCorrente(int numeroConta, String nomeCliente, int cpf, double limite) {
        super(numeroConta, nomeCliente, cpf);
        limite = this.limite;  
    }

    public ContaCorrente(){

    }

    // Getters/Setters
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // Métodos Utilitários
    public boolean usandoLimite(){
        if(contas.getSaldo() <= 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean sacar(double valorSacado){
        double novoSaldo = this.limite - valorSacado;
        this.limite = novoSaldo;
        if(valorSacado - this.limite < -500){
            return false;
        }
        return true;
    }
    


    
    
}

