package com.example.digitalcounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increaseInt(View view){
        counter=counter+1;
        display(counter);

    }
    public void resetInt(View view){
        counter=0;
        display(counter);
    }

    public void decInt(View view){
        counter=counter-1;
        display(counter);
    }

    public void display(int counter){
        TextView displayInteger=findViewById(R.id.integer_number);
        displayInteger.setText("Click Counter" +counter);


    }

}