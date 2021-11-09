
package banco;

public class Conta {
    // Atributos
    private int numeroConta;
    private String nomeCliente;
    private int cpf;
    private double saldo;

    ContaCorrente cc = new ContaCorrente();

    // MÃ©todo Construtor
    public Conta(int numeroConta, String nomeCliente, int cpf) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
    }

    public Conta(){

    }

    // MÃ©todos Getters/Setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    //*
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCpf() {
        return cpf;
    }
    
    //*
    protected void setCpf(int cpf) {
        this.cpf = cpf;
    }
 
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    //*
    protected void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    // MÃ©todos UtilitÃ¡rios
    public boolean sacar(double valorSacado){
        double novoSaldo = this.saldo - valorSacado;
        this.saldo = novoSaldo;
        if(valorSacado - this.saldo < 0){
            return false;
        }
        return true;
    }

    public boolean depositar(double valorDepositado){
        this.saldo += valorDepositado;
        if(valorDepositado <= 0){
            return false;
        }
        return true;
    }

    public String toString(){
        return "Nome do Cliente: " + this.nomeCliente + "\nCPF: " + this.cpf + "\nNÃºmero da Conta: " + this.numeroConta + "\nSaldo disponÃ­vel: " + this.saldo + "Limite Utilizado: " +cc.getLimite();
    }

}

