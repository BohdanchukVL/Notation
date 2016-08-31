package com.example.bohdan.notation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FloatingPoint extends AppCompatActivity implements View.OnClickListener {

    EditText editText, editText2;
    Button button1, button2, button3, button4, goToFP;
    TextView numberOneFP, numberTwoFP, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_point);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        goToFP = (Button) findViewById(R.id.goToFP);
        goToFP.setOnClickListener(this);

        numberOneFP = (TextView) findViewById(R.id.numberOneFP);
        numberTwoFP = (TextView) findViewById(R.id.numberTwoFP);
        result = (TextView) findViewById(R.id.result);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.goToFP:
                if (TextUtils.isEmpty(editText.getText().toString())) {
                    return;
                }
                numberOneFP.setText(new Translate().formFloatingPoint(editText.getText().toString()));
                if (TextUtils.isEmpty(editText2.getText().toString())) {
                    return;
                }
                numberTwoFP.setText(new Translate().formFloatingPoint(editText2.getText().toString()));
                break;
            case R.id.button1:
                if (TextUtils.isEmpty(editText.getText().toString())
                        || TextUtils.isEmpty(editText2.getText().toString()))
                {
                    Toast toast = Toast.makeText(this, "Fill input boxes", Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }
                result.setText(new Translate().formFloatingPoint(
                        String.valueOf(Double.parseDouble(editText.getText().toString()) +
                                Double.parseDouble(editText2.getText().toString()))));
                break;
            case R.id.button2:
                if (TextUtils.isEmpty(editText.getText().toString())
                        || TextUtils.isEmpty(editText2.getText().toString()))
                {
                    Toast toast = Toast.makeText(this, "Fill input boxes", Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }
                result.setText(new Translate().formFloatingPoint(
                        String.valueOf(Double.parseDouble(editText.getText().toString()) -
                                Double.parseDouble(editText2.getText().toString()))));
                break;
            case R.id.button3:
                if (TextUtils.isEmpty(editText.getText().toString())
                        || TextUtils.isEmpty(editText2.getText().toString()))
                {
                    Toast toast = Toast.makeText(this, "Fill input boxes", Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }
                result.setText(new Translate().formFloatingPoint(
                        String.valueOf(Double.parseDouble(editText.getText().toString()) *
                                Double.parseDouble(editText2.getText().toString()))));
                break;
            case R.id.button4:
                if (TextUtils.isEmpty(editText.getText().toString())
                        || TextUtils.isEmpty(editText2.getText().toString()))
                {
                    Toast toast = Toast.makeText(this, "Fill input boxes", Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }
                try {
                    result.setText(new Translate().formFloatingPoint(
                            String.valueOf(Double.parseDouble(editText.getText().toString()) /
                                    Double.parseDouble(editText2.getText().toString()))));
                } catch (NumberFormatException e) {
                    Toast toast = Toast.makeText(this, "Division by zero in development :(", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            default:
                break;
        }
    }
}
