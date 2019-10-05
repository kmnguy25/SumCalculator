package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button calcButton;

    @FXML
    private TextField number1;

    @FXML
    private TextField number2;

    @FXML
    private Label resultLabel;

    @FXML
    void calcSum(ActionEvent event) {
        int first = Integer.parseInt(number1.getText());
        int second = Integer.parseInt(number2.getText());
        int result = first + second;
        resultLabel.setText(""+ result);
    }
}
