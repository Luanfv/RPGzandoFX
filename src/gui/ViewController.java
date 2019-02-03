package gui;

import java.util.Random;

import classes.Barbaro;
import classes.Bardo;
import classes.Bruxo;
import classes.Clerigo;
import classes.Druida;
import classes.Feiticeiro;
import classes.Guerreiro;
import classes.Ladino;
import classes.Mago;
import classes.Monge;
import classes.Paladino;
import classes.Patrulheiro;
import informações.Personagem;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import raça.AnaoColina;
import raça.AnaoMontanha;
import raça.Draconato;
import raça.ElfoAlto;
import raça.ElfoFloresta;
import raça.ElfoNegro;
import raça.GnomoFloresta;
import raça.GnomoPedra;
import raça.HalflingLeve;
import raça.HalflingRobusto;
import raça.Humano;

public class ViewController {

	@FXML
	private Label lblAcrobacia;
	
	@FXML
	private Label lblArcanismo;
	
	@FXML 
	private Label lblAtletismo;
	
	@FXML 
	private Label lblAtuacao;
	
	@FXML 
	private Label lblBlefar;
	
	@FXML
	private Label lblFurtividade;
	
	@FXML
	private Label lblHistoria;
	
	@FXML
	private Label lblIntimidacao;
	
	@FXML
	private Label lblIntuicao;
	
	@FXML
	private Label lblInvestigacao;
	
	@FXML
	private Label lblLidarAnimais;
	
	@FXML
	private Label lblMedicina;
	
	@FXML
	private Label lblNatureza;
	
	@FXML
	private Label lblPercepcao;
	
	@FXML
	private Label lblPersuasao;
	
	@FXML
	private Label lblPrestidigitacao;
	
	@FXML
	private Label lblReligiao;
	
	@FXML
	private Label lblSobrevivencia;

	@FXML
	private Label lblInfoResistencia;

	@FXML
	private Label lblVantagemResistencia1;

	@FXML
	private Label lblVantagemResistencia2;

	@FXML
	private Label lblResistenciaFor;

	@FXML
	private Label lblResistenciaDes;

	@FXML
	private Label lblResistenciaCon;

	@FXML
	private Label lblResistenciaInt;

	@FXML
	private Label lblResistenciaSab;

	@FXML
	private Label lblResistenciaCar;

	@FXML
	private Label lblProficiencia;

	@FXML
	private Label lblMFor;

	@FXML
	private Label lblMDes;

	@FXML
	private Label lblMCon;

	@FXML
	private Label lblMInt;

	@FXML
	private Label lblMSab;

	@FXML
	private Label lblMCar;

	@FXML
	private TextField txtFor;

	@FXML
	private TextField txtDes;

	@FXML
	private TextField txtCon;

	@FXML
	private TextField txtInt;

	@FXML
	private TextField txtSab;

	@FXML
	private TextField txtCar;

	@FXML
	private TextField txtNome;

	@FXML
	private TextField txtNivel;

	@FXML
	private Label lblNome;

	@FXML
	private Label lblNivel;

	@FXML
	private Label lblHp;

	@FXML
	private Label lblClasse;

	@FXML
	private Label lblRaca;

	@FXML
	private Button btnBarbaro;

	@FXML
	private Button btnBardo;

	@FXML
	private Button btnBruxo;

	@FXML
	private Button btnClerigo;

	@FXML
	private Button btnDruida;

	@FXML
	private Button btnFeiticeiro;

	@FXML
	private Button btnGuerreiro;

	@FXML
	private Button btnLadino;

	@FXML
	private Button btnMago;

	@FXML
	private Button btnMonge;

	@FXML
	private Button btnPaladino;

	@FXML
	private Button btnPatrulhiero;

	@FXML
	private Button btnConfirmar;

	@FXML
	private Label lblClasseEscolha;

	@FXML
	private Label lblFor;

	@FXML
	private Label lblDes;

	@FXML
	private Label lblCon;

	@FXML
	private Label lblInt;

	@FXML
	private Label lblSab;

	@FXML
	private Label lblCar;

	@FXML
	private Button btnAnaoColina;

	@FXML
	private Button btnAnaoMontanha;

	@FXML
	private Button btnDraconato;

	@FXML
	private Button btnElfoAlto;

	@FXML
	private Button btnElfoFloresta;

	@FXML
	private Button btnElfoNegro;

	@FXML
	private Button btnGnomoFloresta;

	@FXML
	private Button btnGnomoPedra;

	@FXML
	private Button btnHalflingLeve;

