package com.example.newapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input1, input2;
        Button add, subtract, multiply, divide;
        input1 = (EditText)findViewById(R.id.Input1);
        input2 = (EditText)findViewById(R.id.Input2);
        add = (Button)findViewById(R.id.AddButton);
        subtract = (Button)findViewById(R.id.MinusButton);
        multiply = (Button)findViewById(R.id.MultipleButton);
        divide = (Button)findViewById(R.id.DivideButton);

        TextView Output = (TextView)findViewById(R.id.Output);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Editable editable1 = input1.getText();
                String inpt1 = editable1.toString();
                double in1 = Double.parseDouble(inpt1);

                Editable editable2 = input2.getText();
                String inpt2 = editable2.toString();
                double in2 = Double.parseDouble(inpt2);

                Double result;
                result = in1 + in2;
                Output.setText(Double.toString(result));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Editable editable1 = input1.getText();
                String inpt1 = editable1.toString();
                double in1 = Double.parseDouble(inpt1);

                Editable editable2 = input2.getText();
                String inpt2 = editable2.toString();
                double in2 = Double.parseDouble(inpt2);

                Double result;
                result = in1 - in2;
                Output.setText(Double.toString(result));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Editable editable1 = input1.getText();
                String inpt1 = editable1.toString();
                double in1 = Double.parseDouble(inpt1);

                Editable editable2 = input2.getText();
                String inpt2 = editable2.toString();
                double in2 = Double.parseDouble(inpt2);

                Double result;
                result = in1 * in2;
                Output.setText(Double.toString(result));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Editable editable1 = input1.getText();
                String inpt1 = editable1.toString();
                double in1 = Double.parseDouble(inpt1);

                Editable editable2 = input2.getText();
                String inpt2 = editable2.toString();
                double in2 = Double.parseDouble(inpt2);

                Double result;
                result = in1 / in2;
                Output.setText(Double.toString(result));
            }
        });

        //Without using Editable class
        /*
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Double result;
                double inpt1 = Double.parseDouble(String.valueOf(input1.getText()));
                double inpt2 = Double.parseDouble(String.valueOf(input2.getText()));
                result = inpt1 + inpt2;
                Output.setText(Double.toString(result));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Double result;
                double inpt1 = Double.parseDouble(String.valueOf(input1.getText()));
                double inpt2 = Double.parseDouble(String.valueOf(input2.getText()));
                result = inpt1 - inpt2;
                Output.setText(Double.toString(result));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Double result;
                double inpt1 = Double.parseDouble(String.valueOf(input1.getText()));
                double inpt2 = Double.parseDouble(String.valueOf(input2.getText()));
                result = inpt1 * inpt2;
                Output.setText(Double.toString(result));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Double result;
                double inpt1 = Double.parseDouble(String.valueOf(input1.getText()));
                double inpt2 = Double.parseDouble(String.valueOf(input2.getText()));
                result = inpt1 / inpt2;
                Output.setText(Double.toString(result));
            }
        });*/
    }
}