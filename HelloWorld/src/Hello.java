public class Hello {

	public static void main(String args []){
		
		float salarioMinimo, qtdeKw, precoKw, totalBruto, total;
		
		salarioMinimo = Float.parseFloat(args[0]);
		qtdeKw        = Float.parseFloat(args[1]);
		
		precoKw = salarioMinimo /700;
		totalBruto = precoKw * qtdeKw;
		total = totalBruto * 0.9f;
	
		System.out.println("Valor de 1 Kw R$ " +precoKw);
		System.out.println("Total da conta R$" +totalBruto);
		System.out.println("Total com desconto" +totalBruto*0.9);
		
	}
}
