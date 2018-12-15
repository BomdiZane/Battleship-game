package com.bomdisoft.battleship;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FleetFormation extends AppCompatActivity {

    private static final String TAG = FleetFormation.class.getSimpleName();
    private GridLayout battleCamp;
    private TextView newLocation;
    private GridLayout.LayoutParams glp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fleet_formation);

//        populateCamp();
    }

    public void autoFleetButton1Clicked(View view) {

    }

    public void finishFleetButton1Clicked(View view) {
        Log.d(TAG, "finishFleetButton1Clicked");

        Intent intent = new Intent(this, FleetFormation2.class);
        startActivity(intent);
    }

    private void populateCamp(){
        glp = new GridLayout.LayoutParams(GridLayout.spec(5), GridLayout.spec(5));

        newLocation = new TextView(FleetFormation.this);
        newLocation.setMinWidth(32);
        newLocation.setMinHeight(32);
        newLocation.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL);
        newLocation.setBackgroundResource(R.drawable.fleet_formation_border);
        newLocation.setLayoutParams(glp);

        battleCamp = findViewById(R.id.gridLayout1);
        battleCamp.addView(newLocation);
//        battleCamp.removeAllViewsInLayout();
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
