package com.example.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText cost;
    private EditText customTipVal;
    private EditText customPersonVal;

    private Button lowTipBtn;
    private Button medTipBtn;
    private Button highTipBtn;
    private Button customTipBtn;
    private Button onePersonBtn;
    private Button twoPersonBtn;
    private Button customPersonBtn;
    private Button calculateTipBtn;

    private TextView tipTotal;


    private double costVal;
    private double tipVal;
    private double personVal;
    private double total;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cost = this.findViewById(R.id.costValue);
        customTipVal = this.findViewById(R.id.customTipVal);
        customPersonVal = this.findViewById(R.id.customPersonVal);

        lowTipBtn = this.findViewById(R.id.lowTipBtn);
        medTipBtn = this.findViewById(R.id.medTipBtn);
        highTipBtn = this.findViewById(R.id.highTipBtn);
        customTipBtn = this.findViewById(R.id.customTipBtn);
        onePersonBtn = this.findViewById(R.id.onePersonBtn);
        twoPersonBtn = this.findViewById(R.id.twoPersonBtn);
        customPersonBtn = this.findViewById(R.id.customPersonBtn);
        calculateTipBtn = this.findViewById(R.id.calculateTipBtn);

        tipTotal = this.findViewById(R.id.tipTotal);

        //doing tip buttons
        lowTipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tipVal = 12;
            }
        });
        medTipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tipVal = 15;
            }
        });
        highTipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tipVal = 20;
            }
        });
        customTipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tipVal = Double.valueOf(customTipVal.getText().toString());
            }
        });
        //doing # of people buttons
        onePersonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                personVal = 1;
            }
        });
        twoPersonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                personVal = 2;
            }
        });
        customPersonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                personVal = Double.valueOf(customPersonVal.getText().toString());
                personVal = Math.round(personVal);
            }
        });
        //doing the calculate button
        calculateTipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                costVal = Double.valueOf(cost.getText().toString());
                total = (costVal * (tipVal / 100) / personVal);
                total = Math.round(total * 100.0) / 100.0;
                tipTotal.setText(Double.toString(total));
            }
        });


    }
}
