package com.example.roadrage.controller;

import com.example.roadrage.model.Pawn;
import com.example.roadrage.view.PawnView;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

import javafx.fxml.FXML;

public class Controller {

    private Pawn pawn;
    private PawnView pawnView;

    public Controller(Pawn pawn, PawnView pawnView) {
        this.pawn = pawn;
        this.pawnView = pawnView;
    }

    // Method to handle the click event
    // todo don't ask ChatGPT to write you code
    //  it is not going to tell you anything informative idea-wise
    private void handlePawnClick(MouseEvent event) {
        System.out.println("Pawn clicked!");
        // You can add your custom actions here
    }

    /**
    // Set up event handlers
        pawnView.setOnPawnClickedHandler(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            // Get the clicked pawn
            Pawn clickedPawn = pawnView.getPawnAtPosition(event.getX(), event.getY());

            // Highlight the clicked pawn
            if (clickedPawn != null) {
                pawn.highlightPawn(clickedPawn);
            }
        }
    });
*/

}