	@FXML
	private Button btnHalflingRobusto;

	@FXML
	private Button btnHumano;

	@FXML
	private Label lblRacaEscolha;

	@FXML
	private Label lblInfo1;

	@FXML
	private Label lblInfo2;

	@FXML
	private Label lblInfo3;

	@FXML
	private Label lblInfo4;

	@FXML
	private Label lblInfo5;

	@FXML
	private Label lblInfo6;

	private Personagem personagem = new Personagem();

	@FXML
	public void onBtAnaoColinaAction() {
		try {
			AnaoColina anaoColina = new AnaoColina();

			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");

			lblRacaEscolha.setText(anaoColina.getNome());
			lblInfo1.setText("CON: +2");
			lblInfo2.setText("SAB: +1");

			personagem.addRaca(anaoColina.getNome(), anaoColina.getForca(), anaoColina.getDestreza(),
					anaoColina.getConstituicao(), anaoColina.getInteligencia(), anaoColina.getSabedoria(),
					anaoColina.getCarisma());

		} catch (Exception e) {

		}
	}

	@FXML
	public void onBtAnaoMontanhaAction() {
		try {
			AnaoMontanha anaoMontanha = new AnaoMontanha();

			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");

			lblRacaEscolha.setText("Anão da Montanha");
			lblInfo1.setText("CON: +2");
			lblInfo2.setText("FOR: +2");

			personagem.addRaca(anaoMontanha.getNome(), anaoMontanha.getForca(), anaoMontanha.getDestreza(),
					anaoMontanha.getConstituicao(), anaoMontanha.getInteligencia(), anaoMontanha.getSabedoria(),
					anaoMontanha.getCarisma());
		} catch (Exception e) {

		}
	}

	@FXML
	public void onBtDraconatoAction() {
		try {
			Draconato draconato = new Draconato();

			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");

			lblRacaEscolha.setText("Draconato");
			lblInfo1.setText("FOR: +2");
			lblInfo2.setText("CAR: +1");

			personagem.addRaca(draconato.getNome(), draconato.getForca(), draconato.getDestreza(),
					draconato.getConstituicao(), draconato.getInteligencia(), draconato.getSabedoria(),
					draconato.getCarisma());

		} catch (Exception e) {

		}
	}

	@FXML
	public void onBtElfoAltoAction() {
		try {
			ElfoAlto elfoAlto = new ElfoAlto();

			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");

			lblRacaEscolha.setText("Elfo Alto");
			lblInfo1.setText("DES: +2");
			lblInfo2.setText("INT: +1");

			personagem.addRaca(elfoAlto.getNome(), elfoAlto.getForca(), elfoAlto.getDestreza(),
					elfoAlto.getConstituicao(), elfoAlto.getInteligencia(), elfoAlto.getSabedoria(),
					elfoAlto.getCarisma());

		} catch (Exception e) {

		}
	}

	@FXML
	public void onBtElfoFlorestaAction() {
		try {
			ElfoFloresta elfoFloresta = new ElfoFloresta();

			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");

			lblRacaEscolha.setText("Elfo da Floresta");
			lblInfo1.setText("DES: +2");
			lblInfo2.setText("SAB: +1");

			personagem.addRaca(elfoFloresta.getNome(), elfoFloresta.getForca(), elfoFloresta.getDestreza(),
					elfoFloresta.getConstituicao(), elfoFloresta.getInteligencia(), elfoFloresta.getSabedoria(),
					elfoFloresta.getCarisma());

		} catch (Exception e) {

		}
	}

	@FXML
	public void onBtElfoNegroAction() {
		try {
			ElfoNegro elfoNegro = new ElfoNegro();

			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");

			lblRacaEscolha.setText("Elfo Negro");
			lblInfo1.setText("DES: +2");
			lblInfo2.setText("CAR: +1");

			personagem.addRaca(elfoNegro.getNome(), elfoNegro.getForca(), elfoNegro.getDestreza(),
					elfoNegro.getConstituicao(), elfoNegro.getInteligencia(), elfoNegro.getSabedoria(),
					elfoNegro.getCarisma());

		} catch (Exception e) {

		}
	}

	@FXML
	public void onBtGnomoFlorestaAction() {
		try {
			GnomoFloresta gnomoFloresta = new GnomoFloresta();

			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");

			lblRacaEscolha.setText("Gnomo da Floresta");
			lblInfo1.setText("INT: +2");
			lblInfo2.setText("DES: +1");

			personagem.addRaca(gnomoFloresta.getNome(), gnomoFloresta.getForca(), gnomoFloresta.getDestreza(),
					gnomoFloresta.getConstituicao(), gnomoFloresta.getInteligencia(), gnomoFloresta.getSabedoria(),
					gnomoFloresta.getCarisma());

		} catch (Exception e) {

		}
	}

