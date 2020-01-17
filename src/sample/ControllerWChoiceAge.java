package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
    private Slider sliderYear;

    @FXML
    private Slider sliderMonth;

    @FXML
    private Label labelYear;

    @FXML
    private Label labelMonth;

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

    public static int getAgeMax() {
        return ageMax;
    }

    public static void setAgeMax(int ageMax) {
        ControllerWChoiceAge.ageMax = ageMax;
    }

    private static int ageMax = 0; // для максимального возраста слайдера
    static int y = 5;
    static int m = 0;

    @FXML
    void buttonCountEnter(KeyEvent event) {
        pressCount();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buttonCount.setOnAction(event1 -> {
            pressCount();
        });
        sliderYear.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
                        y = newValue.intValue();
                        labelYear.setText("" + y);
                    }
                }
        );
        sliderMonth.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
                        m = newValue.intValue();
                        labelMonth.setText("" + m);
                    }
                }
        );
    }

    protected void pressCount() {
        double agePet = y + ((double)m * 10 / 12) / 10;
        AnimalCat.setAge(agePet);
        AnimalCat animal = new AnimalCat();
        animal.count();
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
        sliderYear.setMax(ageMax);
    }
}
