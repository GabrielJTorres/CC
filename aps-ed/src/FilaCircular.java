public class FilaCircular {
	// Atributos da Classe
	private String[] dados;
	private int posComeco;
	private int posFinal;
	private int tamMax;
	private int qtdClientes;

	// Método Construtor
	public FilaCircular(int tamMax) {
		dados = new String[tamMax];
		this.tamMax = tamMax;
		this.posComeco = 0;
		this.posFinal = 0;
		this.qtdClientes = 0;
	}
	
	// Getters/Setters
	public int getPosFinal() {
		return this.posFinal;
	}
	
	public String getPrimeiraPessoa() {
		return this.dados[this.posComeco];
	}

	// Métodos da Estrutura de Fila Circular
	public boolean isFull() {
		if(this.length() == this.tamMax) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(this.length() == 0) {
			return true;
		}else {
			return false;
		}
	}

	public int length() {
		return this.qtdClientes;
	}
	
	public void destroy() {
		this.dados = null;
		System.gc();
	}
	
	public void enqueue(String valor) {
		if(isFull()) {
			System.out.println("A fila está lotada.");
		}else {
			this.dados[this.posFinal] = valor;
			this.qtdClientes++;
			this.posFinal++;
			
			if(this.posFinal > tamMax -1) {
				this.posFinal = 0;
			}
		}
	}
	
	public String dequeue() {
		if(isEmpty()) {
			System.out.println("A fila está vazia.");
			return null;
		}else {
			String elemento = this.dados[this.posComeco];
			this.qtdClientes--;
			this.posComeco++;
			
			if(this.posComeco > this.tamMax - 1) {
				this.posComeco = 0;
			}
			return elemento;
		}
	}

	public void insereMeio(String valor) {
		if(isFull()) {
			System.out.println("A fila está lotada.");
		}else {
			for(int i = this.posFinal; i >= 0 ; i--) {
				this.dados[i + 1] = this.dados[i];
			}
			this.dados[this.posComeco] = valor;
			this.posFinal++;
			this.qtdClientes++;
			
			if(this.posFinal > this.tamMax -1) {
				this.posFinal = 0;
			}
		}
	}
	
	public void imprimeFila() {
	  System.out.println("-----------");
	  if (isEmpty()) {
	    System.out.println("A fila está vazia.");
	  }
	  else{
	    for (int i = 0; i < length(); i++) {
	      if ((this.posComeco + i) < this.tamMax) {
	          System.out.println("Cliente [" + i + "] = " + this.dados[this.posComeco + i]);
	      }
	      else{
	        System.out.println("Cliente [" + i + "] = " + this.dados[this.posComeco + i - this.tamMax]);
	      }
	    }
	  }
	  System.out.println("-----------");
	}
}
