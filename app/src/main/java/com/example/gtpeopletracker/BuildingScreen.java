package com.example.gtpeopletracker;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.content.Intent.EXTRA_TEXT;


public class BuildingScreen extends AppCompatActivity implements View.OnClickListener {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(layout);
        for(int i = 1; i<11; i++){
            Button button= new Button(this);
            String s = "Building " + i;
            button.setText(s);
            button.setOnClickListener(this);
            layout.addView(button);

        }
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, PopulationScreen.class);
        Button b = (Button)v;
        String message = b.getText().toString();
        intent.putExtra(EXTRA_TEXT, message);
        startActivity(intent);
    }
}
