package informações;


public final class Personagem extends PericiasPersonagem {
	
	private String nome;
	
	public void att() {
		addPericias();
		proficienciaClasseLvl();
		addTesteResistencia();
		addModificador();
		addPericias();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}