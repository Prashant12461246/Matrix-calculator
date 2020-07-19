package com.example.prashant.calculator_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeterminePage extends AppCompatActivity {

    Button bt2;
    Button bt3;
    Button bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determine_page);

        bt2 = (Button)findViewById(R.id.bt2by2det);
        bt3 = (Button)findViewById(R.id.bt3by3det);
        bt4 = (Button)findViewById(R.id.bt4by4det);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(DeterminePage.this,Det2by2page.class);
                startActivity(abc);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(DeterminePage.this,Det3by3page.class);
                startActivity(abc);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(DeterminePage.this,Det4by4page.class);
                startActivity(abc);
            }
        });

    }
}
