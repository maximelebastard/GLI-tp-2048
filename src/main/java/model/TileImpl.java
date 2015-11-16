package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by plouzeau on 2014-10-09.
 */
public class TileImpl implements Tile  {

    private  int rank;
    private SimpleStringProperty simpleStringProperty;

    public TileImpl(int rank)
    {
        this.rank = rank;
        simpleStringProperty = new SimpleStringProperty();
    }

    @Override
    public int getRank() {
        return rank;
    }

    public String getValue() {
       return String.valueOf((int)Math.pow(2, rank));
    }

    @Override
    public void incrementRank() {
        this.rank++;
    }
}
