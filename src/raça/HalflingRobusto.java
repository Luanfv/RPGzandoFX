package raça;

public class HalflingRobusto extends Halfling {

	private String nome = "Halfling Robusto";
	
	public HalflingRobusto() {
		addHalflingRobusto();
	}
	
	public String getNome(){
		return nome;
	}
	
	public void addHalflingRobusto() {
		addHalfling();
		setConstituicao(getConstituicao() + 1);
	}

}
