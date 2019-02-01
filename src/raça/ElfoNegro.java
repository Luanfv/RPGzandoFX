package raça;

public class ElfoNegro extends Elfo {
	
	private String nome = "Elfo Negro";
	
	public ElfoNegro() {
		addElfoNegro();
	}
	
	public String getNome() {
		return nome;
	}

	public void addElfoNegro() {
		addElfo();
		setCarisma(getCarisma() + 1);
	}

}
