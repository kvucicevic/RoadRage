package com.example.roadrage.view;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;


import javafx.scene.shape.Rectangle;
import javafx.scene.layout.Region;


import java.util.Objects;


public class TestScene extends Scene {


    private HBox root;
    private PawnView pawnView;
    private Rectangle spawn;


    private VBox vbox1;
    private GridPane grid;
    private FieldView road;
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
        road = new FieldView();
        Image backgroundImage = new Image(Objects.requireNonNull(getClass().getResource("/Screenshot (274).png")).toExternalForm());


        // Create a BackgroundImage object
        BackgroundImage background = new BackgroundImage(backgroundImage,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);


        // Set the background of the GridPane
        root.setBackground(new Background(background));
    }


    /**
     * 1.Add spawn places in VBoxes1 2 and add road to GridPane
     * 2.Add Vbox1, GridPane and VBox2 respectively
     * 3.How to size them properly to fill the whole screen?
     * 4.How to make spawn places visible?
     */
    private void placing(){


        //todo VBox1
//        Rectangle bottomRectangle = new Rectangle(200, 200, Color.BISQUE);
//        Rectangle topRectangle = new Rectangle(200, 200, Color.AQUAMARINE);
        SpawnView spawnTL = new SpawnView(300, 300, Color.BISQUE);
        SpawnView spawnBL = new SpawnView(300, 300, Color.BISQUE);
        vbox1.setPadding(new Insets(40));
        vbox1.setSpacing(50);
        vbox1.setAlignment(Pos.CENTER);


        Region spacer = new Region(); //todo flexible spacer
        VBox.setVgrow(spacer, javafx.scene.layout.Priority.ALWAYS);
        vbox1.getChildren().addAll(spawnTL, spacer, spawnBL);


        //todo Grid
//        grid.getChildren().add(new Circle(100));
//        grid.setAlignment(Pos.CENTER);


        //todo VBox2
//        Rectangle bottom2Rectangle = new Rectangle(200, 200, Color.FIREBRICK);
//        Rectangle top2Rectangle = new Rectangle(200, 200, Color.BLUEVIOLET);
        SpawnView spawnTR = new SpawnView(300, 300, Color.BISQUE);
        SpawnView spawnBR = new SpawnView(300, 300, Color.BISQUE);
        vbox2.setPadding(new Insets(40));
        vbox2.setSpacing(50);
        vbox2.setAlignment(Pos.CENTER);


        Region spacer2 = new Region();
        VBox.setVgrow(spacer2, javafx.scene.layout.Priority.ALWAYS);
        vbox2.getChildren().addAll(spawnTR, spacer2, spawnBR);


        root.getChildren().addAll(vbox1, road, vbox2);
        root.setSpacing(30);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);


    }


    private void design(){
//        vbox1.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));
//        grid.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
        road.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
//        vbox2.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));


    }
}
