/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testelistadupla;

/**
 *
 * @author BrunoMulina
 */
public class No {
    
    //campo valor
    private double valor;
    
    //campos referencia
    private No proximo;
    private No anterior;

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public No getProximo() {
        return this.proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return this.anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
    
    
    public No() {}
    
    public No (double valor) {
        this.valor = valor;
    }
    
    public No (double valor, No anterior, No posterior) {
        this.valor = valor;
        this.anterior = anterior;
        this.proximo = posterior;
    }

}
