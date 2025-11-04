package cs333;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class UnitConverter extends Application {

	@Override
	public void start(Stage stage) {
		try {
			// Load MAIN MENU first
			URL fxml = getClass().getResource("MainMenuUC.fxml");
			if (fxml == null)
				throw new IllegalStateException("Could not load MainMenu.fxml. Make sure it's in the cs333 package.");

			Parent root = FXMLLoader.load(fxml);
			Scene scene = new Scene(root, 600, 400);
			stage.setTitle("Main Menu");
			stage.setResizable(false);
			stage.setScene(scene);
			stage.show();
			root.requestFocus();

		} catch (Throwable t) {
			t.printStackTrace();
			Alert a = new Alert(Alert.AlertType.ERROR, "Startup Error: " + t.getMessage());
			a.setHeaderText("Startup Error");
			a.showAndWait();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
