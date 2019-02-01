package informações;

public class TotalAtributos extends ClassePersonagem {

	public void addAtributos(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma) {
		setForca(getForca() + forca);
		setDestreza(getDestreza() + destreza);
		setConstituicao(getConstituicao() + constituicao);
		setInteligencia(getInteligencia() + inteligencia);
		setSabedoria(getSabedoria() + sabedoria);
		setCarisma(getCarisma() + carisma);
	}	
}
