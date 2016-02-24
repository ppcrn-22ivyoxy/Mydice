package com.example.u.mydice;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView ImgDice;
    private Button btnBlack, btnRandom, btnNext;
    private int intdice = 1;
    private TextView ShowTextView;

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
                intdice += 1;
                if (intdice ==7) {
                    intdice = 1;
                }
                ShowView(intdice);
            }
        });

    }

    private void randomCon() {

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            myRandomPicture(intdice);
            }
        });

    }

    private void backCon() {

        btnBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intdice -= 1;
                if (intdice ==0) {
                    intdice = 6;

                }
                ShowView(intdice);
            }
        });

    }

    private void bindWidget() {

        ImgDice = (ImageView) findViewById(R.id.imgDice);
        btnBlack = (Button) findViewById(R.id.btnBlack);
        btnRandom = (Button) findViewById(R.id.btnRandom);
        btnNext = (Button) findViewById(R.id.btnNext);


    }
    private void ChangeView(int myRandom) {
        int intSound = R.raw.effect_btn_shut;
        int[] intSource = new int[7];
        intSource[0] = 0;
        intSource[1] = R.drawable.dice1;
        intSource[2] = R.drawable.dice2;
        intSource[3] = R.drawable.dice3;
        intSource[4] = R.drawable.dice4;
        intSource[5] = R.drawable.dice5;
        intSource[6] = R.drawable.dice6;

        ImgDice.setImageResource(intSource[myRandom]);


        MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), intSound);
        mediaPlayer.start();

    }

    private  void ShowView(int intdice) {
        Log.d("test", "ค่าที่ได้รับ = " + intdice);
        int intSound = R.raw.phonton1;

        switch (intdice) {
            case 1:
                ImgDice.setImageResource(R.drawable.dice1);
                intSound = R.raw.phonton1;

                break;
            case 2:
                ImgDice.setImageResource(R.drawable.dice2);
                intSound = R.raw.phonton1;

                break;
            case 3:
                ImgDice.setImageResource(R.drawable.dice3);
                intSound = R.raw.phonton1;

                break;
            case 4:
                ImgDice.setImageResource(R.drawable.dice4);
                intSound = R.raw.phonton1;

                break;
            case 5:
                ImgDice.setImageResource(R.drawable.dice5);
                intSound = R.raw.phonton1;

                break;
            case 6:
                ImgDice.setImageResource(R.drawable.dice6);
                intSound = R.raw.phonton1;

                break;

        }

        MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), intSound);
        mediaPlayer.start();



    }

    private void myRandomPicture(int intUser) {
        int myRandom = 0;
        Random objRandom = new Random();
        myRandom = objRandom.nextInt(6) + 1;
        Log.d("Ran", "nmyRandom ==>" + myRandom);

        ChangeView(myRandom);
    }


}// main class