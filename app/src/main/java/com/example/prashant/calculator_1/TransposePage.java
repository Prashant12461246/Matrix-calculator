package com.example.prashant.calculator_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransposePage extends AppCompatActivity {
    Button bt2;
    Button bt3;
    Button bt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transpose_page);

        bt2 = (Button)findViewById(R.id.bt2by2tra);
        bt3 = (Button)findViewById(R.id.bt3by3tra);
        bt4 = (Button)findViewById(R.id.bt4by4tra);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(TransposePage.this,Transpose2by2page.class);
                startActivity(abc);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(TransposePage.this,Transpose3by3page.class);
                startActivity(abc);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(TransposePage.this,Transpose4by4page.class);
                startActivity(abc);
            }
        });
    }
}
