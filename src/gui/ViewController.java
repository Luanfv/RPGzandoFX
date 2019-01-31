package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ViewController {

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
	
	@FXML
	public void onBtAnaoColinaAction() {
		try {
			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");
			
			lblRacaEscolha.setText("Anão da Colina");
			lblInfo1.setText("CON: +2");
			lblInfo2.setText("SAB: +1");
			
		}
		catch (Exception e) {
			
		}
	}
	
	@FXML
	public void onBtAnaoMontanhaAction() {
		try {
			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");
			
			lblRacaEscolha.setText("Anão da Montanha");
			lblInfo1.setText("CON: +2");
			lblInfo2.setText("FOR: +2");
			
		}
		catch (Exception e) {
			
		}
	}
	
	@FXML
	public void onBtDraconatoAction() {
		try {
			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");
			
			lblRacaEscolha.setText("Draconato");
			lblInfo1.setText("FOR: +2");
			lblInfo2.setText("CAR: +1");
			
		}
		catch (Exception e) {
			
		}
	}
	
	@FXML
	public void onBtElfoAltoAction() {
		try {
			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");
			
			lblRacaEscolha.setText("Elfo Alto");
			lblInfo1.setText("DES: +2");
			lblInfo2.setText("INT: +1");
			
		}
		catch (Exception e) {
			
		}
	}
	
	@FXML
	public void onBtElfoFlorestaAction() {
		try {
			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");
			
			lblRacaEscolha.setText("Elfo da Floresta");
			lblInfo1.setText("DES: +2");
			lblInfo2.setText("SAB: +1");
			
		}
		catch (Exception e) {
			
		}
	}
	
	@FXML
	public void onBtElfoNegroAction() {
		try {
			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");
			
			lblRacaEscolha.setText("Elfo Negro");
			lblInfo1.setText("DES: +2");
			lblInfo2.setText("CAR: +1");
			
		}
		catch (Exception e) {
			
		}
	}
	
	@FXML
	public void onBtGnomoFlorestaAction() {
		try {
			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");
			
			lblRacaEscolha.setText("Gnomo da Floresta");
			lblInfo1.setText("INT: +2");
			lblInfo2.setText("DES: +1");
			
		}
		catch (Exception e) {
			
		}
	}
	
	@FXML
	public void onBtGnomoPedraAction() {
		try {
			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");
			
			lblRacaEscolha.setText("Gnomo da Pedra");
			lblInfo1.setText("INT: +2");
			lblInfo2.setText("CON: +1");
			
		}
		catch (Exception e) {
			
		}
	}
	
	@FXML
	public void onBtHalflingLeveAction() {
		try {
			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");
			
			lblRacaEscolha.setText("Halfling Pés Leves");
			lblInfo1.setText("DES: +2");
			lblInfo2.setText("CAR: +1");
			
		}
		catch (Exception e) {
			
		}
	}
	
	@FXML
	public void onBtHalflingRobustoAction() {
		try {
			lblInfo1.setText("");
			lblInfo2.setText("");
			lblInfo3.setText("");
			lblInfo4.setText("");
			lblInfo5.setText("");
			lblInfo6.setText("");
			
			lblRacaEscolha.setText("Halfling Robusto");
			lblInfo1.setText("DES: +2");
			lblInfo2.setText("CON: +1");
			
		}
		catch (Exception e) {
			
		}
	}
	
	@FXML
	public void onBtHumanoAction() {
		try {
			lblRacaEscolha.setText("Humano");
			lblInfo1.setText("FOR: +1");
			lblInfo2.setText("DES: +1");
			lblInfo3.setText("CON: +1");
			lblInfo4.setText("INT: +1");
			lblInfo5.setText("SAB: +1");
			lblInfo6.setText("CAR: +1");
			
		}
		catch (Exception e) {
			
		}
	}
	
}
