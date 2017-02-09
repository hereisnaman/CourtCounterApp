package com.example.naman.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score_a=0, score_b=0;
    public void plus_3_a(int score)
    {
        score+=3;
        display_a(score);
    }
    public void plus_3_a(View View)
    {
        score_a+=3;
        display_a(score_a);
    }
    public void plus_3_b(View View)
    {
        score_b+=3;
        display_b(score_b);
    }
    public void plus_2_a(View View)
    {
        score_a+=2;
        display_a(score_a);
    }
    public void plus_2_b(View View)
    {
        score_b+=2;
        display_b(score_b);
    }
    public void free_a(View View)
    {
        score_a+=1;
        display_a(score_a);
    }
    public void free_b(View View)
    {
        score_b+=1;
        display_b(score_b);
    }
    public void display_a(int score)
    {
        TextView scoreView= (TextView) findViewById(R.id.score_a);
        scoreView.setText(String.valueOf(score));
    }
    public void display_b(int score)
    {
        TextView scoreView= (TextView) findViewById(R.id.score_b);
        scoreView.setText(String.valueOf(score));
    }
    public void reset(View View)
    {
        score_a=0;
        score_b=0;
        display_a(score_a);
        display_b(score_b);
    }
}
