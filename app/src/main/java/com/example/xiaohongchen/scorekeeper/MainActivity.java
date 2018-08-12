package com.example.xiaohongchen.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int cavalierScore = 0;
    int cavalierFoul = 0;
    int goldenScore = 0;
    int goldenFoul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cavalierFoulIncrement(View view) {
        ++cavalierFoul;
        displayCavalierFoul(cavalierFoul);
    }

    public void incrementCavalierOne(View view) {
        ++cavalierScore;
        displayCavalierScore(cavalierScore);
    }

    public void incrementCavalierTwo(View view) {
        cavalierScore += 2;
        displayCavalierScore(cavalierScore);
    }

    public void incrementCavalierThree(View view) {
        cavalierScore += 3;
        displayCavalierScore(cavalierScore);
    }

    public void goldenFoulIncrement(View view) {
        ++goldenFoul;
        displayGoldenFoul(goldenFoul);
    }

    public void incrementGoldenOne(View view) {
        ++goldenScore;
        displayGoldenScore(goldenScore);
    }

    public void incrementGoldenTwo(View view) {
        goldenScore += 2;
        displayGoldenScore(goldenScore);
    }

    public void incrementGoldenThree(View view) {
        goldenScore += 3;
        displayGoldenScore(goldenScore);
    }
    private void displayCavalierFoul(int number) {
        TextView foulView = (TextView) findViewById(R.id.cavalier_foul_text_view);
        foulView.setText(String.valueOf(number));
    }

    private void displayCavalierScore(int number) {
        TextView scoreView = (TextView) findViewById(R.id.cavalier_score_text_view);
        scoreView.setText(String.valueOf(number));
    }

    private void displayGoldenFoul(int number) {
        TextView foulView = (TextView) findViewById(R.id.golden_foul_text_view);
        foulView.setText(String.valueOf(number));
    }

    private void displayGoldenScore(int number) {
       // setContentView(R.id.golden_score_text_view);
        TextView scoreView = (TextView) findViewById(R.id.golden_score_text_view);
        scoreView.setText(String.valueOf(number));
    }

    public void resetScore(View view) {
        cavalierScore = 0;
        goldenScore = 0;
        displayCavalierScore(cavalierScore);
        displayGoldenScore(goldenScore);
    }

}
