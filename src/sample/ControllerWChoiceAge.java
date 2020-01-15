package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
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

    @FXML
    private Label labelYearMax;

    @FXML
    private Slider labelYear;

    @FXML
    private Label labelMonthMax;

    public static double getAge() {
        return age;
    }

    public static void setAge(double age) {
        ControllerWChoiceAge.age = age;
    }

    private static double age = 0;

    public static String getPet() {
        return pet;
    }

    public static void setPet(String pet) {
        ControllerWChoiceAge.pet = pet;
    }

    private static String pet = null;
    static int ageMax = 0;

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
        int y = Integer.parseInt(textYears.getText());
        int m = Integer.parseInt(textMonth.getText());

    }

    protected void labelsPet() {
        switch (pet) {
            case "cat":
                ageMax = 24;
                break;
            case "dog":
                ageMax = 28;
                break;
        }
    }

    @Override
    public void PreShowing() {
        super.PreShowing();
        labelsPet();
        labelYearMax.setText("от 0 до " + ageMax);
s
    }
}
