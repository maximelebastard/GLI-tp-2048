package controller;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.ListBinding;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.util.converter.NumberStringConverter;
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

    @FXML
    private Label cell00;
    @FXML
    private Label cell01;
    @FXML
    private Label cell02;
    @FXML
    private Label cell03;
    @FXML
    private Label cell10;
    @FXML
    private Label cell11;
    @FXML
    private Label cell12;
    @FXML
    private Label cell13;
    @FXML
    private Label cell20;
    @FXML
    private Label cell21;
    @FXML
    private Label cell22;
    @FXML
    private Label cell23;
    @FXML
    private Label cell30;
    @FXML
    private Label cell31;
    @FXML
    private Label cell32;
    @FXML
    private Label cell33;


    public void initialize(URL location, ResourceBundle resources) {

        boardModel = new BoardImpl(BOARD_SIDE_SIZE);
        update();

    }

    private void update(){
        if(boardModel.getTile(1,1) != null && !cell00.textProperty().isBound()) {
            cell00.textProperty().bindBidirectional(boardModel.getTile(1, 1).getValue());
        }

        if(boardModel.getTile(1,2) != null && !cell01.textProperty().isBound()) {
            cell01.textProperty().bindBidirectional(boardModel.getTile(1, 2).getValue());
        }

        if(boardModel.getTile(1,3) != null && !cell02.textProperty().isBound()) {
            cell02.textProperty().bindBidirectional(boardModel.getTile(1, 3).getValue());
        }

        if(boardModel.getTile(1,4) != null && !cell03.textProperty().isBound()) {
            cell03.textProperty().bindBidirectional(boardModel.getTile(1, 4).getValue());
        }

        if(boardModel.getTile(2,1) != null && !cell10.textProperty().isBound()) {
            cell10.textProperty().bindBidirectional(boardModel.getTile(2, 1).getValue());
        }

        if(boardModel.getTile(2,2) != null && !cell11.textProperty().isBound()) {
            cell11.textProperty().bindBidirectional(boardModel.getTile(2, 2).getValue());
        }

        if(boardModel.getTile(2,3) != null && !cell12.textProperty().isBound()) {
            cell12.textProperty().bindBidirectional(boardModel.getTile(2, 3).getValue());
        }

        if(boardModel.getTile(2,4) != null && !cell13.textProperty().isBound()) {
            cell13.textProperty().bindBidirectional(boardModel.getTile(2, 4).getValue());
        }

        if(boardModel.getTile(3,1) != null && !cell20.textProperty().isBound()) {
            cell20.textProperty().bindBidirectional(boardModel.getTile(3, 1).getValue());
        }

        if(boardModel.getTile(3,2) != null && !cell21.textProperty().isBound()) {
            cell21.textProperty().bindBidirectional(boardModel.getTile(3, 2).getValue());
        }

        if(boardModel.getTile(3,3) != null && !cell22.textProperty().isBound()) {
            cell22.textProperty().bindBidirectional(boardModel.getTile(3, 3).getValue());
        }

        if(boardModel.getTile(3,4) != null && !cell23.textProperty().isBound()) {
            cell23.textProperty().bindBidirectional(boardModel.getTile(3, 4).getValue());
        }

        if(boardModel.getTile(4,1) != null && !cell30.textProperty().isBound()) {
            cell30.textProperty().bindBidirectional(boardModel.getTile(4, 1).getValue());
        }

        if(boardModel.getTile(4,2) != null && !cell31.textProperty().isBound()) {
            cell31.textProperty().bindBidirectional(boardModel.getTile(4, 2).getValue());
        }

        if(boardModel.getTile(4,3) != null && !cell32.textProperty().isBound()) {
            cell32.textProperty().bindBidirectional(boardModel.getTile(4, 3).getValue());
        }

        if(boardModel.getTile(4,4) != null && !cell33.textProperty().isBound()) {
            cell33.textProperty().bindBidirectional(boardModel.getTile(4, 4).getValue());
        }
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
