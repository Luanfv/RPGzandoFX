package raça;

public class GnomoPedra extends Gnomo {
	
	private String nome = "Gnomo da Pedra";
	
	public GnomoPedra() {
		addGnomoPedra();
	}
	
	public String getNome() {
		return nome;
	}

	public void addGnomoPedra() {
		addGnomo();
		setConstituicao(getConstituicao() + 1);
	}

}
