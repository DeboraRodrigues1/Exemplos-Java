import java.util.Scanner;

public class Exemploleitura {
	
	public static void main(String args []) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int a;
		float b;
		String texto;
		
		System.out.print("Digite um nome: ");
		texto = teclado.nextLine();
		System.out.print("Digite um valor inteiro: ");
		a = teclado.nextInt();
		System.out.print("Digite um valor real: ");
		b = teclado.nextFloat();
		
		
		System.out.print("O texto digitado vale: ");
		System.out.print(texto);
		System.out.print(" Voce digitou os valores " +a+" e "+b);
		
	}
}
