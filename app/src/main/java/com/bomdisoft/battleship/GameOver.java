package com.bomdisoft.battleship;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class GameOver extends AppCompatActivity {

    private static final String TAG = BattleshipMainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        Player player1 = BattleshipMainActivity.getPlayer1();
        Player player2 = BattleshipMainActivity.getPlayer2();
        TextView player1PointsView = findViewById(R.id.player1Points);
        TextView player2PointsView = findViewById(R.id.player2Points);
        TextView resultsView = findViewById(R.id.gameOutcome);

        if (player1.getResult() == Constants.Result.WIN){
            resultsView.setText("Player 1 Won!");
        }
        else if (player2.getResult() == Constants.Result.WIN){
            resultsView.setText("Player 2 Won!");
        }
        else{
            resultsView.setText("Its's a tie!");
        }

        player1PointsView.setText("Player 1: " + player1.getScore() + "pts");
        player2PointsView.setText("Player 2: " + player2.getScore() + "pts");
    }

    public void restartButtonClicked(View view) {
        Log.d(TAG, "restartButtonClicked");

        Intent intent = new Intent(this, FleetFormation1Activity.class);
        startActivity(intent);
    }

    public void doneButtonClicked(View view) {
        Log.d(TAG, "doneButtonClicked");

        Intent intent = new Intent(this, BattleshipMainActivity.class);
        startActivity(intent);
    }
}
