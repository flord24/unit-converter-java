package cs333;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private void openUnitConverter(ActionEvent event) {
        System.out.println("[MainController] Start clicked");

        // Use absolute classpath path to avoid "not found" issues.
        var url = getClass().getResource("/cs333/unitConverter.fxml");
        if (url == null) {
            showError("""
                Can't find /cs333/unitConverter.fxml on the classpath.
                Put the file at src/cs333/unitConverter.fxml (so it builds to bin/cs333/unitConverter.fxml).
            """);
            return;
        }

        try {
            FXMLLoader loader = new FXMLLoader(url);
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Unit Converter");
            stage.show();
        } catch (Exception ex) {
            // Surface real cause chain in a dialog so you can fix fast.
            StringBuilder sb = new StringBuilder("Failed to load unitConverter.fxml\n\n");
            Throwable c = ex;
            while (c != null) {
                sb.append(c.getClass().getName()).append(": ").append(c.getMessage()).append("\n");
                c = c.getCause();
            }
            ex.printStackTrace();
            showError(sb.toString());
        }
    }

    @FXML
    private void handleExit(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
    
    @FXML
    private void showAbout(ActionEvent event) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setHeaderText("About this app");
        a.setContentText("""
                Unit Converter
                JavaFX Project

                Quickly convert between common units like length,
                weight, temperature, and more.
                """);
        a.showAndWait();
    }


    private void showError(String msg) {
        Alert a = new Alert(Alert.AlertType.ERROR, msg);
        a.setHeaderText("Navigation Error");
        a.showAndWait();
    }
}




