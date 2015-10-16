package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Board;
import model.BoardImpl;

import java.io.IOException;

/**
 * Created by maxime on 10/16/15.
 */
public class GameController extends Controller {

    private Stage gameStage;
    private Parent gameView;
    private Board boardModel;

    public GameController(Parent gameView, Stage gameStage) throws IOException {
        this.gameView = gameView;
        this.gameStage = gameStage;
        initView();

        boardModel = new BoardImpl(10);
    }

    protected void initView() throws IOException{

    }

}
