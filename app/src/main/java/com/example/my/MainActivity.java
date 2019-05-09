package com.example.my;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout t;
    TextView txv;
    String text="";
    String[] store = new String[50];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int size = 30;

    public void bigger(View v){
        TextView big;
        big = findViewById(R.id.content);
        big.setTextSize(size++);
    }

    public void smaller(View v){
        TextView small;
        small = findViewById(R.id.content);
        small.setTextSize(size--);
    }

    public void clear(View v){
        TextView clear;
        clear = findViewById(R.id.input);
        clear.setText("");
    }

    public void enter(View v){
        int j=0;
        Random x = new Random();
        int r = x.nextInt(256);
        int b = x.nextInt(256);
        int g = x.nextInt(256);
        TextView t = findViewById(R.id.content);
        t.setTextColor(Color.rgb(r,g,b));
        EditText ed1;
        ed1 =findViewById(R.id.input);
        txv = findViewById(R.id.content);
        txv.setMovementMethod(new ScrollingMovementMethod());
        txv.setTextSize(30);
        text+=ed1.getText().toString()+"\n";
        txv.setText(text);
        store[j]=ed1.getText().toString();
    }
}
