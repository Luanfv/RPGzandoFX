package informações;

public class RacaPersonagem extends Atributos {

	private String racaNome;
	private int Rforca, Rdestreza, Rconstituicao, Rinteligencia, Rsabedoria, Rcarisma;

	public void addRaca(String nome, int forca, int destreza, int constituicao, int inteligencia, int sabedoria,
			int carisma) {
		setRacaNome(nome);
		setRforca(forca);
		setRdestreza(destreza);
		setRconstituicao(constituicao);
		setRinteligencia(inteligencia);
		setRsabedoria(sabedoria);
		setRcarisma(carisma);
	}

	public int getRforca() {
		return Rforca;
	}

	public void setRforca(int rforca) {
		Rforca = rforca;
	}

	public int getRdestreza() {
		return Rdestreza;
	}

	public void setRdestreza(int rdestreza) {
		Rdestreza = rdestreza;
	}

	public int getRconstituicao() {
		return Rconstituicao;
	}

	public void setRconstituicao(int rconstituicao) {
		Rconstituicao = rconstituicao;
	}

	public int getRinteligencia() {
		return Rinteligencia;
	}

	public void setRinteligencia(int rinteligencia) {
		Rinteligencia = rinteligencia;
	}

	public int getRsabedoria() {
		return Rsabedoria;
	}

	public void setRsabedoria(int rsabedoria) {
		Rsabedoria = rsabedoria;
	}

	public int getRcarisma() {
		return Rcarisma;
	}

	public void setRcarisma(int rcarisma) {
		Rcarisma = rcarisma;
	}

	public String getRacaNome() {
		return racaNome;
	}

	public void setRacaNome(String nome) {
		this.racaNome = nome;
	}

	@Override
	public String toString() {
		return "RacaPersonagem [racaNome=" + racaNome + "]";
	}

}
