package com.example.phonedialler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    boolean isNewOp = true;
    String oldnumber,op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.one);
    }
    public void numberEvent(View view)
    {
        if(isNewOp)
        {
            ed1.setText("");
            isNewOp=false;
            String number = ed1.getText().toString();
            switch (view.getId())
            {
                case R.id.butOne:
                    number += "1";
                    break;
                case R.id.butTwo:
                    number += "2";
                    break;
                case R.id.butThree:
                    number += "3";
                    break;
                case R.id.butFour:
                    number += "4";
                    break;
                case R.id.butFive:
                    number += "5";
                    break;
                case R.id.butSix:
                    number += "6";
                    break;
                case R.id.butSeven:
                    number += "7";
                    break;
                case R.id.butEight:
                    number += "8";
                    break;
                case R.id.butNine:
                    number += "9";
                    break;
                case R.id.butZero:
                    number += "0";
                    break;
                case R.id.butPoint:
                    number += ".";
                    break;
                case R.id.butPm:
                    number = "-"+number;
                    break;
            }
            ed1.setText(number);
        }
    }
    public void operatorEvent(View view)
    {
        isNewOp = true;
        oldnumber = ed1.getText().toString();
        switch(view.getId())
        {
            case R.id.butDivide:op = "/";
                        break;
            case R.id.butMulti:op = "*";
                break;
            case R.id.butPlus:op = "+";
                break;
            case R.id.butMinus:op = "-";
                break;
        }
    }
    public void equalEvent(View view)
    {
        String newNumber = ed1.getText().toString();
        double result = 0.0;
        switch(op)
        {
            case"+":
                result=Double.parseDouble(oldnumber)+Double.parseDouble(newNumber);
                break;
            case"-":
                result=Double.parseDouble(oldnumber)-Double.parseDouble(newNumber);
                break;
            case"*":
                result=Double.parseDouble(oldnumber)*Double.parseDouble(newNumber);
                break;
            case"/":
                result=Double.parseDouble(oldnumber)/Double.parseDouble(newNumber);
                break;

        }
        ed1.setText(result+"");
    }
}