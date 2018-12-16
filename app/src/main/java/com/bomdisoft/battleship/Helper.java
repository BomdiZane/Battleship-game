package com.bomdisoft.battleship;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.widget.GridLayout;
import android.view.Gravity;
import android.widget.TextView;

import java.util.Collection;
import java.util.Random;

class Helper {

    static void prepareBattleGround(GridLayout battleCamp, Activity activity){
        int i, j;
        TextView newLocation;
        GridLayout.LayoutParams glp;

        battleCamp.removeAllViewsInLayout();

        for (i = 0; i < Constants.NUM_ROWS; i++){
            for (j = 0; j < Constants.NUM_COLUMNS; j++){
                glp = new GridLayout.LayoutParams(GridLayout.spec(i), GridLayout.spec(j));

                newLocation = new TextView(activity);
                newLocation.setId(Integer.parseInt(i + "" + j));
                newLocation.setTag(i + "," + j);
                newLocation.setMinWidth(80);
                newLocation.setMinHeight(80);
                newLocation.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL);
                newLocation.setBackgroundResource(R.drawable.fleet_formation_border);
                newLocation.setLayoutParams(glp);

                battleCamp.addView(newLocation);
            }
        }
    }

    static void buildShips(Player player){
        Ship carrier = new Ship(Constants.ShipType.CARRIER);
        Ship battleship = new Ship(Constants.ShipType.BATTLESHIP);
        Ship submarine = new Ship(Constants.ShipType.SUBMARINE);
        Ship cruiser = new Ship(Constants.ShipType.CRUISER);
        Ship patrol = new Ship(Constants.ShipType.PATROL);

        player.addShip(carrier, Constants.ShipType.CARRIER);
        player.addShip(battleship, Constants.ShipType.BATTLESHIP);
        player.addShip(submarine, Constants.ShipType.SUBMARINE);
        player.addShip(cruiser, Constants.ShipType.CRUISER);
        player.addShip(patrol, Constants.ShipType.PATROL);
    }

    static void deployShips(Player player, Activity activity){
        int xCoordinate = 0;
        int yCoordinate = 0;
        Random randomX = new Random();
        Random randomY = new Random();
        Random randomDirection = new Random();
        Constants.Direction direction = Constants.Direction.SOUTH;
        Collection<Ship> playerShips = player.getShips().values();

        for (Ship ship: playerShips) {
            while (!isValidCoordinates(playerShips, xCoordinate, yCoordinate, direction)) {
                xCoordinate = randomX.nextInt(Constants.NUM_COLUMNS + 1);
                yCoordinate = randomY.nextInt(Constants.NUM_ROWS + 1);
                direction = Constants.Direction.values()[randomDirection.nextInt(Constants.Direction.values().length + 1)];
            }

            ship.setLocation(new Location(xCoordinate, yCoordinate));
            ship.setDirection(direction);

            TextView view = activity.findViewById(Integer.parseInt(xCoordinate + "" + yCoordinate));
            view.setBackgroundColor(Color.parseColor(Constants.SHIP_COLOR));
        }
    }

    static void updateBattle(){
        //@TODO set appropriate background based on state (hit, miss, open)
    }

    private static boolean isValidCoordinates(Collection<Ship> playerShips, int xCoordinate, int yCoordinate, Constants.Direction direction){


        return true;
    }

    private static void positionShip(Activity activity){

    }
}
