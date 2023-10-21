package com.rps.javafxrps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    RPSGame controller = new RPSGame();

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML protected void gameChoice(ActionEvent event) {
        String choice = ((Button)event.getSource()).getText();

        welcomeText.setText(choice);}
}