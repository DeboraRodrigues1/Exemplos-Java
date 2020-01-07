import java.util.Scanner;

public class Uri1060 {

	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		double X;
		
		System.out.print("Informe 6 valores: ");
		
		int totalPositive = 0;

		for (int i = 0; i < 6; i++) {
			X = input.nextDouble();
			if (X > 0) {
				totalPositive += 1;
			}
		}
		System.out.print(totalPositive + " valores positivos\n");
		
	}
	
}
