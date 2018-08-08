package mythremote;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.MalformedURLException;
import java.util.Enumeration;
import java.util.ResourceBundle;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        ResourceBundle resourceBundle = ResourceBundle.getBundle("config");

        Parent root = FXMLLoader.load(getClass().getResource("/mythremote_gui.fxml"), resourceBundle);

        primaryStage.setTitle("Mythtv Frontend Remote");

        Scene scene = new Scene(root, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
