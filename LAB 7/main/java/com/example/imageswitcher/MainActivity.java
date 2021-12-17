package com.example.imageswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2;
    ImageView imgv;
    Boolean flag;
    int images[] = {R.drawable.imgswitch1,R.drawable.imgswitch2,R.drawable.imgswitch3,R.drawable.imgswitch4,R.drawable.imgswitch5};
    int i = 0;
    int length = images.length;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgv = (ImageView)findViewById(R.id.image);
        bt2 = (Button) findViewById(R.id.next);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                i++;
                if(i==length){
                    i=0;
                    imgv.setImageResource(images[i]);
                    // Toast.makeText(getApplicationContext(), "No more next!", Toast.LENGTH_SHORT).show();
                }
                else{
                    imgv.setImageResource(images[i]);
                }
            }
        });
        bt1 = (Button) findViewById(R.id.previous);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i--;
                if(i==-1){
                    i=length-1;
                    imgv.setImageResource(images[i]);
                    //Toast.makeText(getApplicationContext(), "No more Previous!", Toast.LENGTH_SHORT).show();
                }
                else{
                    imgv.setImageResource(images[i]);
                }
            }
        });
    }
}