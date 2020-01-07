import java.util.Scanner;

public class Uri1044 {
	
	   public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	 
	        System.out.print("Digite um numero inteiro: ");
	        int A = entrada.nextInt();
	        System.out.print("Digite outro numero inteiro: ");
	        int B = entrada.nextInt();
	      
	        if (A % B == 0 || B % A == 0) {	   
	        System.out.println("Sao Multiplos");
	        } else { 
	        System.out.println("Nao sao Multiplos");
	        
	        }
	    }
	}


