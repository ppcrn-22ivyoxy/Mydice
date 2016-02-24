package com.example.u.mydice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView ImgDice;
    private Button btnBlack, btnRandom, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bind widget
        bindWidget();
        backCon();
        randomCon();
        nextCon();
    }// main method

    private void nextCon() {

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void randomCon() {

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void backCon() {

        btnBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void bindWidget() {

        ImgDice = (ImageView) findViewById(R.id.imgDice);
        btnBlack = (Button) findViewById(R.id.btnBlack);
        btnRandom = (Button) findViewById(R.id.btnRandom);
        btnNext = (Button) findViewById(R.id.btnNext);
    }
    private void ChangeOver(int myRandom) {
        int[] intSource = new int[7];
        intSource[0] = 0;
        intSource[1] = R.drawable.dice1;
        intSource[2] = R.drawable.dice2;
        intSource[3] = R.drawable.dice3;
        intSource[4] = R.drawable.dice4;
        intSource[5] = R.drawable.dice5;
        intSource[6] = R.drawable.dice6;

        ImgDice.setImageResource(intSource[myRandom]);

    }


}// main class