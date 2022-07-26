package Calc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Calc/calc.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("Calc/icon.png")));
        Scene scene = new Scene(root, 438, 601);
        scene.getStylesheets().add(getClass().getResource("Calc/application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}