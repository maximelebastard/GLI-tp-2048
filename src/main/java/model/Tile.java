package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by plouzeau on 2014-10-09.
 */
public interface Tile {

    int getRank();
    String getValue();
    void incrementRank();
}
