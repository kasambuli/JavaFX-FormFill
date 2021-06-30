package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    Button button1,button2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Form Fill and Passcards");
        StackPane layout = new StackPane();
        primaryStage.setScene(new Scene(root, 600, 500));

        button1= new Button();
        button2= new Button();
        button1.setText("OK");
        button2.setText("Cancel");


        layout.getChildren().addAll(button1,button2);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
