package com.example.gtpeopletracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PopulationScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ShapeDrawable draw = new ShapeDrawable(new RectShape());
        setContentView(R.layout.activity_population_screen);


        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(Intent.EXTRA_TEXT);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
        TextView total = findViewById(R.id.total);
        int num = (int)(Math.random()*300);
        String s = num +"/250";
        total.setText(s);

        ImageView image = findViewById(R.id.imageView);
        if(num<200){
            draw.getPaint().setColor(Color.GREEN);
        }else if (num<250){
            draw.getPaint().setColor(Color.YELLOW);
        }else{
            draw.getPaint().setColor(Color.RED);
        }
        draw.setBounds(30,132,num+30,142);
        draw.setIntrinsicHeight(10);
        draw.setIntrinsicWidth(num);
        image.setImageDrawable(draw);

    }
}
