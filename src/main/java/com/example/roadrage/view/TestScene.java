package com.example.roadrage.view;

import com.example.roadrage.model.Field;
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

    private Field road;

    private VBox vbox1;
    private GridPane grid;
    private VBox vbox2;
    private StackPane stack;

    public TestScene(Parent root, double width, double height) {
        super(root, width, height);
        this.root = (HBox) root;
        this.road = new Field(grid);
        init();
        placing();
        design();
    }

    private void init(){
        vbox1 = new VBox();
        grid = new GridPane();
        vbox2 = new VBox();
        stack = new StackPane();
    }

    /**
     * 1.Add spawn places in VBoxes1 2 and add road to GridPane
     * 2.Add Vbox1, GridPane and VBox2 respectively
     * 3.How to size them properly to fill the whole screen?
     * 4.How to make spawn places visible?
     */
    private void placing(){
        vbox1.getChildren().add(new Rectangle(50, 50));
        vbox1.getChildren().add(new Circle(50));
        vbox1.setAlignment(Pos.BASELINE_CENTER);

//        grid.getChildren().add(new Circle(100));
//        grid.getChildren().add();
//        grid.setAlignment(Pos.CENTER);

        /*
         * todo Have to figure out how to insert Field/road in this StackPane
         */
//        stack.getChildren().add(road);

        vbox2.getChildren().add(new Rectangle(60, 50));
        vbox2.getChildren().add(new Circle(50));
        vbox2.setAlignment(Pos.CENTER);

        root.getChildren().addAll(vbox1, grid, vbox2);
        root.setPadding(new Insets(50));
        root.setAlignment(Pos.CENTER);

    }

    private void design(){
        vbox1.setBackground(new Background(new BackgroundFill(Color.GREY, null, null)));
        grid.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
        vbox2.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));

        vbox1.setPadding(new Insets(50));
        grid.setPadding(new Insets(50));
        vbox2.setPadding(new Insets(50));
//        root.setPadding(new Insets(50));
    }


}
