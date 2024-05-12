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
    private List<Rectangle> road; //40

    private List<Circle> garage; //16
    private Button pawnB;

    public PlayScene(Parent root, double width, double height) {
        super(root, width, height);
        this.root = (GridPane) root;
        init();
        drawRoad(11);
        addPawn();
    }

    private void init(){
        this.road = new ArrayList<>();
        this.pawnB = new Button("Add a Pawn");

        root.add(pawnB, 1, 3);
        root.setAlignment(Pos.CENTER);
    }


    private void drawRoad(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n-1 || j == n-1) {
                    Rectangle r = new Rectangle(40, 40); // todo new field should be initialized here, when you implement it
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
                else if((i == n/2) || (j == n/2)){
                    Circle c = new Circle(25, Color.NAVY);
                    root.add(c, i+3, j+3);
                    GridPane.setMargin(c, new Insets(10));
                }
            }
        }
    }

    private void addPawn(){
        pawnB.setOnAction(event -> {
            PawnView pawn = new PawnView();
            root.add(pawn, 3, 3);
            GridPane.setMargin(pawn, new Insets(0, 0, 0, 24));
        });
    }

}
