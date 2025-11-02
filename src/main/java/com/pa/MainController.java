package com.pa;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

/**
 * Controller class for the main view of the application.
 */
public class MainController {

    @FXML
    private Label welcomeLabel;

    @FXML
    private Button actionButton;

    @FXML
    private void initialize() {
        // This method is called automatically after the FXML file is loaded
        welcomeLabel.setText("Welcome to PA - Advanced Programming Project!");
    }

    @FXML
    private void handleButtonAction() {
        welcomeLabel.setText("Button clicked! Application is working correctly.");
    }
}
