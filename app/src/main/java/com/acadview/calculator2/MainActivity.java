package com.acadview.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one,two,three,four,five,six,seven,eight,nine,zero,clear,equal,divide,multiply,subtract,addition;
    TextView control,result;
    private final char ADDITION = '+';
    private final char SUBTRACT = '-';
    private final char MULTIPLY = '*';
    private final char DIVIDE = '/';
    private double val1 = Double.NaN;
    private double val2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.btn1);
        two = findViewById(R.id.btn2);
        three = findViewById(R.id.btn5);
        four = findViewById(R.id.btn4);
        five = findViewById(R.id.btn5);
        six = findViewById(R.id.btn6);
        seven = findViewById(R.id.btn7);
        eight = findViewById(R.id.btn8);
        nine = findViewById(R.id.btn9);
        zero = findViewById(R.id.btn0);
        clear = findViewById(R.id.btnClear);
        equal= findViewById(R.id.btnEqual);
        divide = findViewById(R.id.btnDiv);
        multiply = findViewById(R.id.btnMul);
        divide = findViewById(R.id.btnDiv);
        subtract = findViewById(R.id.btnSub);
        addition = findViewById(R.id.btnAdd);
        control = findViewById(R.id.Control);
        result = findViewById(R.id.result);


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "9");
            }
        });




    }

}
