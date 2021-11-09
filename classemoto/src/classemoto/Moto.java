package classemoto;
public class Moto {
    //atributos
     String modelo, marca, nroChassi, nroPlaca, cor;
     boolean licenciada;
     int nroCilindradas;
     //status
     void status(){
        System.out.println("Modelo " +this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.print("Está licenciada? ");
        if (!licenciada)
            System.out.println("Não");
        else  
            System.out.println("Sim");          
        System.out.println("Placa: "+ this.nroPlaca);
        System.out.println("Chassis: "+ this.nroChassi);
        System.out.println("Cilindradas: " + this.nroCilindradas);
        System.out.println("--------------");
     }
     //métodos
        void verificarLicenca(){
        if(!this.licenciada){
            System.out.println("Esta moto não é licenciada!");
        }else{
            System.out.println("Esta moto é licenciada, tudo está ok");
        }     
    }
        void licenciar(){
         this.licenciada=true;
     }
}
    
