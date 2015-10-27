import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

 

public class SceneBuilderHelloWorld extends Application {
    
    @Override
    public void start(Stage stage) {
        stage.setTitle("Hello World");
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader(SceneBuilderHelloWorld.class.getResource("GUI.fxml"));
            AnchorPane layout = (AnchorPane) loader.load();
            // Show the scene containing the root layout.
            Scene scene = new Scene(layout);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
     public static void main(String[] args) {
        Application.launch(args);
    }

}
