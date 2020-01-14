package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label label;

    @FXML
    void initialize(MouseEvent event) {

        System.exit(0);
    }

    @FXML
    void initialize() {

    }
}
