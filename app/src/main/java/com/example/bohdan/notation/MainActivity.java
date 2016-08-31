package com.example.bohdan.notation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button8;
    Button notationSystems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.letsFP);
        button1.setOnClickListener(this);
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);
        notationSystems = (Button) findViewById(R.id.notationSystem);
        notationSystems.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.letsFP:
                Intent intent = new Intent(this, FloatingPoint.class);
                startActivity(intent);
                break;
            case R.id.notationSystem:
                Intent intent1 = new Intent(this, NotationSystems.class);
                startActivity(intent1);
                break;
            case R.id.button8:
                Intent intent2 = new Intent(this, ActivityFromFP.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}
