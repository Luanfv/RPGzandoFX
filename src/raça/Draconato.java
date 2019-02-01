package raça;

public class Draconato extends Raca {

	private String nome = "Draconato";
	
	public Draconato() {
		addDraconato();
	}
	
	public void addDraconato() {
		setForca(getForca() + 2);
		setCarisma(getCarisma() + 1);
	}

	public String getNome() {
		return nome;
	}

}
