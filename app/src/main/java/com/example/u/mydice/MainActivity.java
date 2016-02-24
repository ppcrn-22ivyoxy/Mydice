package com.example.u.mydice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    }// main method

    private void bindWidget() {

        ImgDice = (ImageView) findViewById(R.id.imgDice);
        btnBlack = (Button) findViewById(R.id.btnBlack);
        btnRandom = (Button) findViewById(R.id.btnRandom);
        btnNext = (Button) findViewById(R.id.btnNext);


    }

}// main class