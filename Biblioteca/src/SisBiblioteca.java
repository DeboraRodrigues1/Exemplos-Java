
public class SisBiblioteca {

	private String titulo;
	private String autor; 
	private String ano; 
	private String categoria; 
	private int posisao; 
	private boolean status;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPosisao() {
		return posisao;
	}

	public void setPosisao(int posisao) {
		this.posisao = posisao;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public SisBiblioteca(String titulo, String autor, String ano, String categoria, 
	int posisao, boolean status) {
		this.titulo    = titulo;
		this.autor     = autor;
		this.ano       =  ano;
		this.categoria = categoria;
		this.posisao   = posisao;
		this.status    = status;
		
	}
}
