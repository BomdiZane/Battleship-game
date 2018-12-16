package com.bomdisoft.battleship;

public class Constants {
    public enum ShipTypes { CARRIER, BATTLESHIP, SUBMARINE, CRUISER, PATROL }
    public enum Direction { NORTH, SOUTH }
    public enum Outcome { HIT, MISS }
    public enum Result { WIN, LOSE, IN_PLAY }

    public static final String DELIMITER = ",";
    public static final int NUM_ROWS = 10;
    public static final int NUM_COLUMNS = 10;
}
