package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class ControllerWChoicePet extends BaseController implements Initializable {

    public static final String URL_FXML = "WindowChoicePet.fxml";

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label label;

    int x = 0;

    @FXML
    void initialize(MouseEvent event) {
        for (int i = 0; i < 10000; i++) {
            x++;
            System.out.println(x);
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    System.out.println(x);
                    label.setText("" + x);
                }
            });
        }
        System.exit(0);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
