import java.util.Scanner;
public class AppQueTestaTv {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		Televisao t1;          // Declarei que o t1 vai "manipular" uma TV
		t1 = new Televisao();  // Reservo um espaço na memória pra isso
		
		t1.setMarca("Sony");
		t1.setVoltagem(110);
		t1.setTamanho(32);
		t1.setLigada(false);
		t1.setCanal(5);
		t1.setVolume(2); 
		
		
		do {
			System.out.println("*************************");
			System.out.println("  Controle remoto da TV  ");
			System.out.println("-------------------------");
			System.out.println("1  - Ligar/Desligar      ");
			System.out.println("2  - Aumentar Volume     ");
			System.out.println("3  - Diminuir Volume 	 ");
			System.out.println("4  - Ativar Canal		 ");
			System.out.println("5  - Voltar Canal 		 ");
			System.out.println("-1 - Encerrar Sistema	 ");
			System.out.println("*************************");
			opcao = teclado.nextInt();
			//logica das opções
			switch(opcao) {
			case 1:
				t1.switchPower();
				break;
			case 2: 
				t1.aumentarVolume();
				break;
			case 3:
				t1.diminuirVolume();
				break;
			}
			
			System.out.println("\n\n\n\n\n");
			
		} while(opcao !=0);
		
	}

}
