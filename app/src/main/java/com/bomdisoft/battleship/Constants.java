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
    public static final String SHIP_COLOR = "#18a888";
    public static final String HIT_COLOR = "#db3236";
    public static final String MISS_COLOR = "#D3D3D3";
    public static final int NUM_ROWS = 10;
    public static final int NUM_COLUMNS = 10;
}
