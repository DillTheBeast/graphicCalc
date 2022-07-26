package Calc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.*;

public class Controller {

    @FXML
    private Label label;

    @FXML
    private Button addition;

    @FXML
    private Button subtraction;

    @FXML
    private Button multiplication;
/. mazsHUJIK
+
    @FXML
    private Button division;

    @FXML 
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    private TextField answer;

    public void initialize() {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        label.setText("Hello, JavaFX " + javafxVersion + "\nRunning on Java " + javaVersion + ".");
    }

}]=-0987654321`