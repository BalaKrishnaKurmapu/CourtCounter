package com.example.krishi.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore =0, teamBScore=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    private void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    private void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePoints(View v){
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }
    public void twoPoints(View v){
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }
    public void freeThrow(View v){
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }
    // button actions for team B

    public void threePointsB(View v){
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }
    public void twoPointsB(View v){
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }
    public void freeThrowB(View v){
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }

    public void resetScore(View v){
        teamAScore=0;
        teamBScore=0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }

}
