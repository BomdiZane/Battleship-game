package com.bomdisoft.battleship;

import java.util.HashMap;
import java.util.LinkedHashMap;

class Player {

    private String name;
    private HashMap<Constants.ShipType, Ship> ships;
    private LinkedHashMap<Location, Constants.Outcome> moves;
    private int score;
    private Constants.Result result;

    // CONSTRUCTORS
    public Player(String name){
        this.name = name;
        this.ships = new HashMap<>();
        this.moves = new LinkedHashMap<>();
        this.score = 0;
        this.result = Constants.Result.IN_PLAY;
    }

    public Player(String name, HashMap<Constants.ShipType, Ship> ships){
        this.name = name;
        this.ships = ships;
        this.moves = new LinkedHashMap<>();
        this.score = 0;
        this.result = Constants.Result.IN_PLAY;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public HashMap<Constants.ShipType, Ship> getShips() {
        return ships;
    }

    public Ship getShip(Constants.ShipType shipType) {
        return ships.get(shipType);
    }

    public LinkedHashMap<Location, Constants.Outcome> getMoves() {
        return moves;
    }

    public int getScore() {
        return score;
    }

    public Constants.Result getResult() {
        return result;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        this.score += 1;
    }

    public void setResult(Constants.Result result) {
        this.result = result;
    }

    public void addShip(Ship ship, Constants.ShipType shipType) {
        this.ships.put(shipType, ship);
    }

    public void addMove(Location location, Constants.Outcome outcome) {
        this.moves.put(location, outcome);
    }
}
