package com.example.roadrage.view;

import com.example.roadrage.HelloApplication;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class StartScene extends Scene {

    private VBox root;
    private Button play;
    private Button help;
    private Button exit;
    private Label welcome;

    public StartScene(Parent root, double width, double height) {
        super(root, width, height);
        this.root = (VBox) root;
        this.root.setAlignment(Pos.CENTER); // Align VBox contents to center
        this.root.setBackground(new Background
                (new BackgroundFill(
                Color.LIGHTBLUE, // Start color of gradient
                new CornerRadii(8),
                        null)));
        init();
        actions();
    }

    //todo Method for initializing components
    private void init() {
        play = new Button("PLAY");
        help = new Button("HELP");
        exit = new Button("EXIT");
        welcome = new Label("WELCOME to ROADRAGE");

        //todo Design all buttons
        design();

        root.getChildren().addAll(welcome, play, help, exit);

    }
    public void design () {
        // Set font and color for the welcome label
        welcome.setFont(Font.font("Comic Sans", 32));
        welcome.setTextFill(Color.RED);

        // Add padding to the welcome label
        welcome.setPadding(new Insets(20)); // 20 pixels padding around the label

        // Add padding between buttons
        VBox.setMargin(play, new Insets(10));
        VBox.setMargin(help, new Insets(10));
        VBox.setMargin(exit, new Insets(10));

        // Style the buttons
        play.setStyle("-fx-background-color: #FF6D00; -fx-text-fill: white; -fx-font-size: 20px; -fx-padding: 10px 20px;");
        help.setStyle("-fx-background-color: #66BB6A; -fx-text-fill: white; -fx-font-size: 20px; -fx-padding: 10px 20px;");
        exit.setStyle("-fx-background-color: #F44336; -fx-text-fill: white; -fx-font-size: 20px; -fx-padding: 10px 20px;");
    }

    //todo Adding actions to the buttons - controller
    private void actions(){
        play.setOnAction(event -> {
            PlayScene playScene = new PlayScene(new GridPane(), 1920, 1080);
            HelloApplication.primaryStage.setScene(playScene);
            HelloApplication.primaryStage.show();
        });
    }

}