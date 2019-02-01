package raça;

public class Humano extends Raca {

	private String nome = "Humano";
	
	public Humano() {
		addHumano();
	}
	
	public String getNome() {
		return this.nome;
	}

	public void addHumano() {
		setForca(getForca() + 1);
		setDestreza(getDestreza() + 1);
		setConstituicao(getConstituicao() + 1);
		setInteligencia(getInteligencia() + 1);
		setSabedoria(getSabedoria() + 1);
		setCarisma(getCarisma() + 1);
	}

}
