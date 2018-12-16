package com.bomdisoft.battleship;

class Ship {

    private Coordinates location;
    private int size;
    private int hits;
    private boolean isSunk;

    public Ship(int size){
        this.location = null;
        this.size = size;
        this.hits = 0;
        this.isSunk = false;
    }

    public Ship(Coordinates location, int size){
        this.location = location;
        this.size = size;
        this.hits = 0;
        this.isSunk = false;
    }

    public int getHits() {
        return hits;
    }

    public boolean isSunk() {
        return isSunk;
    }

    public Coordinates getLocation() {
        return location;
    }

    public int getSize() {
        return size;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public void setLocation(Coordinates location) {
        this.location = location;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSunk(boolean sunk) {
        this.isSunk = sunk;
    }
}
