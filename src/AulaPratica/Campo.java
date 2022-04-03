package AulaPratica;

/*
 * Analise de preenchimento ou não de cada um dos 9 campos.
 */

public class Campo {
	
	private char simbolo;

	public Campo() {
		
		this.simbolo = ' ';
	}

	public char getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(char simbolo) {
		if(this.simbolo == ' ') {
			
			this.simbolo=simbolo;
			
		}else {
			
			System.out.println("Campo preenchido");
			
		}
	}
	
}	
