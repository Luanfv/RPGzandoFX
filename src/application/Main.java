package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
			stage.setTitle("Criador de fichas RPG");
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.show();
			stage.setResizable(false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
