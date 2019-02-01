package raça;

public class HalflingLeve extends Halfling {

	private String nome = "Halfling Pés Leves";
	
	public HalflingLeve() {
		addHalflingLeve();
	}

	public String getNome(){
		return nome;
	}
	
	public void addHalflingLeve() {
		addHalfling();
		setCarisma(getCarisma() + 1);
	}
}
