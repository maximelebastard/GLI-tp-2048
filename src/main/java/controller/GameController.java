package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Board;
import model.BoardImpl;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by maxime on 10/16/15.
 */
public class GameController implements Initializable {

    final static int BOARD_SIDE_SIZE = 8;

    private Board boardModel;

    @FXML
    private GridPane grid;

    public void initialize(URL location, ResourceBundle resources) {
        boardModel = new BoardImpl(BOARD_SIDE_SIZE);
        grid.getChildren().add(0,new Label("test"));
    }
}