	@FXML
	public void onBtGnomoPedraAction() {
		try {
			GnomoPedra gnomoPedra = new GnomoPedra();

			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");

			lblRacaEscolha.setText("Gnomo da Pedra");
			lblInfo1.setText("INT: +2");
			lblInfo2.setText("CON: +1");

			personagem.addRaca(gnomoPedra.getNome(), gnomoPedra.getForca(), gnomoPedra.getDestreza(),
					gnomoPedra.getConstituicao(), gnomoPedra.getInteligencia(), gnomoPedra.getSabedoria(),
					gnomoPedra.getCarisma());

		} catch (Exception e) {

		}
	}

	@FXML
	public void onBtHalflingLeveAction() {
		try {
			HalflingLeve halflingLeve = new HalflingLeve();

			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");

			lblRacaEscolha.setText("Halfling Pés Leves");
			lblInfo1.setText("DES: +2");
			lblInfo2.setText("CAR: +1");

			personagem.addRaca(halflingLeve.getNome(), halflingLeve.getForca(), halflingLeve.getDestreza(),
					halflingLeve.getConstituicao(), halflingLeve.getInteligencia(), halflingLeve.getSabedoria(),
					halflingLeve.getCarisma());

		} catch (Exception e) {

		}
	}

	@FXML
	public void onBtHalflingRobustoAction() {
		try {
			HalflingRobusto halflingRobusto = new HalflingRobusto();

			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");

			lblRacaEscolha.setText("Halfling Robusto");
			lblInfo1.setText("DES: +2");
			lblInfo2.setText("CON: +1");

			personagem.addRaca(halflingRobusto.getNome(), halflingRobusto.getForca(), halflingRobusto.getDestreza(),
					halflingRobusto.getConstituicao(), halflingRobusto.getInteligencia(),
					halflingRobusto.getSabedoria(), halflingRobusto.getCarisma());

		} catch (Exception e) {

		}
	}

	@FXML
	public void onBtHumanoAction() {
		try {
			Humano humano = new Humano();

			lblRacaEscolha.setText("Humano");
			lblInfo1.setText("FOR: +1");
			lblInfo2.setText("DES: +1");
			lblInfo3.setText("CON: +1");
			lblInfo4.setText("INT: +1");
			lblInfo5.setText("SAB: +1");
			lblInfo6.setText("CAR: +1");

			personagem.addRaca(humano.getNome(), humano.getForca(), humano.getDestreza(), humano.getConstituicao(),
					humano.getInteligencia(), humano.getSabedoria(), humano.getCarisma());

		} catch (Exception e) {

		}
	}

