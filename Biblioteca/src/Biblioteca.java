import java.util.Scanner;
public class Biblioteca {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		SisBiblioteca t1;         
		t1 = new SisBiblioteca("AAA", "BBB", "CCC", "Categoria", 2, false); 
		
		t1.setTitulo("");
		t1.setAutor("");
		t1.setAno("");
		t1.setCategoria("");
		t1.setPosisao(2);
		t1.setStatus(false);
		
		
	}	
		
}
