package com.bomdisoft.battleship;

class Ship {

    private Location location;
    private Constants.Direction direction;
    private int size;
    private int hits;
    private boolean isSunk;

    public Ship(int size){
        this.location = null;
        this.size = size;
        this.hits = 0;
        this.isSunk = false;
    }

    public Ship(Location location, int size){
        this.location = location;
        this.size = size;
        this.hits = 0;
        this.isSunk = false;
    }

    public Ship(Location location, Constants.Direction direction, int size){
        this.location = location;
        this.size = size;
        this.direction = direction;
        this.hits = 0;
        this.isSunk = false;
    }

    public int getHits() {
        return hits;
    }

    public boolean isSunk() {
        return isSunk;
    }

    public Location getLocation() {
        return location;
    }

    public int getSize() {
        return size;
    }

    public Constants.Direction getDirection() {
        return direction;
    }

    public void setDirection(Constants.Direction direction) {
        this.direction = direction;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSunk(boolean sunk) {
        this.isSunk = sunk;
    }
}
