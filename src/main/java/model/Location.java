package model;

import java.util.List;

public interface Location {

    Boolean isAvailable();
    Boolean on();
    Boolean off();
    List<Coordinate> getData(Coordinate arrival, Coordinate departure);

}