package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    boolean isNewop=true;
    EditText result;
    String oldNumber,op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=findViewById(R.id.result);
    }





        public void numberEvent(View view) {
            if(isNewop)
            {
                result.setText("");
            }
            isNewop=false;
            String number=result.getText().toString();
            switch(view.getId())
            {
                case R.id.bu1:
                    number+="1";
                    break;
                case R.id.bu2:
                    number+="2";
                    break;
                case R.id.bu3:
                    number+="3";
                    break;
                case R.id.bu4:
                    number+="4";
                    break;
                case R.id.bu5:
                    number+="5";
                    break;
                case R.id.bu6:
                    number+="6";
                    break;
                case R.id.bu7:
                    number+="7";
                    break;
                case R.id.bu8:
                    number+="8";
                    break;
                case R.id.bu9:
                    number+="9";
                    break;
                case R.id.budot:
                    number+=".";
                    break;
                case R.id.buplusminus:
                    number="-"+number;
                    break;
            }
            result.setText(number);

        }

        public void operatorEvent(View view) {
            isNewop=true;
            oldNumber=result.getText().toString();
            switch(view.getId()) {
                case R.id.bufslash:
                    op="/";
                    break;
                case R.id.buplus:
                    op="+";
                    break;
                case R.id.buminus:
                    op="-";
                    break;
            }
        }

        public void equalEvent(View view) {
            String newNumber =result.getText().toString();
            double result1=0.0;
            switch (op)
            {
                case "+":
                    result1=Double.parseDouble(oldNumber)+Double.parseDouble(newNumber);
                    break;

                case "-":
                    result1=Double.parseDouble(oldNumber)-Double.parseDouble(newNumber);
                    break;
                case "*":
                    result1=Double.parseDouble(oldNumber)*Double.parseDouble(newNumber);
                    break;
                case "/":
                    result1=Double.parseDouble(oldNumber)/Double.parseDouble(newNumber);
                    break;
            }
            result.setText(result1+"");
        }

        public void percentEvent(View view) {
            double no=Double.parseDouble(result.getText().toString())/100;
            result.setText(no+"");
            isNewop=true;
        }

        public void acEvent(View view) {
            result.setText("0");
            isNewop=true;
        }
    }