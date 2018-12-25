package com.bomdisoft.battleship;

class Ship {

    private Location location;
    private Constants.Direction direction;
    private int size;
    private int hits;
    private boolean isSunk;

    public Ship(Constants.ShipType shipType){
        this.size = shipType.getValue();
        this.location = null;
        this.direction = null;
        this.hits = 0;
        this.isSunk = false;
    }

    public Ship(Location location, Constants.ShipType shipType){
        this.size = shipType.getValue();
        this.location = location;
        this.direction = null;
        this.hits = 0;
        this.isSunk = false;
    }

    public Ship(Location location, Constants.Direction direction, Constants.ShipType shipType){
        this.size = shipType.getValue();
        this.location = location;
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

    public void addHits() {
        this.hits += 1;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSunk() {
        this.isSunk = true;
    }
}
