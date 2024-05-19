package com.example.roadrage.model;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Field extends GridPane {

    private GridPane root;
    private List<Rectangle> road; //40

    public Field(Parent root) {
        this.root = (GridPane) root;
        this.road = new ArrayList<>();

        drawRoad(11);
        design();
    }

    private void design(){
        root.setAlignment(Pos.CENTER);
        root.setBackground(new Background(new BackgroundFill(Color.VIOLET,
                new CornerRadii(10), new Insets(5))));
        root.setGridLinesVisible(true);
    }

    private void drawRoad(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n-1 || j == n-1) {
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
                else if((i == n/2) || (j == n/2)){
                    Circle c = new Circle(25, Color.NAVY);
                    root.add(c, i+3, j+3);
                    GridPane.setMargin(c, new Insets(10));
                }
            }
        }
    }

}
