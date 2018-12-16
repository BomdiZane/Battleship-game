package com.bomdisoft.battleship;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.support.v7.widget.GridLayout;

public class FleetFormation extends AppCompatActivity {

    private static final String TAG = FleetFormation.class.getSimpleName();
    private GridLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fleet_formation);

        layout = findViewById(R.id.fleetFormationCamp1);
        prepareBattleGround();

    }

    public void autoFleetButton1Clicked(View view) {
        prepareBattleGround();
    }

    public void finishFleetButton1Clicked(View view) {
        Log.d(TAG, "finishFleetButton1Clicked");

        Intent intent = new Intent(this, FleetFormation2.class);
        startActivity(intent);
    }

    void prepareBattleGround(){
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
