package com.bomdisoft.battleship;

public class Constants {
    public enum ShipType {
        CARRIER(5), BATTLESHIP(4), SUBMARINE(3), CRUISER(2), PATROL(1);
        private final int size;

        ShipType(int size){
            this.size = size;
        }

        public int getValue(){
            return size;
        }
    }

    public enum Direction { EAST, SOUTH }
    public enum Outcome { HIT, MISS }
    public enum Result { WIN, LOSE, IN_PLAY }

    public static final String DELIMITER = ",";
    public static final String PATROL_COLOR = "#18a888";
    public static final String CRUISER_COLOR = "#1888a8";
    public static final String SUBMARINE_COLOR = "#a8a888";
    public static final String BATTLESHIP_COLOR = "#181888";
    public static final String CARRIER_COLOR = "#88a888";
    public static final String HIT_COLOR = "#db3236";
    public static final int NUM_ROWS = 10;
    public static final int NUM_COLUMNS = 10;
}
