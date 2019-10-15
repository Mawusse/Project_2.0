package com.example.project_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double player_1_score = 0;
    double player_2_score =0;

    LinearLayout l1,l2;
    Animation uptodown;
    Animation downtoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1 = findViewById(R.id.l1);
        l2 = findViewById(R.id.l2);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        l1.setAnimation(uptodown);
        l2.setAnimation(downtoup);
    }



/** Increase Player1 score by 1 point!*/
public void Player_1_Win (View v)
{
    ++player_1_score;
    displayForPlayer_1(player_1_score);
}

/** There is no Increase for Player1 score */
public void Player_1_Lost(View v )
{
    Context context = getApplicationContext();
    CharSequence text = "You lost, there is no score for loser ☻";
    int duration = Toast.LENGTH_SHORT;

    Toast toast = Toast.makeText(context, text, duration);
    toast.show();
    displayForPlayer_1(player_1_score);

}



    /** Increase the score for Player1 by 0.5 point. */
public void HalfScoreForPlayer1(View v) {

    player_1_score = player_1_score + 0.5;
    displayForPlayer_1(player_1_score);

}

/** Increase the score for Player 2 by 1 point. */
public void Player_2_Win(View v) {

    ++ player_2_score;
    displayForPlayer_2(player_2_score);

}

/** There is no Increase for Player2 score */
public void Player_2_Lost(View v) {

    Context context = getApplicationContext();
    CharSequence text = "You lost, there is no score for loser ☻";
    int duration = Toast.LENGTH_SHORT;

    Toast toast = Toast.makeText(context, text, duration);
    toast.show();
    displayForPlayer_2(player_2_score);
}

/** Increase the score for Player1 by 0.5 point. */
public  void HalfScoreForPlayer2(View v) {

player_2_score = player_2_score + 0.5;
    displayForPlayer_2(player_2_score);
}

/** Displays the given score for Player 2 . */
public void displayForPlayer_1(double score) {

    TextView scoreView = findViewById(R.id.player1_score);
    scoreView.setText(String.valueOf(score));
}

/** Displays the given score for Player 2 . */
 public  void displayForPlayer_2(double score) {

TextView scoreView = findViewById(R.id.player2_score);
scoreView.setText(String.valueOf(score));
 }

 /** Reset all scores to zero. */
public void ResetScore(View v)
{
    player_1_score = 0;
    player_2_score = 0;
    displayForPlayer_1(player_1_score);
    displayForPlayer_2(player_2_score);
}






}
