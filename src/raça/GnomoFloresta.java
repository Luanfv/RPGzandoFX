package raça;

public class GnomoFloresta extends Gnomo {

	private String nome = "Gnomo da Floresta";
	
	public GnomoFloresta() {
		addGnomoFloresta();
	}
	
	public String getNome() {
		return nome;
	}

	public void addGnomoFloresta() {
		addGnomo();
		setDestreza(getDestreza() + 1);
	}
	
}
