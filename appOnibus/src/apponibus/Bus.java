package apponibus;

import javax.swing.JOptionPane;

public class Bus {
    
    String placa,motorista, destino, partida;
    int assentos;
    
    
   public Bus(){        
    }
    
   public Bus(String placa, String motorista, String destino, int assentos, String partida){
        this.placa = placa;
        this.motorista = motorista;
        this.destino = destino;
        this.assentos = assentos;
        this.partida = partida;
   }

   void status(){
        System.out.println("------ DADOS DO ÔNIBUS --------");
        System.out.println("Placa: " +this.placa);
        System.out.println("Motorista: " + this.motorista);
        System.out.println("Destino: " + this.destino);
        System.out.println("Horário de partida: "+this.partida);
        System.out.println("Número de assentos disponíveis: " +this.assentos);
   }
    
}
