package raça;

public class ElfoAlto extends Elfo {

	private String nome = "Elfo Alto";
	
	public ElfoAlto() {
		addElfoAlto();
	}
	
	public String getNome() {
		return nome;
	}

	public void addElfoAlto() {
		addElfo();
		setInteligencia(getInteligencia() + 1);
	}

}
