package com.bomdisoft.battleship;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayout;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collection;

public class BattleCamp2Activity extends AppCompatActivity implements BattleLauncher {

    private static final String TAG = BattleCamp2Activity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_camp2);

        campSetup();
    }

    public void campSetup(){
        Helper.prepareBattleGround((GridLayout) findViewById(R.id.battleCamp2), this);

        TextView view;
        String[] tagValues;
        for (int i = 0; i < Constants.NUM_ROWS; i++){
            for (int j = 0; j < Constants.NUM_COLUMNS; j++){
                view = findViewById(Integer.parseInt(i + "" + j));
                tagValues = view.getTag().toString().split(Constants.DELIMITER);
                final Location location = new Location(Integer.parseInt(tagValues[0]), Integer.parseInt(tagValues[1]));

                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        launchMissile(location);
                    }
                });
            }
        }
    }

    @Override
    public void launchMissile(Location destination) {
        Log.d(TAG, "missileLaunched2");

        Player player1 = BattleshipMainActivity.getPlayer1();
        Player player2 = BattleshipMainActivity.getPlayer2();
        Collection<Ship> player1Ships = player1.getShips().values();
        Collection<Location> player2LaunchLocations = player2.getMoves().keySet();
        int xCoordinate = destination.getXCoordinate();
        int yCoordinate = destination.getYCoordinate();
        Boolean hit = false;

        if (player2LaunchLocations.contains(destination)) {
            Toast.makeText(this, "Used coordinates!", Toast.LENGTH_SHORT).show();
            return;
        }

        for (Ship ship: player1Ships) {
            Constants.Direction direction = ship.getDirection();
            int shipXCoordinate = ship.getLocation().getXCoordinate();
            int shipYCoordinate = ship.getLocation().getYCoordinate();
            int size = ship.getSize();

            switch (direction){
                case EAST:
                    if (shipYCoordinate != yCoordinate) continue;
                    for (int i = 0; i < size; i++) {
                        if (shipXCoordinate + i == xCoordinate) {
                            hit = true;
                            ship.addHits();
                            if (ship.getHits() >= ship.getSize()) ship.setSunk();
                            break;
                        }
                    }
                    break;
                default:
                    if (shipXCoordinate != xCoordinate) continue;
                    for (int i = 0; i < size; i++) {
                        if (shipYCoordinate + i == yCoordinate) {
                            hit = true;
                            ship.addHits();
                            if (ship.getHits() >= ship.getSize()) ship.setSunk();
                            break;
                        }
                    }
                    break;
            }

            if (hit) break;
        }

        TextView attackerView = findViewById(Integer.parseInt(xCoordinate + "" + yCoordinate));
        TextView defenderView = BattleshipMainActivity.getPlayer1Camp().findViewById(Integer.parseInt(xCoordinate + "" + yCoordinate));

        if (hit){
            Boolean gameOver = true;
            player2.addMove(destination, Constants.Outcome.HIT);
            player2.addScore();
            attackerView.setBackgroundColor(Color.parseColor(Constants.HIT_COLOR));
            defenderView.setBackgroundColor(Color.parseColor(Constants.HIT_COLOR));

            for (Ship ship: player1Ships) {
                if (!ship.isSunk()) {
                    gameOver = false;
                    break;
                }
            }

            if (gameOver){
                Toast.makeText(this, "Game Over!", Toast.LENGTH_SHORT).show();

                player2.setResult(Constants.Result.WIN);
                Intent intent = new Intent(this, BattleshipMainActivity.class);
                startActivity(intent);

                Toast.makeText(this, "Player 2 WON!", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            player2.addMove(destination, Constants.Outcome.MISS);
            attackerView.setText("x");
            defenderView.setText("x");

            Intent intent = new Intent(this, BattleCamp1Activity.class);
            startActivity(intent);
        }
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
