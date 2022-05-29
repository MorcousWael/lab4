package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {
    @FXML
    Button S_id;
    
    Alert alert = new Alert(Alert.AlertType.ERROR);
    @FXML
    public void SUB(ActionEvent e) throws IOException {
        S_id.setText("Submitted");
        alert.setTitle("successful operation");
        alert.setHeaderText("Successfully submitted");
        alert.show();
    }

}
