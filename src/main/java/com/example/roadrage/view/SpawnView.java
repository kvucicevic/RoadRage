package com.example.roadrage.view;


import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


import java.util.Objects;


public class SpawnView extends GridPane {


    private Button pawn;


    public SpawnView(double width, double height, Color color){
        init();
        placement();
    }


    private void init(){
        Image pawnBackground = new Image(Objects.requireNonNull(getClass().getResource("/pawn.png")).toExternalForm());
        BackgroundImage background = new BackgroundImage(pawnBackground,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
                new BackgroundSize(50,50,true,true,true,false));


        pawn = new Button();
        pawn.setPrefSize(60, 60); // Set preferred size of the button
        pawn.setBackground(new Background(background));
    }
    private void placement(){


        this.setGridLinesVisible(true);
        this.setVgap(20);
        this.setHgap(20);
        this.setPadding(new Insets(25));
        this.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(10),null)));


//        this.add(new Circle(30), 0, 0);
        this.add(pawn,0,0);
        this.add(new Circle(30, Color.NAVY), 1, 0);
        this.add(new Circle(30, Color.NAVY), 0, 1);
        this.add(new Circle(30, Color.NAVY), 1, 1);
    }


}
