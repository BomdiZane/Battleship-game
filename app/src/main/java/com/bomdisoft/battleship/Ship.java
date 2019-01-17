package com.bomdisoft.battleship;

class Ship {

    private Location location;
    private Constants.Direction direction;
    private int size;
    private String color;
    private int hits;
    private boolean isSunk;

    public Ship(Constants.ShipType shipType){
        this.size = shipType.getValue();
        this.location = null;
        this.direction = null;
        this.hits = 0;
        this.isSunk = false;
        setColor(shipType);
    }

    public void setColor(Constants.ShipType shipType) {
        switch (shipType){
            case PATROL: this.color = Constants.PATROL_COLOR; break;
            case CARRIER: this.color = Constants.CARRIER_COLOR; break;
            case CRUISER: this.color = Constants.CRUISER_COLOR; break;
            case BATTLESHIP: this.color = Constants.BATTLESHIP_COLOR; break;
            case SUBMARINE: this.color = Constants.SUBMARINE_COLOR; break;
            default: break;
        }
    }

    public String getColor() {
        return color;
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
