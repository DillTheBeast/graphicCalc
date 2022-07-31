package Calc;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

import java.io.ObjectInputStream.GetField;

import javafx.*;
import javafx.event.ActionEvent;

public class Controller {

    @FXML
    private Button additionButton;

    @FXML
    private Label calculationStack;

    @FXML
    private Button decimalButton;

    @FXML
    private Button divisionButton;

    @FXML
    private Button eightButton;

    @FXML
    private Button equalsButton;

    @FXML
    private Button fiveButton;

    @FXML
    private Button fourButton;

    @FXML
    private Button multiplicationButton;

    @FXML
    private Button nineButtpn;

    @FXML
    private Button oneButton;

    @FXML
    private TextField outputField;

    @FXML
    private Button sevenButton;

    @FXML
    private Button sixButton;

    @FXML
    private Button subtractionButton;

    @FXML
    private Button threeButton;

    @FXML
    private Button twoButton;

    @FXML
    private Button zeroButton;

    @FXML
    private Button clearButton;

    String previousNum;
    String currentNum;
    String operation;
    Alert noOperator;
    Alert badNumber;
    Alert unknownError;

    public Controller() {
        previousNum = "";
        currentNum = "";
        operation = "";

        noOperator = new Alert(AlertType.ERROR);
        noOperator.setHeaderText("No Operation");
        noOperator.setContentText("You clicked the equal sign before giving an operation.");

        badNumber = new Alert(AlertType.ERROR);
        badNumber.setHeaderText("Bad Number");
        badNumber.setContentText("You forgot to add a number.");

        unknownError = new Alert(AlertType.ERROR);
        unknownError.setHeaderText("Unknown Error");
        unknownError.setContentText("An unknown error has occurred");
    }
    @FXML
    void onDecimalClick(ActionEvent event) {
        String decimalClicked = ((Button)event.getSource()).getText();
    }

    @FXML
    void onNumberClick(ActionEvent event) {
        currentNum += ((Button)event.getSource()).getText();
        updateoutputField();
    } 
    void updateoutputField() {
        outputField.setText(currentNum);
        calculationStack.setText(previousNum + operation + currentNum);
    }

    @FXML
    void onOperationClick(ActionEvent event) {
        operation = ((Button)event.getSource()).getText();
        previousNum = currentNum;
        currentNum = "";
        updateoutputField();
    }

    @FXML
    void onEqualsClick(ActionEvent event) {
        int result = 0;
        try {
            int num1 = Integer.parseInt(previousNum);
            int num2 = Integer.parseInt(currentNum);
            if(operation.equals("+")) {
                result = num1 + num2;
            }
            else if(operation.equals("-")) {
                result = num1 - num2;
            }
            else if(operation.equals("x")) {
                result = num1 * num2;
            }
            else if(operation.equals("/")) {
                result = num1 / num2;
            }
            else {
                noOperator.showAndWait();
                return;
            }
        } 
        catch (Exception e) {
            if(e instanceof NumberFormatException) {
                badNumber.showAndWait();
            }
            else {
                unknownError.showAndWait();
            }
            return;
        }
        outputField.setText(String.valueOf(result));
        
    }

    void reset() {
        previousNum = "";
        currentNum = "";
        operation = "";
        updateoutputField();
    }

    @FXML 
    void onClearButton(ActionEvent event) {
        reset();
    }
}