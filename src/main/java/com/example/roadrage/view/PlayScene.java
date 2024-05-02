package com.example.roadrage.view;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class PlayScene extends Scene {

    private StackPane root;
    private Label welcome;

    public PlayScene(Parent root, double width, double height) {
        super(root, width, height);
        this.root = new StackPane();
        this.root = (StackPane) root;
    }

    private void init(){
        welcome = new Label("Let`s Play");
        root.getChildren().addAll(welcome);

    }

}
