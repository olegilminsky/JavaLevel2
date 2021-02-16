package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Online chat");
        primaryStage.setScene(new Scene(root, 350, 450));
        primaryStage.setMinWidth(300);
        primaryStage.setMinHeight(400);
        primaryStage.setMaxWidth(500);
        primaryStage.setMaxHeight(600);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        System.out.println();
    }


}
