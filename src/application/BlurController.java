package application;

import java.awt.Button;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class BlurController {
	
	private AnchorPane mypane;
	private Button btnSiguiente;
	
	private void openStage() {

		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));

			mypane = (AnchorPane) loader.load();

			Scene scene = new Scene(mypane);

			Stage stage = new Stage();

			stage.setScene(scene);

			stage.show();

		} catch (Exception e) {

			// TODO: handle exception

		}

		

	}
}
