package com.bomdisoft.battleship;

class Coordinates {

    private int xCoordinate;
    private int yCoordinate;
    private Constants.Direction direction;

    public Coordinates(int xCoordinate, int yCoordinate, Constants.Direction direction){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    public Constants.Direction getDirection() {
        return direction;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setDirection(Constants.Direction direction) {
        this.direction = direction;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
}
