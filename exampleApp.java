package com.example.codeforcoffee.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final EditText firstNumber = (EditText) findViewById(R.id.editText);
    final EditText secondNumber = (EditText) findViewById(R.id.editText2);
    final TextView output = (TextView) findViewById(R.id.textView3);
    final Button button = (Button) findViewById(R.id.button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Float val1 = Float.parseFloat(firstNumber.getText().toString());
                Float val2 = Float.parseFloat(secondNumber.getText().toString());
                output.setText("");
                output.append(addNumbers(val1, val2).toString());
            }
        });
    }

    protected Float addNumbers(float int1, float int2) {
        Float ret = int1 + int2;
        return ret;
    }

}
