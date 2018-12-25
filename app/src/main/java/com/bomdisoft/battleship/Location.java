package com.bomdisoft.battleship;

class Location {

    private int xCoordinate;
    private int yCoordinate;

    public Location(int xCoordinate, int yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Location)) return false;
        if (obj == this) return true;

        final Location other = (Location) obj;
        return this.xCoordinate == other.xCoordinate && this.yCoordinate == other.yCoordinate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return 53 * hash + this.xCoordinate + this.yCoordinate;
    }
}
