import java.util.Scanner;

public class Prova {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		String respostaUser;
		int acertos = 0;
		QuestaoSimples simulado[] = new QuestaoSimples[4];
		
		simulado[0] = new QuestaoSimples("Quem descobriu o Brasil?","PA Cabral");
		simulado[1] = new QuestaoMultiplaEscolha("Qual a formula da agua?","H2O", "chuva","H20","H202");
		simulado[2] = new QuestaoSimples("Qual a cor do  cavalo Braco do Napoleão:", "Marrom");
		simulado[3] = new QuestaoMultiplaEscolha("Quanto é 1+1","2", "2", "4", "6", "8");
		
		for (int i=0;i<simulado.length;i++) {
			System.out.println(simulado[i].aplicarQuestao());
			respostaUser = teclado.nextLine();
			if (simulado[i].corrigir(respostaUser)) {
				acertos++;
			}
		}
		System.out.println("Você teve "+acertos+" acertos");
	}

}
