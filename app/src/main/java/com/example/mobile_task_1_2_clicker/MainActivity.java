package com.example.mobile_task_1_2_clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    ImageButton plusBtn;
    ImageButton minBtn;
    Button resBtn;

    private long score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.mainText);
        plusBtn = (ImageButton) findViewById(R.id.plus_btn);
        minBtn = (ImageButton) findViewById(R.id.min_btn);
        resBtn = (Button) findViewById(R.id.buttonReset);


        View.OnClickListener clickListener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score ++;
                if ((score == 2) || (score == 3) || (score == 4))
                {
                    String s = "Кнопка нажата " + score +" раза.";
                    mainText.setText(s.toCharArray(),0, s.length());
                }
                else if ((score>20) && ((score % 10 == 2) || (score % 10 == 3) || (score % 10 == 4))) {
                    String s = "Кнопка нажата " + score +" раза.";
                    mainText.setText(s.toCharArray(),0, s.length());
                }
                else {
                    String s = "Кнопка нажата " + score +" раз.";
                    mainText.setText(s.toCharArray(),0, s.length());
                }
            }
        };

        plusBtn.setOnClickListener(clickListener1);

        View.OnClickListener clickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score--;
                if ((score == 2) || (score == 3) || (score == 4)) //проверить окончания 22, 23...
                {
                    String s = "Кнопка нажата " + score +" раза.";
                    mainText.setText(s.toCharArray(),0, s.length());
                }
                else if ((score>20) && ((score % 10 == 2) || (score % 10 == 3) || (score % 10 == 4))) {
                    String s = "Кнопка нажата " + score +" раза.";
                    mainText.setText(s.toCharArray(),0, s.length());
                }
                else {
                    String s = "Кнопка нажата " + score +" раз.";
                    mainText.setText(s.toCharArray(),0, s.length());
                }
            }
        };

        minBtn.setOnClickListener(clickListener2);

        View.OnClickListener clickListener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=0;
                String s = "Кнопка нажата " + score +" раз.";
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        resBtn.setOnClickListener(clickListener3);

    }
}

