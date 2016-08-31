package com.example.bohdan.notation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

/**
 * Created by bohdanchukvl on 21.05.16.
 */
public class ActivityFromFP extends AppCompatActivity implements View.OnClickListener{

    EditText editText9, editText10, editText11;
    Button button9;
    TextView textView6;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.from_floating_point);

        editText9 = (EditText) findViewById(R.id.editText9);
        editText10 = (EditText) findViewById(R.id.editText10);
        editText11 = (EditText) findViewById(R.id.editText11);

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);

        textView6 = (TextView) findViewById(R.id.textView6);
    }


    public void onClick (View v) {
            try {
                switch (v.getId()) {
                    case R.id.button9:
                        if ((TextUtils.isEmpty(editText9.getText().toString()) || TextUtils
                                .isEmpty(editText10.getText().toString()))
                                || TextUtils.isEmpty(editText11.getText().toString())) {
                            Toast toast = Toast.makeText(this, "Fill input boxes", Toast.LENGTH_SHORT);
                            toast.show();
                            return;
                        }
                        try {
                            textView6.setText(String.valueOf(new FromFloatingPoint()
                                    .decimal(editText9.getText().toString(), editText10.getText().toString(),
                                    editText11.getText().toString())));
                        } catch (NumberFormatException e) {
                            Toast toast = Toast.makeText(this, "Some proplem", Toast.LENGTH_LONG);
                            toast.show();
                        }
                        break;
                    default:
                        break;

                }
            } catch (NumberFormatException e1) {
                Toast toast = Toast.makeText(this, "Some proplem", Toast.LENGTH_LONG);
                toast.show();
            }
        }
}
