package com.example.prashant.calculator_1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
        Button Matrix_calculator;
       // Button Equetion;
        Button bt_exit;

        @Override
        public void onBackPressed()
        {
            final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Are you sure want to quit ?");
            builder.setCancelable(true);
            builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    //dialogInterface.cancel();
                    finish();
                }
            });
            builder.setPositiveButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    //finish();
                    dialogInterface.cancel();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Matrix_calculator = (Button)findViewById(R.id.btmatrix);
        //Equetion = (Button)findViewById(R.id.btde);
        bt_exit = (Button)findViewById(R.id.btexit);
        Matrix_calculator.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent abc = new Intent(MainActivity.this, ActivityMatrixMainPage.class);
                startActivity(abc);
            }
        });
        bt_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Are you sure you want to quit ?");
                builder.setCancelable(true);
                builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //dialogInterface.cancel();
                        finish();
                    }
                });
                builder.setPositiveButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //finish();
                        dialogInterface.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });


    }


}
