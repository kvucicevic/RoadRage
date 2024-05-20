package com.example.roadrage.view;


import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


import java.util.Objects;


public class FieldView extends GridPane {


//        GridPane root;


    public FieldView(){
        init();
        placement(11);
//            adjustments();
    }


//        private void adjustments(){
//            //todo
//        }


    private void placement(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n-1 || j == n-1) {
                    // todo new field should be initialized here, when you implement it
                    Rectangle rect = new Rectangle(60,60,Color.RED);
                    rect.setStroke(Color.BLACK);
                    rect.setFill(Color.RED);
                    rect.setStrokeWidth(2);
                    System.out.println("Rect: " + rect);
                    // Adding rectangles to the appropriate cell in the GridPane
//                        root.add(rect, i, j);
                    this.add(rect,i,j);


                    // Adding padding to the cell (15px on all sides)
                    GridPane.setMargin(rect, new Insets(15));
                }
                else if((i == n/2) || (j == n/2)){
                    Circle circ = new Circle(30, Color.NAVY);
//                        root.add(circ, i, j);
                    this.add(circ,i,j);
                    GridPane.setMargin(circ, new Insets(10));
                }
            }
        }
    }

    private void init(){
        Image backgroundImage = new Image(Objects.requireNonNull(getClass().getResource("/Screenshot (274).png")).toExternalForm());

        // Create a BackgroundImage object
        BackgroundImage background = new BackgroundImage(backgroundImage,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);


        // Set the background of the GridPane
        this.setBackground(new Background(background));
        System.out.println("Background Image: " + backgroundImage.getUrl());

    }
}
