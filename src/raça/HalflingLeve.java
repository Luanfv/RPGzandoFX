package ra�a;

public class HalflingLeve extends Halfling {

	private String nome = "Halfling P�s Leves";
	
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
