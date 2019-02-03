package informações;

public class TesteDeResistencia extends Proficiencia {
	
	private int resistenciaForca, resistenciaDestreza, resistenciaConstituicao, resistenciaInteligencia, resistenciaSabedoria, resistenciaCarisma;
	
	public void addTesteResistencia() {
		
		setResistenciaForca(0);
		setResistenciaDestreza(0);
		setResistenciaConstituicao(0);
		setResistenciaInteligencia(0);
		setResistenciaSabedoria(0);
		setResistenciaCarisma(0);
		
		addModificador();
	
		setResistenciaForca(getMforca());
		setResistenciaDestreza(getMdestreza());
		setResistenciaConstituicao(getMconstituicao());
		setResistenciaInteligencia(getMinteligencia());
		setResistenciaSabedoria(getMsabedoria());
		setResistenciaCarisma(getMcarisma());
		
		if(getClasseNome() == "Barbaro") {
			setResistenciaForca(getProficiencia() + getResistenciaForca());
			setResistenciaConstituicao(getProficiencia() + getResistenciaConstituicao());
		}
		else if(getClasseNome() == "Bardo") {
			setResistenciaDestreza(getProficiencia() + getResistenciaDestreza());
			setResistenciaCarisma(getProficiencia() + getResistenciaCarisma());
		}
		else if(getClasseNome() == "Bruxo") {
			setResistenciaSabedoria(getProficiencia() + getResistenciaSabedoria());
			setResistenciaCarisma(getProficiencia() + getResistenciaCarisma());
		}
		else if(getClasseNome() == "Clerigo") {
			setResistenciaSabedoria(getProficiencia() + getResistenciaSabedoria());
			setResistenciaCarisma(getProficiencia() + getResistenciaCarisma());
		}
		else if(getClasseNome() == "Druida") {
			setResistenciaInteligencia(getProficiencia() + getResistenciaInteligencia());
			setResistenciaSabedoria(getProficiencia() + getResistenciaSabedoria());
		}
		else if(getClasseNome() == "Feiticeiro") {
			setResistenciaConstituicao(getProficiencia() + getResistenciaConstituicao());
			setResistenciaCarisma(getProficiencia() + getResistenciaCarisma());
		}
		else if(getClasseNome() == "Guerreiro") {
			setResistenciaForca(getProficiencia() + getResistenciaForca());
			setResistenciaConstituicao(getProficiencia() + getResistenciaConstituicao());
		}
		else if(getClasseNome() == "Ladino") {
			setResistenciaDestreza(getProficiencia() + getResistenciaDestreza());
			setResistenciaInteligencia(getProficiencia() + getResistenciaInteligencia());
		}
		else if(getClasseNome() == "Mago") {
			setResistenciaInteligencia(getProficiencia() + getResistenciaInteligencia());
			setResistenciaSabedoria(getProficiencia() + getResistenciaSabedoria());
		}
		else if(getClasseNome() == "Monge") {
			setResistenciaForca(getProficiencia() + getResistenciaForca());
			setResistenciaDestreza(getProficiencia() + getResistenciaDestreza());
		}
		else if(getClasseNome() == "Paladino") {
			setResistenciaSabedoria(getProficiencia() + getResistenciaSabedoria());
			setResistenciaCarisma(getProficiencia() + getResistenciaCarisma());
		}
		else if(getClasseNome() == "Patrulheiro") {
			setResistenciaForca(getProficiencia() + getResistenciaForca());
			setResistenciaDestreza(getProficiencia() + getResistenciaDestreza());
		}
		
		else {
			System.out.print("ALGO DEU ERRADO");
		}
	}

	public int getResistenciaForca() {
		return resistenciaForca;
	}

	protected void setResistenciaForca(int resistenciaForca) {
		this.resistenciaForca = resistenciaForca;
	}

	public int getResistenciaDestreza() {
		return resistenciaDestreza;
	}

	protected void setResistenciaDestreza(int resistenciaDestreza) {
		this.resistenciaDestreza = resistenciaDestreza;
	}

	public int getResistenciaConstituicao() {
		return resistenciaConstituicao;
	}

	protected void setResistenciaConstituicao(int resistenciaConstituicao) {
		this.resistenciaConstituicao = resistenciaConstituicao;
	}

	public int getResistenciaInteligencia() {
		return resistenciaInteligencia;
	}

	protected void setResistenciaInteligencia(int resistenciaInteligencia) {
		this.resistenciaInteligencia = resistenciaInteligencia;
	}

	public int getResistenciaSabedoria() {
		return resistenciaSabedoria;
	}

	protected void setResistenciaSabedoria(int resistenciaSabedoria) {
		this.resistenciaSabedoria = resistenciaSabedoria;
	}

	public int getResistenciaCarisma() {
		return resistenciaCarisma;
	}

	protected void setResistenciaCarisma(int resistenciaCarisma) {
		this.resistenciaCarisma = resistenciaCarisma;
	}

	public String toStringResistencia() {
		return "TESTE DE RESISTENCIA"
				+ "%n%nForça: "
				+ getResistenciaForca()
				+ "%nDestreza: "
				+ getResistenciaDestreza()
				+ "%nConstituição: "
				+ getResistenciaConstituicao()
				+ "%nInteligenca: "
				+ getResistenciaInteligencia()
				+ "%nSabedoria: "
				+ getResistenciaSabedoria()
				+ "%nCarisma: "
				+ getResistenciaCarisma();
		
	}
	
}
