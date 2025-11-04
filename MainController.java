package cs333;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MainController {

    @FXML
    private void handleStart(ActionEvent event) throws IOException {
        // Load the main screen FXML file
        Parent mainScreen = FXMLLoader.load(getClass().getResource("MainMenuUC.fxml"));
        Scene mainScene = new Scene(mainScreen);

        // Get the current stage (window)
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Switch the scene
        stage.setScene(mainScene);
        stage.show();
    }
}
