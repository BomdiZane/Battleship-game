package com.bomdisoft.battleship;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class BattleshipMainActivity extends AppCompatActivity {

    private static final String TAG = BattleshipMainActivity.class.getSimpleName();
    private static Player player1;
    private static Player player2;
    private static Activity player1Camp;
    private static Activity player2Camp;

    public static void setPlayer1(Player player1) {
        BattleshipMainActivity.player1 = player1;
    }

    public static void setPlayer2(Player player2) {
        BattleshipMainActivity.player2 = player2;
    }

    public static Player getPlayer1() {
        return player1;
    }

    public static Player getPlayer2() {
        return player2;
    }

    public static void setPlayer1Camp(Activity player1Camp) {
        BattleshipMainActivity.player1Camp = player1Camp;
    }

    public static void setPlayer2Camp(Activity player2Camp) {
        BattleshipMainActivity.player2Camp = player2Camp;
    }

    public static Activity getPlayer1Camp() {
        return player1Camp;
    }

    public static Activity getPlayer2Camp() {
        return player2Camp;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void startButtonClicked(View view) {
        Log.d(TAG, "startButtonClicked");

        Intent intent = new Intent(this, FleetFormation1Activity.class);
        startActivity(intent);
    }
}