	@FXML
	public void onBtConfirmarAction() {
		try {
			personagem.setForca(Integer.parseInt(txtFor.getText()) + personagem.getRforca());
			personagem.setDestreza(Integer.parseInt(txtDes.getText()) + personagem.getRdestreza());
			personagem.setConstituicao(Integer.parseInt(txtCon.getText()) + personagem.getRconstituicao());
			personagem.setInteligencia(Integer.parseInt(txtInt.getText()) + personagem.getRinteligencia());
			personagem.setSabedoria(Integer.parseInt(txtSab.getText()) + personagem.getRsabedoria());
			personagem.setCarisma(Integer.parseInt(txtCar.getText()) + personagem.getRcarisma());

			personagem.setNome(txtNome.getText());
			personagem.setNivel(Integer.parseInt(txtNivel.getText()));
			
			personagem.att();

			lblAcrobacia.setText(String.format("%d", personagem.getAcrobacia()));
			lblArcanismo.setText(String.format("%d", personagem.getArcanismo()));
			lblAtletismo.setText(String.format("%d", personagem.getAtletismo()));
			lblAtuacao.setText(String.format("%d", personagem.getAtuacao()));
			lblBlefar.setText(String.format("%d", personagem.getBlefar()));
			lblFurtividade.setText(String.format("%d", personagem.getFurtividade()));
			lblHistoria.setText(String.format("%d", personagem.getHistoria()));
			lblIntimidacao.setText(String.format("%d", personagem.getIntimidacao()));
			lblIntuicao.setText(String.format("%d", personagem.getIntuicao()));
			lblInvestigacao.setText(String.format("%d", personagem.getInvestigacao()));
			lblLidarAnimais.setText(String.format("%d", personagem.getLidarAnimais()));
			lblMedicina.setText(String.format("%d", personagem.getMedicina()));
			lblNatureza.setText(String.format("%d", personagem.getNatureza()));
			lblPercepcao.setText(String.format("%d", personagem.getPercepcao()));
			lblPersuasao.setText(String.format("%d", personagem.getPersuasao()));
			lblPrestidigitacao.setText(String.format("%d", personagem.getPrestidigitacao()));
			lblReligiao.setText(String.format("%d", personagem.getReligiao()));
			lblSobrevivencia.setText(String.format("%d", personagem.getSobrevivencia()));

			lblProficiencia.setText(String.format("%d", personagem.getProficiencia()));

			lblFor.setText(String.format("%d", personagem.getForca()));
			lblDes.setText(String.format("%d", personagem.getDestreza()));
			lblCon.setText(String.format("%d", personagem.getConstituicao()));
			lblInt.setText(String.format("%d", personagem.getInteligencia()));
			lblSab.setText(String.format("%d", personagem.getSabedoria()));
			lblCar.setText(String.format("%d", personagem.getCarisma()));

			lblMFor.setText(personagem.getMforcalbl());
			lblMDes.setText(personagem.getMdestrezalbl());
			lblMCon.setText(personagem.getMconstituicaolbl());
			lblMInt.setText(personagem.getMinteligencialbl());
			lblMSab.setText(personagem.getMsabedorialbl());
			lblMCar.setText(personagem.getMcarismalbl());

			lblResistenciaFor.setText(String.format("%d", personagem.getResistenciaForca()));
			lblResistenciaDes.setText(String.format("%d", personagem.getResistenciaDestreza()));
			lblResistenciaCon.setText(String.format("%d", personagem.getResistenciaConstituicao()));
			lblResistenciaInt.setText(String.format("%d", personagem.getResistenciaInteligencia()));
			lblResistenciaSab.setText(String.format("%d", personagem.getResistenciaSabedoria()));
			lblResistenciaCar.setText(String.format("%d", personagem.getResistenciaCarisma()));

			lblNome.setText(personagem.getNome());
			lblNivel.setText(String.format("%d", personagem.getNivel()));
			lblRaca.setText(personagem.getRacaNome());
			lblClasse.setText(personagem.getClasseNome());

			personagem.setHp(0);

			for (int i = 0; i < personagem.getNivel(); i++) {
				Random x = new Random();
				int aleatorio = (x.nextInt(personagem.getVidaLvl()) + 1);
				personagem.setHp(personagem.getHp() + (aleatorio + personagem.getMconstituicao()));
			}

			lblHp.setText(String.format("%d", personagem.getHp()));
		} catch (Exception e) {
			System.out.println("ERRO");
		}
	}

	@FXML
	public void onBtBarbaroAction() {
		Barbaro barbaro = new Barbaro();
		lblClasseEscolha.setText("HP: 1D" + barbaro.getVidaLvl() + " por nivel");
		lblInfoResistencia.setText("VANTAGENS EM TESTE DE RESISTENCIA:");
		lblVantagemResistencia1.setText("Força");
		lblVantagemResistencia2.setText("Constituição");

		personagem.addClasse(barbaro.getNome(), barbaro.getVidaLvl());
	}

	@FXML
	public void onBtBardoAction() {
		Bardo bardo = new Bardo();
		lblClasseEscolha.setText("HP: 1D" + bardo.getVidaLvl() + " por nivel");
		lblInfoResistencia.setText("VANTAGENS EM TESTE DE RESISTENCIA:");
		lblVantagemResistencia1.setText("Destreza");
		lblVantagemResistencia2.setText("Carisma");

		personagem.addClasse(bardo.getNome(), bardo.getVidaLvl());
	}

	@FXML
	public void onBtBruxoAction() {
		Bruxo bruxo = new Bruxo();
		lblClasseEscolha.setText("HP: 1D" + bruxo.getVidaLvl() + " por nivel");
		lblInfoResistencia.setText("VANTAGENS EM TESTE DE RESISTENCIA:");
		lblVantagemResistencia1.setText("Sabedoria");
		lblVantagemResistencia2.setText("Carisma");

		personagem.addClasse(bruxo.getNome(), bruxo.getVidaLvl());
	}

