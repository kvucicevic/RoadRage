package com.example.roadrage;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

    public class Main extends Application {

        @Override
        public void start(Stage primaryStage) {
            // Create a Label
            Label label = new Label("Click me");

            // Set click listener for the label
            label.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    System.out.println("Label clicked!");
                    // You can add your custom actions here
                }
            });

            // Create a StackPane and add the label to it
            StackPane root = new StackPane();
            root.getChildren().add(label);

            // Create the Scene
            Scene scene = new Scene(root, 300, 250);

            // Set the Scene and show the Stage
            primaryStage.setScene(scene);
            primaryStage.setTitle("JavaFX Mouse Click Example");
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }

