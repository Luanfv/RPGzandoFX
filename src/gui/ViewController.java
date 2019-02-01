package gui;

import informações.Personagem;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
	private Button btnConfirmar;
	
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
			
		}
		catch (Exception e) {
			
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
		}
		catch (Exception e) {
			
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
			
		}
		catch (Exception e) {
			
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
			
		}
		catch (Exception e) {
			
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
			
		}
		catch (Exception e) {
			
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
			
		}
		catch (Exception e) {
			
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
					gnomoFloresta.getConstituicao(), gnomoFloresta.getInteligencia(),
					gnomoFloresta.getSabedoria(), gnomoFloresta.getCarisma());
			
		}
		catch (Exception e) {
			
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
			
		}
		catch (Exception e) {
			
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
			
		}
		catch (Exception e) {
			
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
			
			personagem.addRaca(halflingRobusto.getNome(), halflingRobusto.getForca(),
					halflingRobusto.getDestreza(), halflingRobusto.getConstituicao(),
					halflingRobusto.getInteligencia(), halflingRobusto.getSabedoria(),
					halflingRobusto.getCarisma());
			
		}
		catch (Exception e) {
			
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
			
			personagem.addRaca(humano.getNome(), humano.getForca(), humano.getDestreza(),
					humano.getConstituicao(), humano.getInteligencia(), humano.getSabedoria(),
					humano.getCarisma());
			
		}
		catch (Exception e) {
			
		}
	}
	
	@FXML
	public void onBtConfirmarAction() {
		lblFor.setText(String.format("%d", personagem.getForca()));
		lblDes.setText(String.format("%d", personagem.getDestreza()));
		lblCon.setText(String.format("%d", personagem.getConstituicao()));
		lblInt.setText(String.format("%d", personagem.getInteligencia()));
		lblSab.setText(String.format("%d", personagem.getSabedoria()));
		lblCar.setText(String.format("%d", personagem.getCarisma()));
	}
	
}
