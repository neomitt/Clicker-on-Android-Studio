package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int click = 0;
    private int clickx = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v){
        TextView textView = findViewById(R.id.textView);

        if(clickx == 0){
            click++;
            textView.setText("Clicks " + click);
        }
        else if(clickx == 10){
            click += 10;
            textView.setText("Clicks " + click);
        }
        else if(clickx == 100){
            click += 100;
            textView.setText("Clicks " + click);
        }
        else if(clickx == 1000){
            click += 1000;
            textView.setText("Clicks " + click);
        }

    }
    public void onClick10x(View v){
        TextView textViewx = findViewById(R.id.textViewx);
        clickx = 10;
        textViewx.setText(clickx + "x");
    }
    public void onClick100x(View v){
        TextView textViewx = findViewById(R.id.textViewx);
        clickx = 100;
        textViewx.setText(clickx + "x");
    }
    public void onClick1000x(View v){
        TextView textViewx = findViewById(R.id.textViewx);
        clickx = 1000;
        textViewx.setText(clickx + "x");
    }
    public void onClickres(View v){
        TextView textViewx = findViewById(R.id.textViewx);
        clickx = 0;
        textViewx.setText(clickx + "x");
    }
}