
package banco;

public class ContaPoupanca extends Conta{

    Conta contas = new Conta();

    public ContaPoupanca(){

    }
    
    // rever esse método
    public void calcularRendimento(double porcentagemRendimento){
        double soma;
        soma = contas.getSaldo() * 0.1;
        contas.setSaldo() = soma + contas.getSaldo();
    }
}