package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class ControllerWChoiceAge extends BaseController implements Initializable {

    public static final String URL_FXML = "WindowChoiceAge.fxml";

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonCount;

    @FXML
    private TextField textYears;

    @FXML
    private TextField textMonth;

    public static double getAge() {
        return age;
    }

    public static void setAge(double age) {
        ControllerWChoiceAge.age = age;
    }

    private static double age = 0;

    @FXML
    void buttonCountEnter(KeyEvent event) {
        pressCount();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buttonCount.setOnAction(event1 -> {
            pressCount();
        });
    }

    protected void pressCount() {
       // ControllerWChoiceAge
    }
}
