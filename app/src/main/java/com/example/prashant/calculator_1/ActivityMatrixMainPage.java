package com.example.prashant.calculator_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMatrixMainPage extends AppCompatActivity {
        Button bt_determine;
        Button bt_trancepose;
        Button bt_inverse;
        Button bt_adjoint;
        Button bt_sum;
        Button bt_multiplication;

    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_main_page);

        bt_determine = (Button)findViewById(R.id.btdetermine);
        bt_trancepose = (Button)findViewById(R.id.bttranspose);
        bt_inverse = (Button)findViewById(R.id.btinverse);
        bt_adjoint = (Button)findViewById(R.id.btadjoint);
        bt_sum = (Button)findViewById(R.id.btsum);
        bt_multiplication = (Button)findViewById(R.id.btmultiplication);


        bt_determine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(ActivityMatrixMainPage.this,DeterminePage.class);
                startActivity(abc);

            }
        });
        bt_inverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(ActivityMatrixMainPage.this,InversePage.class);
                startActivity(abc);
            }
        });
        bt_trancepose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(ActivityMatrixMainPage.this,TransposePage.class);
                startActivity(abc);
            }
        });
        bt_adjoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(ActivityMatrixMainPage.this,AdjointPage.class);
                startActivity(abc);
            }
        });
        bt_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(ActivityMatrixMainPage.this,SumPage.class);
                startActivity(abc);
            }
        });
        bt_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(ActivityMatrixMainPage.this,MultiplicationPage.class);
                startActivity(abc);
            }
        });





    }
}
