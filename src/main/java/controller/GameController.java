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
import model.Tile;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by maxime on 10/16/15.
 */
public class GameController implements Initializable {

    private Board boardModel;

    @FXML
    private GridPane grid;

    public void initialize(URL location, ResourceBundle resources) {
        boardModel = new BoardImpl(10);
        grid.setGridLinesVisible(true);
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++) {
                Tile t = boardModel.getTile(i,j);

                if(t!=null){
                    System.out.println("pas null value i=" +i +" j="+j);
                    String value = String.valueOf(t.getRank());

                    grid.add(new Label(value), i - 1, j - 1);
                }else{
                    grid.add(new Label(String.valueOf(i)), i - 1, j - 1);
                    System.out.println("null value i=" +i +" j="+j);
                }
            }
        }
    }
}
