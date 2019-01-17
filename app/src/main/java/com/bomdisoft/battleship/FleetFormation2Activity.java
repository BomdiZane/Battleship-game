package com.bomdisoft.battleship;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayout;
import android.util.Log;
import android.view.View;

import java.util.Collection;

public class FleetFormation2Activity extends AppCompatActivity {

    private static final String TAG = FleetFormation2Activity.class.getSimpleName();
    private Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fleet_formation2);

        player = BattleshipMainActivity.getPlayer2();

        if (player != null) {
            Helper.prepareBattleGround((GridLayout) findViewById(R.id.fleetFormationCamp2), this);

            Collection<Ship> playerShips = player.getShips().values();
            for (Ship ship: playerShips) Helper.positionShip(ship, this);
        }
        else gameSetup();
    }

    void gameSetup(){
        Helper.prepareBattleGround((GridLayout) findViewById(R.id.fleetFormationCamp2), this);

        player = new Player("Player 2");

        Helper.buildShips(player);
        Helper.deployShips(player, this);
        BattleshipMainActivity.setPlayer2(player);
        BattleshipMainActivity.setPlayer2Camp(this);
    }

    public void autoFleetButton2Clicked(View view) {
        gameSetup();
    }

    public void finishFleetButton2Clicked(View view) {
        Log.d(TAG, "finishFleetButton2Clicked");

        Intent intent = new Intent(this, BattleCamp1Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart");
        super.onRestart();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onSaveInstanceState");
        super.onStop();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume");
        super.onResume();
    }
}
