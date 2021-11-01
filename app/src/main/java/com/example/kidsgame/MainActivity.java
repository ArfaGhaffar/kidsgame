package com.example.kidsgame;
import java.lang.Math;
import java.util.Scanner;
import java.util.Random;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2, textView3;

    Button button, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText() == "b" || textView2.getText() == "d" || textView2.getText() == "f" || textView2.getText() == "h" || textView2.getText() == "k" || textView2.getText() == "l" || textView2.getText() == "t") {
                    textView3.setText("CORRECT");
                } else {
                    textView3.setText("WRONG");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] myNum = { "a","c","e","i","m","n","o","r","s","u","v","w","x","z"};
                for(int i=0;i<=13;i++){
                    if (textView2.getText()==myNum[i]){
                        textView3.setText("CORRECT");
                        break;
                    }
                    else{
                        textView3.setText("WRONG");
                    }
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] myNum = { "g","j","p","q","y"};
                for(int i=0;i<=4;i++){
                    if (textView2.getText()==myNum[i]){
                        textView3.setText("CORRECT");
                        break;
                    }
                    else{
                        textView3.setText("WRONG");
                    }
                }

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomNumber();

            }
        });


    }

    private void randomNumber() {
        String[] myNum = {"a", "b", "c", "d","e", "f", "g", "h","i", "j", "k", "l","m", "n", "o", "p","q", "r", "s", "t","u", "v", "w", "x","y","z"};
        Random random = new Random();
        int value = random.nextInt( 25);

        textView2.setText(myNum[value]);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString("text",textView2.getText().toString());
        outState.putString("text2",textView3.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        textView2.setText(savedInstanceState.getString("text"));
        textView3.setText(savedInstanceState.getString("text2"));
        super.onRestoreInstanceState(savedInstanceState);
    }


}