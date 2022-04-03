package AulaPratica;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Criação de matrix de campos:
		
		Campo[][] velha = new Campo[3][3];
		
		Boolean game =true; // Se o jogo esta rolando
		char simboloAtual='x'; // se é x ou o na vez.
		String vitoria="";
		Scanner teclado = new Scanner(System.in);
		
		//chamando o inicio do jogo:
		
		iniciarJogo(velha);
		
		while(game) {
			
			desenhaJogo(velha); //chama quando estiver rolando o game
			vitoria=verificaVitoria(velha); //verifica se alguém ganhar e aponta quem foi
				
			if(!vitoria.equals("")) {
					
					System.out.printf("Jogador %s venceu \n", vitoria );
					break;
				}
			
				try {//inserindo o jogo, ou a ideia das jogadas, verificando se pode ou não realizar a jogada.
					
					//jogando e vericando a posição válida
					//primeiro simboloAtual é da jogada, e o segundo simboloAtual é do verifica vitória
					
					if(verificandoJogada(velha,jogar(teclado,simboloAtual), simboloAtual)) {
						
						if(simboloAtual=='x') {
	
							simboloAtual='o';
							
						}else {
							
							simboloAtual='x';
							
						}
						
					}
					
					
				} catch (Exception e) {
					
					System.out.println("Erro.");
				}	
			}
		
		System.out.println("Fim do jogo");
		
		
	}
	
	//Desenho do jogo:
	//campo [][] velha - apenas um campo de passagemd e como esta o jogo. o desenho do jogo.
	//velha[0][0].getSimbolo() - puxando o campo da class Campo.
	
	public static void desenhaJogo(Campo[][] velha) {
		
		System.out.println("    0   1   2 ");
		System.out.printf("0   %c | %c | %c \n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
		System.out.println("   ---------------");
		System.out.printf("1   %c | %c | %c \n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[1][2].getSimbolo());
		System.out.println("   ---------------");
		System.out.printf("2   %c | %c | %c \n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());
		
	}
	
	//função para limpar tela: Subindo linhas
	
	public static void limparTela() {
		
		for(int cont=0; cont<200;cont++) {
			
			System.out.println("");
			
		}
		
	}
	
	//array de inteiros será retornado.
	
	public static int[] jogar (Scanner teclado, char sa) {
		
		int p[]=new int [2];
		
		System.out.printf(" %s %c \n", "Quem joga: ", sa); //se é X ou O
		//lendo linha e coluna:
		System.out.println(" Informa a Linha: ");
		p[0]= teclado.nextInt();
		System.out.println(" Informa a Coluna: ");
		p[1]= teclado.nextInt();
		return p; //retornando posição
	}
	
	//a jogada valida = true ou false
	//indicar linha e coluna por cada jogada. em arrey
	//o simbolo atual
	//int p[]- indica um ponto do jogar. retorna o ponto da jogada, linha ou coluna.
	
	public static Boolean verificandoJogada(Campo[][] velha, int p[], char simboloAtual) {
		
		if(velha[p[0]][p[1]].getSimbolo()== ' ') { //jogada válida
			velha[p[0]][p[1]].setSimbolo(simboloAtual);
			//se tive váilda, o setSimbolo deve permitir a jogada x ou o.		
			
			return true;
		}else { // se não estiver vazio, não poderá ser jogado
			
			return false;
			
		}
		
		
	}
	
	
	//funçãode inicio do jogo:
	// for para percorrer o array e adicionar os campos no array
	
	public static void iniciarJogo(Campo[][] velha) {
	
		for(int linha=0; linha<3;linha++) {
			for(int coluna=0;coluna<3;coluna++) {
				
				velha[linha][coluna] = new Campo();
				
			}
			
		}
		
	}
	
	//vitoria:
	
	public static String verificaVitoria(Campo[][] velha) {
		
		return "";
		
	}

}
