package ra�a;

public class AnaoMontanha extends Anao {
	
	private String nome = "An�o da Montanha";
	
	public AnaoMontanha() {
		addAnaoMontanha();
	}
	
	public String getNome() {
		return nome;
	}

	public void addAnaoMontanha() {
		addAnao();
		setForca(getForca() + 2);
	}
	
}
