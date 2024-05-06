package com.example.roadrage.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class PlayScene extends Scene {

    private GridPane root;
    //private Label welcome;
    private List<Rectangle> road; //40
    private Rectangle rect;
    private List<Circle> garage; //16
    private Button pawnB;

    public PlayScene(Parent root, double width, double height) {
        super(root, width, height);
        this.root = (GridPane) root;
        this.road = new ArrayList<>();
        this.pawnB = new Button("Add a Pawn");
        init();
        drawRoad();
        addPawn();
    }

    private void init(){


        //welcome = new Label("Let`s Play");
        //root.getChildren().addAll(welcome);
        root.add(pawnB, 1, 3);
        root.setAlignment(Pos.CENTER);

    }

    private void drawRoad() {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0 || j == 0 || i == 10 || j == 10) {
                    Rectangle r = new Rectangle(40, 40);
                    r.setStroke(Color.BLACK);
                    r.setFill(Color.RED);
                    r.setStrokeWidth(2);
                    road.add(r);
                    System.out.println("Rect: " + r);

                    // Adding rectangles to the appropriate cell in the GridPane
                    root.add(r, i+3, j+3);

                    // Adding padding to the cell (15px on all sides)
                    GridPane.setMargin(r, new Insets(15));
                }
                else if((i == 5) || (j == 5)){
                    Circle c = new Circle(25, Color.NAVY);
                    root.add(c, i+3, j+3);
                    GridPane.setMargin(c, new Insets(10));
                }
            }
        }
    }

    private void addPawn(){
        pawnB.setOnAction(event -> {
            Pawn pawn = new Pawn();
            root.add(pawn, 3, 3);
            GridPane.setMargin(pawn, new Insets(0, 0, 0, 25));
        });
    }

}
