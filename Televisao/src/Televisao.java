public class Televisao {
	// Informações sobre a TV
	private String marca;
	private int voltagem;
	private int tamanho;
	private boolean ligada;
	private int volume;
	private int canal;

	//Declarando construtor
	public Televisao(String marca,int voltagem, int tamanho) {
		this.marca = marca;
		this.voltagem = voltagem;
		this.tamanho = tamanho;
		this.ligada = false;
		this.volume = 5;
		this.canal = 1;
	}
	
	//criando Setters e Getters
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setVolume(int volume) {
		this.volume = volume;

	}

	public int getVolume() {
		return volume;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getCanal() {
		return canal;
	}

	void switchPower() {
		ligada = !ligada;
		System.out.println("A TV " + marca + " está " + ((ligada) ? "ligada" : "desligada"));
		// Operador ternario de atribuição condicional
		/*
		 * ( <TesteLogico> ) <ValorSeTesteForVerdadeiro : <ValorSeTesteForFalso>
		 * 
		 */
	}

	void aumentarVolume() {
		if (ligada == true) {
			if (volume < 10) {
				volume++;
				System.out.println("A TV " + marca + " está no volume " + volume);
			} else {
				volume = 10;
				System.out.print("O volume está no máximo");
			}
		} else {
			System.out.print("Por favor, primeiro ligue a TV");
		}
	}

	void diminuirVolume() {
		volume--;
		System.out.println("A TV " + marca + " está no volume " + volume);
	}

	void avancarCanal() {

	}
}
