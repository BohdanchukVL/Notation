package com.example.bohdan.notation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class NotationSystems extends AppCompatActivity {
    EditText editText3, editText4;
    TextView textView3, textView4, result;
    RadioGroup radioGroup;
    Button button, button5, button6, button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notation_systems);

        button = (Button) findViewById(R.id.button);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);

        editText3 = (EditText) findViewById(R.id.editText3);
        editText3.dispatchWindowFocusChanged(true);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText4.dispatchWindowFocusChanged(false);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        result = (TextView) findViewById(R.id.textView5);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        if (editText3.getText().toString().length() == 0 && editText4.getText().toString().length() == 0) {
            radioGroup.setActivated(false);
        }

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case -1:
                        break;
                    case R.id.radioButton:
                        if (TextUtils.isEmpty(editText3.getText().toString())) {
                            return;
                        }
                        textView3.setText(String.valueOf(Long.toBinaryString(Long.parseLong(editText3.getText().toString()))));
                        if (TextUtils.isEmpty(editText4.getText().toString())) {
                            return;
                        }
                        textView4.setText(String.valueOf(Long.toBinaryString(Long.parseLong(editText4.getText().toString()))));
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                result.setText(String.valueOf(Long.toBinaryString(Long.parseLong(editText3.getText().toString())
                                        + Long.parseLong(editText4.getText().toString()))));
                            }
                        });
                        button5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                result.setText(String.valueOf(Long.toBinaryString(Long.parseLong(editText3.getText().toString())
                                        - Long.parseLong(editText4.getText().toString()))));
                            }
                        });
                        button6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                result.setText(String.valueOf(Long.toBinaryString(Long.parseLong(editText3.getText().toString())
                                        * Long.parseLong(editText4.getText().toString()))));
                            }
                        });
                        button7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                result.setText(String.valueOf(Long.toBinaryString(Long.parseLong(editText3.getText().toString())
                                        / Long.parseLong(editText4.getText().toString()))));
                            }
                        });
                        break;
                    case R.id.radioButton5:
                        if (TextUtils.isEmpty(editText3.getText().toString())) {
                            return;
                        }
                        textView3.setText(String.valueOf(Long.toOctalString(Long.parseLong(editText3.getText().toString()))));
                        if (TextUtils.isEmpty(editText4.getText().toString())) {
                            return;
                        }
                        textView4.setText(String.valueOf(Long.toOctalString(Long.parseLong(editText4.getText().toString()))));
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                result.setText(String.valueOf(Long.toOctalString(Long.parseLong(editText3.getText().toString())
                                        + Long.parseLong(editText4.getText().toString()))));
                            }
                        });
                        button5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                result.setText(String.valueOf(Long.toOctalString(Long.parseLong(editText3.getText().toString())
                                        - Long.parseLong(editText4.getText().toString()))));
                            }
                        });
                        button6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                result.setText(String.valueOf(Long.toOctalString(Long.parseLong(editText3.getText().toString())
                                        * Long.parseLong(editText4.getText().toString()))));
                            }
                        });
                        button7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                result.setText(String.valueOf(Long.toOctalString(Long.parseLong(editText3.getText().toString())
                                        / Long.parseLong(editText4.getText().toString()))));
                            }
                        });
                        break;
                    case R.id.radioButton7:
                        if (TextUtils.isEmpty(editText3.getText().toString())) {
                            return;
                        }
                        textView3.setText(String.valueOf(Long.toHexString(Long.parseLong
                                (editText3.getText().toString()))).toUpperCase());
                        if (TextUtils.isEmpty(editText4.getText().toString())) {
                            return;
                        }
                        textView4.setText(String.valueOf(Long.toHexString(Long.parseLong
                                (editText4.getText().toString()))).toUpperCase());
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                result.setText(String.valueOf(Long.toHexString(Long.parseLong
                                        (editText3.getText().toString())
                                        + Long.parseLong(editText4.getText().toString()))).toUpperCase());
                            }
                        });
                        button5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                result.setText(String.valueOf(Long.toHexString(Long.parseLong
                                        (editText3.getText().toString())
                                        - Long.parseLong(editText4.getText().toString()))).toUpperCase());
                            }
                        });
                        button6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                result.setText(String.valueOf(Long.toHexString(Long.parseLong
                                        (editText3.getText().toString())
                                        * Long.parseLong(editText4.getText().toString()))).toUpperCase());
                            }
                        });
                        button7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                result.setText(String.valueOf(Long.toHexString
                                        (Long.parseLong(editText3.getText().toString())
                                                / Long.parseLong(editText4.getText().toString()))).toUpperCase());
                            }
                        });
                        break;
                }
            }
        });


    }


}