import java.util.Scanner;

public class Cliente{
    // Atributos da Classe
	private int idade; 
	private int count = 0; 	
	FilaCircular fila; 
	FilaCircular filaPref;
	
    // Método Construtor
	public Cliente() { 
		fila = new FilaCircular(20);
		filaPref = new FilaCircular(10);
	}

    // Métodos Utilitários
	public void menuPrincipal() { 
		int menuOpcao = 0;
		
		do {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@   Sistema de Atendimento Bancário  @");
			System.out.println("@           por Prioridade           @");
			System.out.println("@  1 — Inserir um cliente na fila    @");
			System.out.println("@  2 — Atender um cliente da fila    @");
			System.out.println("@  3 — Imprimir fila                 @");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			Scanner input = new Scanner(System.in);
			menuOpcao = input.nextInt();
			switch(menuOpcao) {
				case 1:
					this.enqueue();
					if(!fila.isEmpty()) {
						fila.imprimeFila();
					}
					if(!filaPref.isEmpty()) {
						filaPref.imprimeFila();
					}
					break;
				case 2:
					this.atenderCliente();
					if(fila.isEmpty() && filaPref.isEmpty()) {
						System.out.println("A fila está vazia.");
					}
					break;
				case 3:
					if(!fila.isEmpty()) {
						fila.imprimeFila();
					}else if(!filaPref.isEmpty()) {
						filaPref.imprimeFila();
					}else {
						System.out.println("A fila está vazia.");
					}
					break;
			}
		}while(menuOpcao != 0);
	}
	
	public boolean isDeficiente() { 
		System.out.println("Você é portador de alguma deficiência? (S/N)\n");
		String deficiente;
		Scanner input = new Scanner(System.in);
		deficiente = input.nextLine();
		deficiente.toLowerCase();
		if(deficiente.equals("S")) {
			return true;
		}else if(deficiente.equals("N")) {
			return false;
		}else {
			return false;
		}
	}
	
	public void enqueue() { 
		System.out.print("Qual é a sua idade: ");
		Scanner input = new Scanner(System.in);
		this.idade = input.nextInt();
		if(this.idade >= 60) {
			filaPref.enqueue(Integer.toString(this.idade) + " -> É uma pessoa idoso.");
		}else if(this.idade >= 60 && this.isDeficiente()) {
			filaPref.enqueue(Integer.toString(this.idade) + " -> É uma pessoa idosa portadora de alguma deficiência.");
		}else if(this.isDeficiente()) {
			filaPref.enqueue(Integer.toString(this.idade) + " -> É uma pessoa portadora de alguma deficiência.");
		}else {
			fila.enqueue(Integer.toString(this.idade));
		}
	}
	
	public void atenderCliente() { 
		if(fila.isEmpty()) {
			if(!filaPref.isEmpty()) {
				System.out.println("Cliente atendido: " + filaPref.dequeue());
			}
		}else {
			if(this.count < 4 && !filaPref.isEmpty()) {
				System.out.println("Cliente atendido: " + filaPref.dequeue());
				this.count++;
				if(filaPref.isEmpty()) {
					System.out.println("A fila preferencial está vazia. ");
					this.count = 6;
				}
			}else {
				System.out.println("Cliente atendido: " + fila.dequeue());
				this.count = 0;
			}
		}
	}
}