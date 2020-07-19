package com.example.prashant.calculator_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MultiplicationPage extends AppCompatActivity {

    Button bt22by22;
    Button bt33by33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_page);

        bt22by22 = (Button)findViewById(R.id.btmul22by22);
        bt33by33 = (Button)findViewById(R.id.btmul33by33);

        bt22by22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(MultiplicationPage.this,Multiplication22by22page.class);
                startActivity(abc);
            }
        });

        bt33by33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(MultiplicationPage.this,Multuplication33by33page.class);
                startActivity(abc);
            }
        });
    }
}
