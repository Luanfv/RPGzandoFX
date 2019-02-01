package raça;

public class AnaoMontanha extends Anao {
	
	private String nome = "Anão da Montanha";
	
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
