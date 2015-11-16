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

    private String classForTile(Tile current){
        switch(current.getRank()){
            case 1 : return "rank1";
            case 2 : return "rank2";
            case 3 : return "rank3";
            case 4 : return "rank4";
            case 5 : return "rank5";
            case 6 : return "rank6";
            case 7 : return "rank7";
            case 8 : return "rank8";
            case 9 : return "rank9";
            case 10 : return "rank10";
            case 11 : return "rank11";
        }
        return "";
    }

    private void update(){

        Tile current = boardModel.getTile(1,1);
        cell00.getStyleClass().clear();
        if(current != null) {
            cell00.setText(current.getValue());
            cell00.getStyleClass().add(classForTile(current));
        }else{
            cell00.setText("");
        }

        current = boardModel.getTile(2,1);
        cell01.getStyleClass().clear();
        if(current != null) {
            cell01.setText(current.getValue());
            cell01.getStyleClass().add(classForTile(current));
        }else{
            cell01.setText("");
        }

        current =boardModel.getTile(3,1);
        cell02.getStyleClass().clear();
        if(current != null) {
            cell02.setText(current.getValue());
            cell02.getStyleClass().add(classForTile(current));
        }else{
            cell02.setText("");
        }
        current=boardModel.getTile(4,1);
        cell03.getStyleClass().clear();
        if(current != null) {
            cell03.setText(current.getValue());
            cell03.getStyleClass().add(classForTile(current));
        }else{
            cell03.setText("");
        }

        current=boardModel.getTile(1,2);
        cell10.getStyleClass().clear();
        if(current != null) {
            cell10.setText(current.getValue());
            cell10.getStyleClass().add(classForTile(current));
        }else{
            cell10.setText("");
        }

        current=boardModel.getTile(2,2);
        cell11.getStyleClass().clear();
        if(current != null) {
            cell11.setText(boardModel.getTile(2, 2).getValue());
            cell11.getStyleClass().add(classForTile(current));
        }else{
            cell11.setText("");
        }

        current = boardModel.getTile(3,2);
        cell12.getStyleClass().clear();
        if(current != null) {
            cell12.setText(current.getValue());
            cell12.getStyleClass().add(classForTile(current));
        }else{
            cell12.setText("");
        }

        current = boardModel.getTile(4,2);
        cell13.getStyleClass().clear();
        if(current != null) {
            cell13.setText(current.getValue());
            cell13.getStyleClass().add(classForTile(current));
        }else{
            cell13.setText("");
        }

        current = boardModel.getTile(1,3);
        cell20.getStyleClass().clear();
        if(current != null) {
            cell20.setText(current.getValue());
            cell20.getStyleClass().add(classForTile(current));
        }else{
            cell20.setText("");
        }

        current= boardModel.getTile(2,3);
        cell21.getStyleClass().clear();
        if(current != null ) {
            cell21.setText(current.getValue());
            cell21.getStyleClass().add(classForTile(current));
        }else{
            cell21.setText("");
        }

        current = boardModel.getTile(3,3);
        cell22.getStyleClass().clear();
        if(current != null) {
            cell22.setText(current.getValue());
            cell22.getStyleClass().add(classForTile(current));
        }else{
            cell22.setText("");
        }

        current = boardModel.getTile(4,3);
        cell23.getStyleClass().clear();
        if(current != null) {
            cell23.setText(current.getValue());
            cell23.getStyleClass().add(classForTile(current));

        }else{
            cell23.setText("");
        }

        current = boardModel.getTile(1,4);
        cell30.getStyleClass().clear();
        if(current != null ) {
            cell30.setText(current.getValue());
            cell30.getStyleClass().add(classForTile(current));
        }else{
            cell30.setText("");
        }

        current = boardModel.getTile(2,4);
        cell31.getStyleClass().clear();
        if(current != null) {
            cell31.setText(current.getValue());
            cell31.getStyleClass().add(classForTile(current));
        }else{
            cell31.setText("");
        }

        current = boardModel.getTile(3,4);
        cell32.getStyleClass().clear();
        if(current != null) {
            cell32.setText(current.getValue());
            cell32.getStyleClass().add(classForTile(current));
        }else{
            cell32.setText("");
        }

        current = boardModel.getTile(4,4);
        cell33.getStyleClass().clear();
        if(current != null) {
            cell33.setText(current.getValue());
            cell33.getStyleClass().add(classForTile(current));
        }
        else{
            cell33.setText("");
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
