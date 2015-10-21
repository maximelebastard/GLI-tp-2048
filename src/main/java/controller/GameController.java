package controller;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.ListBinding;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import model.Board;
import model.BoardImpl;
import model.Tile;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

/**
 * Created by maxime on 10/16/15.
 */
public class GameController implements Initializable {

    final static int BOARD_SIDE_SIZE = 4;

    private Board boardModel;

    @FXML
    private GridPane grid;

    public void initialize(URL location, ResourceBundle resources) {

        boardModel = new BoardImpl(BOARD_SIDE_SIZE);
        update();
    }

    private void update(){

    }



    public void handleKeyPressed(KeyCode code) {
        switch (code) {
            case DOWN:
                boardModel.packIntoDirection(Board.Direction.BOTTOM);
                break;
            case UP:
                boardModel.packIntoDirection(Board.Direction.TOP);
                break;
            case LEFT:
                boardModel.packIntoDirection(Board.Direction.LEFT);
                break;
            case RIGHT:
                boardModel.packIntoDirection(Board.Direction.RIGHT);
                break;
        }
        boardModel.commit();
        update();
    }
}
