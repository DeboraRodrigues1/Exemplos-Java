import java.util.Scanner;

public class Uri1017 {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		int veloMedia = entrada.nextInt();
		int tempoGasto = entrada.nextInt();
		double distancia = veloMedia * tempoGasto;
		double consumo = distancia / 12;
		

		System.out.printf("%.3f\n", consumo);

	}
}