package com.bomdisoft.battleship;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class BattleCamp1 extends AppCompatActivity {

    private static final String TAG = BattleCamp1.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_camp1);
    }

    public void missileLaunched1(View view) {
        Log.d(TAG, "missileLaunched1");

        String[] tagValues = view.getTag().toString().split(Constants.DELIMITER);
        String toastMessage;

        //@TODO

        try {
            toastMessage = "Row: " + tagValues[0] + ", Col: " + tagValues[1];

            if (tagValues[2].equals("1")) {
                toastMessage += (", Hit");
            }
            else if (tagValues[2].equals("2")) {
                toastMessage += (", Miss");
            }
            else {
                toastMessage += (", Open");
            }

            Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show();
        }
        catch (ArrayIndexOutOfBoundsException | NullPointerException ex){
            Log.d(TAG, ex.toString());
            ex.printStackTrace();
        }
    }
}
