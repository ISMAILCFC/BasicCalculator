package com.ismailcifci.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView resultText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       number1Text= findViewById(R.id.num1Text);
         number2Text= findViewById(R.id.num2Text);
            resultText = findViewById(R.id.resultText);

    }

    public void sum(View view){
       int number1 = Integer.parseInt(number1Text.getText().toString());
       int number2 = Integer.parseInt(number2Text.getText().toString());

       int result = number1 + number2 ;

       resultText.setText("Result :" + result);
    }
    public void subs(View view){
        int number1 = Integer.parseInt(number1Text.getText().toString());
        int number2 = Integer.parseInt(number2Text.getText().toString());

        int result = number1 - number2 ;

        resultText.setText("Result :" + result);
    }
    public void mult(View view){
        int number1 = Integer.parseInt(number1Text.getText().toString());
        int number2 = Integer.parseInt(number2Text.getText().toString());

        int result = number1 * number2 ;

        resultText.setText("Result :" + result);
    }
    public void div(View view){
        int number1 = Integer.parseInt(number1Text.getText().toString());
        int number2 = Integer.parseInt(number2Text.getText().toString());

        int result = number1 / number2 ;

        resultText.setText("Result :" + result);
    }

}