package com.example.roadrage.view;

import javafx.scene.shape.Polygon;

public class Pawn extends Polygon {

    public Pawn() {
        double height = 30; // Height of the triangle
        double base = 20;   // Base of the triangle

        // Calculate the points of the triangle
        double x1 = 15; // Middle top point
        double y1 = 0;
        double x2 = x1 - base / 2;
        double y2 = height;
        double x3 = x1 + base / 2;
        double y3 = height;

        this.getPoints().addAll(new Double[]{
                x1, y1,
                x2, y2,
                x3, y3
        });
    }
}
