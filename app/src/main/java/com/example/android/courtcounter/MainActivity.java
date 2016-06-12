package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private int quantity;
    private int quantity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantity = 0;
        quantity2 = 0;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void threepointera(View view) {
        quantity += 3;
        displayForTeamA(quantity);
    }

    public void twopointera(View view) {
        quantity += 2;
        displayForTeamA(quantity);
    }

    public void freepointera(View view) {
        quantity++;
        displayForTeamA(quantity);
    }

    public void threepointerb(View view) {
        quantity2 += 3;
        displayForTeamB(quantity2);
    }

    public void twopointerb(View view) {
        quantity2 += 2;
        displayForTeamB(quantity2);
    }

    public void freepointerb(View view) {
        quantity2++;
        displayForTeamB(quantity2);
    }

    public void reset(View view) {
        quantity = 0;
        quantity2 = 0;
        displayForTeamA(quantity);
        displayForTeamB(quantity2);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
