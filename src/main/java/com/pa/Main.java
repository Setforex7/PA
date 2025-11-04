package com.pa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Main application class for the PA JavaFX application.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        java.net.URL fxmlResource = getClass().getResource("/com/pa/main-view.fxml");
        if (fxmlResource == null) {
            throw new IOException("Cannot find FXML resource: /com/pa/main-view.fxml");
        }
        
        FXMLLoader loader = new FXMLLoader(fxmlResource);
        Parent root = loader.load();
        
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("PA - Advanced Programming Project");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
