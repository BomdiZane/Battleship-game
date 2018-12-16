package com.bomdisoft.battleship;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayout;
import android.util.Log;
import android.view.View;

public class FleetFormation2 extends AppCompatActivity {

    private static final String TAG = FleetFormation2.class.getSimpleName();
    private GridLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fleet_formation2);

        layout = findViewById(R.id.fleetFormationCamp1);
        populateCamp();
    }

    public void autoFleetButton2Clicked(View view) {
        populateCamp();
    }

    public void finishFleetButton2Clicked(View view) {
        Log.d(TAG, "finishFleetButton2Clicked");

        Intent intent = new Intent(this, BattleCamp1.class);
        startActivity(intent);
    }

    void populateCamp(){
        Helper.prepareBattleGround(layout, this);
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