	@FXML
	public void onBtClerigoAction() {
		Clerigo clerigo = new Clerigo();
		lblClasseEscolha.setText("HP: 1D" + clerigo.getVidaLvl() + " por nivel");
		lblInfoResistencia.setText("VANTAGENS EM TESTE DE RESISTENCIA:");
		lblVantagemResistencia1.setText("Sabedoria");
		lblVantagemResistencia2.setText("Carisma");

		personagem.addClasse(clerigo.getNome(), clerigo.getVidaLvl());
	}

	@FXML
	public void onBtDruidaAction() {
		Druida druida = new Druida();
		lblClasseEscolha.setText("HP: 1D" + druida.getVidaLvl() + " por nivel");
		lblInfoResistencia.setText("VANTAGENS EM TESTE DE RESISTENCIA:");
		lblVantagemResistencia1.setText("Inteligencia");
		lblVantagemResistencia2.setText("Sabedoria");

		personagem.addClasse(druida.getNome(), druida.getVidaLvl());
	}

	@FXML
	public void onBtFeiticeiroAction() {
		Feiticeiro feiticeiro = new Feiticeiro();
		lblClasseEscolha.setText("HP: 1D" + feiticeiro.getVidaLvl() + " por nivel");
		lblInfoResistencia.setText("VANTAGENS EM TESTE DE RESISTENCIA:");
		lblVantagemResistencia1.setText("Constituição");
		lblVantagemResistencia2.setText("Carisma");

		personagem.addClasse(feiticeiro.getNome(), feiticeiro.getVidaLvl());
	}

	@FXML
	public void onBtGuerreiroAction() {
		Guerreiro guerreiro = new Guerreiro();
		lblClasseEscolha.setText("HP: 1D" + guerreiro.getVidaLvl() + " por nivel");
		lblInfoResistencia.setText("VANTAGENS EM TESTE DE RESISTENCIA:");
		lblVantagemResistencia1.setText("Força");
		lblVantagemResistencia2.setText("Constituição");

		personagem.addClasse(guerreiro.getNome(), guerreiro.getVidaLvl());
	}

	@FXML
	public void onBtLadinoAction() {
		Ladino ladino = new Ladino();
		lblClasseEscolha.setText("HP: 1D" + ladino.getVidaLvl() + " por nivel");
		lblInfoResistencia.setText("VANTAGENS EM TESTE DE RESISTENCIA:");
		lblVantagemResistencia1.setText("Destreza");
		lblVantagemResistencia2.setText("Inteligencia");

		personagem.addClasse(ladino.getNome(), ladino.getVidaLvl());
	}

	@FXML
	public void onBtMagoAction() {
		Mago mago = new Mago();
		lblClasseEscolha.setText("HP: 1D" + mago.getVidaLvl() + " por nivel");
		lblInfoResistencia.setText("VANTAGENS EM TESTE DE RESISTENCIA:");
		lblVantagemResistencia1.setText("Inteligencia");
		lblVantagemResistencia2.setText("Sabedoria");

		personagem.addClasse(mago.getNome(), mago.getVidaLvl());
	}

	@FXML
	public void onBtMongeAction() {
		Monge monge = new Monge();
		lblClasseEscolha.setText("HP: 1D" + monge.getVidaLvl() + " por nivel");
		lblInfoResistencia.setText("VANTAGENS EM TESTE DE RESISTENCIA:");
		lblVantagemResistencia1.setText("Força");
		lblVantagemResistencia2.setText("Destreza");

		personagem.addClasse(monge.getNome(), monge.getVidaLvl());
	}

	@FXML
	public void onBtPaladinoAction() {
		Paladino paladino = new Paladino();
		lblClasseEscolha.setText("HP: 1D" + paladino.getVidaLvl() + " por nivel");
		lblInfoResistencia.setText("VANTAGENS EM TESTE DE RESISTENCIA:");
		lblVantagemResistencia1.setText("Sabedoria");
		lblVantagemResistencia2.setText("Carisma");

		personagem.addClasse(paladino.getNome(), paladino.getVidaLvl());
	}

	@FXML
	public void onBtPatrulheiroAction() {
		Patrulheiro patrulheiro = new Patrulheiro();
		lblClasseEscolha.setText("HP: 1D" + patrulheiro.getVidaLvl() + " por nivel");
		lblInfoResistencia.setText("VANTAGENS EM TESTE DE RESISTENCIA:");
		lblVantagemResistencia1.setText("Força");
		lblVantagemResistencia2.setText("Destreza");

		personagem.addClasse(patrulheiro.getNome(), patrulheiro.getVidaLvl());
	}

}
