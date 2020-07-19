package com.example.prashant.calculator_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InversePage extends AppCompatActivity {

    Button bt1;
    Button bt2;
    Button bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inverse_page);

        bt1 = (Button)findViewById(R.id.bt2by2inv);
        bt2 = (Button)findViewById(R.id.bt3by3inv);
        bt3 = (Button)findViewById(R.id.bt4by4inv);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(InversePage.this,Inverse2by2page.class);
                startActivity(abc);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(InversePage.this,Inverse3by3page.class);
                startActivity(abc);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(InversePage.this,Inverse4by4page.class);
                startActivity(abc);
            }
        });
    }
}
