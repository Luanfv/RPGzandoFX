package ra�a;

public class Anao extends Raca{
	
	public void addAnao() {
		setConstituicao(getConstituicao() + 2);
	}
	
	public String toString() {
		return "An�o%nCON: +" + (getConstituicao() + 2);
	}

}
