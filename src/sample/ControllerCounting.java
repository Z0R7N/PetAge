package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;

public class ControllerCounting extends BaseController implements Initializable {

    public static final String URL_FXML = "WindowCounting.fxml";

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label labelDifYear;

    @FXML
    private Button buttonChoicePet;

    @FXML
    private Label labelHumanYear;

    @FXML
    private Button buttonChoiceAge;

    public static int getHumanAge() {
        return humanAge;
    }

    public static void setHumanAge(int humanAge) {
        ControllerCounting.humanAge = humanAge;
    }

    private static int humanAge;

    @FXML
    void buttonChoicePet(KeyEvent event) {
        choicePet();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (humanAge % 10 == 1 && humanAge < 8 || humanAge > 20) {
            labelDifYear.setText("год");
        }
        if (humanAge % 10 > 1 && humanAge % 10 < 5 && humanAge < 8 || humanAge > 20){
            labelDifYear.setText("года");
        }
        labelHumanYear.setText(String.valueOf(humanAge));
        buttonChoicePet.setOnAction(event -> {
            choicePet();
        });
        buttonChoiceAge.setOnAction(event -> {
            choiceAge();
        });
    }

    @Override
    public void PreShowing() {
        super.PreShowing();
    }

    public void choicePet() {
        Main.getNavigation().load(ControllerWChoicePet.URL_FXML).Show();
    }

    public void choiceAge() {
        Main.getNavigation().load(ControllerWChoiceAge.URL_FXML).Show();
    }
}
