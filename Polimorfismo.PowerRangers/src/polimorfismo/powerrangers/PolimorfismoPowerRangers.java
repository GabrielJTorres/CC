package polimorfismo.powerrangers;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PolimorfismoPowerRangers {
    
    public static void main(String[] args) {
        
        MainFrame  j;
        j = new MainFrame();
        j.setVisible(true);
        
        
        
    RangerVermelho v1 = new RangerVermelho();
    RangerVerde ve1= new RangerVerde();
    RangerRosa r1 = new RangerRosa();
    RangerAmarela a1 = new RangerAmarela();
    RangerPreto p1 = new RangerPreto();
    RangerAzul z1 = new RangerAzul();
    
    
    v1.setNome("Jason");
    v1.setIdade(18);
    v1.setCor("Vermelho");
    v1.setPoder(80);
    v1.setAnimal("Tiranossauro");
    v1.setComando(true);
    
    ve1.setNome("Tommy");
    ve1.setIdade(20);
    ve1.setCor("Verde");
    ve1.setPoder(80);
    ve1.setAnimal("Dragonsauro");
    
    r1.setNome("Kimberly");
    r1.setIdade(17);
    r1.setCor("Rosa");
    r1.setPoder(90);
    r1.setAnimal("Pterodáctilo");
    
    a1.setNome("Trini");
    a1.setIdade(17);
    a1.setCor("Amarela");
    a1.setPoder(80);
    a1.setAnimal("Tigre Dente de Sabre");
        
    p1.setNome("Zack");
    p1.setIdade(18);
    p1.setCor("Preto");
    p1.setPoder(70);
    p1.setAnimal("Mastodonte");
    
    z1.setNome("Billy");
    z1.setIdade(17);
    z1.setCor("Azul");
    z1.setPoder(60);
    z1.setAnimal("Triceratops");
    
        
    }
    
}
