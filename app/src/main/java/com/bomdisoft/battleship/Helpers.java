package com.bomdisoft.battleship;

import android.app.Activity;
import android.support.v7.widget.GridLayout;
import android.view.Gravity;
import android.widget.TextView;

class Helpers {

    static Ship carrier;
    static Ship battleship;
    static Ship submarine;
    static Ship cruiser;
    static Ship patrol;

    static void prepareBattleGround(GridLayout battleCamp, Activity activity){
        int i, j;
        TextView newLocation;
        GridLayout.LayoutParams glp;

        battleCamp.removeAllViewsInLayout();

        for (i = 0; i < Constants.NUM_ROWS; i++){
            for (j = 0; j < Constants.NUM_COLUMNS; j++){
                glp = new GridLayout.LayoutParams(GridLayout.spec(i), GridLayout.spec(j));

                newLocation = new TextView(activity);
                newLocation.setMinWidth(80);
                newLocation.setMinHeight(80);
                newLocation.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL);
                newLocation.setBackgroundResource(R.drawable.fleet_formation_border);
                newLocation.setLayoutParams(glp);

                battleCamp.addView(newLocation);
            }
        }
    }

    static void buildShip(Ship ship){

    }

    static void positionShips(Activity activity){
        //@TODO set appropriate background based on state (hit, miss, open)
    }
}
