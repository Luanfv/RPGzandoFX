package raça;

public class ElfoFloresta extends Elfo {
	
	private String nome = "Elfo da Floresta";
	
	public ElfoFloresta() {
		addElfoFloresta();
	}
	
	public String getNome() {
		return nome;
	}

	public void addElfoFloresta() {
		addElfo();
		setSabedoria(getSabedoria() + 1);
	}

}
