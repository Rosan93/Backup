package com.example.yodin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScoreKeeper extends AppCompatActivity {

    int scoreA;
    int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_keeper);
    }

    public void scoreAOne(View v)
    {
        scoreA = scoreA +1;
        displayTeamA(scoreA);
    }

    public void scoreAFour(View v)
    {
        scoreA = scoreA +4;
        displayTeamA(scoreA);
    }

    public void scoreASix(View v)
    {
        scoreA = scoreA +6;
        displayTeamA(scoreA);
    }

    public void scoreBOne(View v)
    {
        scoreB = scoreB +1;
        displayTeamB(scoreB);
    }

    public void scoreBFour(View v)
    {
        scoreB = scoreB +4;
        displayTeamB(scoreB);
    }

    public void scoreBSix(View v)
    {
        scoreB = scoreB +6;
        displayTeamB(scoreB);
    }

    public void reset(View v)
    {
        scoreA = 0;
        scoreB = 0;
        reSetAll(scoreA);
        reSetAll2(scoreB);
    }
    public void displayTeamA(int score)
    {
        TextView displayA = (TextView)findViewById(R.id.displayA);
        displayA.setText(String.valueOf(score));
    }

    public void displayTeamB(int score)
    {
        TextView displayA = (TextView)findViewById(R.id.displayB);
        displayA.setText(String.valueOf(score));
    }

    public void reSetAll(int reset)
    {
        TextView resetAll = (TextView)findViewById(R.id.displayA);
        resetAll.setText(String.valueOf(reset));

    }

    public void reSetAll2(int reset)
    {
        TextView resetAll2 = (TextView)findViewById(R.id.displayB);
        resetAll2.setText(String.valueOf(reset));
    }
}
