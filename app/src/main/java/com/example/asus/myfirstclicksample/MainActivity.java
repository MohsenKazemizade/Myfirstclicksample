package com.example.asus.myfirstclicksample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;

    View view1;
    View view2;
    View view3;
    View view4;
    View view5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.OK);
        b2 = (Button) findViewById(R.id.cancle);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "this is OK", Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "this is cancle", Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                Toast.makeText(MainActivity.this, "this is long click", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    public void do_my_work(View view) {
        int i = 10;
        Log.e("TAG", "this is my code");
        Toast.makeText(this, "salam", Toast.LENGTH_SHORT).show();
    }

    public void cancle_my_work(View view) {
        Log.e("TAG", "my work is done");
    }

    public void change_color(View v) {
        if (v.getId() == R.id.color) {
            Random r = new Random();
            view1 = findViewById(R.id.V1);
            view2 = findViewById(R.id.V2);
            view3 = findViewById(R.id.V3);
            view4 = findViewById(R.id.V4);
            view5 = findViewById(R.id.V5);
            view1.setBackgroundColor(Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
            view2.setBackgroundColor(Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
            view3.setBackgroundColor(Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
            view4.setBackgroundColor(Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
            view5.setBackgroundColor(Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
        }
    }
}
