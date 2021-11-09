package classemoto;
public class ClasseMoto {
    public static void main(String[] args) {
        Moto motoVitor = new Moto();
        motoVitor.cor = "Verde";
        motoVitor.marca = "Kawasaki";
        motoVitor.modelo = "Ninja";
        motoVitor.nroChassi ="909090333333111";
        motoVitor.nroCilindradas = 500;
        motoVitor.nroPlaca = "ABC12C4";
        
        motoVitor.verificarLicenca();     
        motoVitor.licenciar();
        motoVitor.status();
        motoVitor.verificarLicenca();
        
        
        Moto motoAlex = new Moto();
        motoAlex.cor = "Azul";
        motoAlex.marca = "Honda";
        motoAlex.modelo = "CB1200";
        motoAlex.nroChassi ="909090333333112";
        motoAlex.nroCilindradas = 1200;
        motoAlex.nroPlaca = "ABC12C9";
             
        motoAlex.status();
        motoAlex.verificarLicenca();
    
    }
    
}
