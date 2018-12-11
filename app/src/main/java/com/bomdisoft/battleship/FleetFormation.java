package com.bomdisoft.battleship;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FleetFormation extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fleet_formation);
    }

    public void autoFleetButton1Clicked(View view) {

    }

    public void finishFleet1ButtonClicked(View view) {

    }
}
