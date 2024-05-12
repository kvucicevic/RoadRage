package com.example.roadrage.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class TestScene extends Scene {

    private HBox root;
    private PawnView pawnView;
    private Rectangle spawn;

    private VBox vbox1;
    private GridPane grid;
    private VBox vbox2;

    public TestScene(Parent root, double width, double height) {
        super(root, width, height);
        this.root = (HBox) root;

        init();
        placing();
        design();
    }

    private void init(){
        vbox1 = new VBox();
        grid = new GridPane();
        vbox2 = new VBox();
    }

    /**
     * 1.Add spawn places in VBoxes1 2 and add road to GridPane
     * 2.Add Vbox1, GridPane and VBox2 respectively
     * 3.How to size them properly to fill the whole screen?
     * 4.How to make spawn places visible?
     */
    private void placing(){
        vbox1.getChildren().add(new Rectangle(50, 50));
        vbox1.getChildren().add(new Rectangle(50, 50));
        vbox1.setAlignment(Pos.BASELINE_CENTER);

        grid.getChildren().add(new Circle(100));
        grid.setAlignment(Pos.CENTER);

        vbox2.getChildren().add(new Rectangle(50, 50));
        vbox2.getChildren().add(new Rectangle(50, 50));
        vbox2.setAlignment(Pos.CENTER);

        root.getChildren().addAll(vbox1, grid, vbox2);
        root.setPadding(new Insets(50));
        root.setAlignment(Pos.CENTER);

    }

    private void design(){
        vbox1.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
        grid.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
        vbox2.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));

    }
}
