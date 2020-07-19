package com.example.prashant.calculator_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Sum2by2page extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    EditText et1a11;
    EditText et1a12;
    EditText et1a13;
    EditText et1a14;
    EditText et2a11;
    EditText et2a12;
    EditText et2a13;
    EditText et2a14;
    Button bt_result;
    TextView tv_result;

    DecimalFormat t = new DecimalFormat("###,###.###");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum2by2page);

        tv1 = (TextView)findViewById(R.id.tvsumm1);
        tv2 = (TextView)findViewById(R.id.tvsumm2);
        et1a11 = (EditText)findViewById(R.id.etsum22a111);
        et1a12 = (EditText)findViewById(R.id.etsum22a112);
        et1a13 = (EditText)findViewById(R.id.etsum22a113);
        et1a14 = (EditText)findViewById(R.id.etsum22a114);
        et2a11 = (EditText)findViewById(R.id.etsum22a211);
        et2a12 = (EditText)findViewById(R.id.etsum22a212);
        et2a13 = (EditText)findViewById(R.id.etsum22a213);
        et2a14 = (EditText)findViewById(R.id.etsum22a214);
        bt_result = (Button)findViewById(R.id.btsum2by2result);
        tv_result = (TextView)findViewById(R.id.tvsum2by2result);

        bt_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a111 = Double.parseDouble(et1a11.getText().toString());
                double a112 = Double.parseDouble(et1a12.getText().toString());
                double a113 = Double.parseDouble(et1a13.getText().toString());
                double a114 = Double.parseDouble(et1a14.getText().toString());
                double a211 = Double.parseDouble(et2a11.getText().toString());
                double a212 = Double.parseDouble(et2a12.getText().toString());
                double a213 = Double.parseDouble(et2a13.getText().toString());
                double a214 = Double.parseDouble(et2a14.getText().toString());

                double ra11 = a111 + a211;
                double ra12 = a112 + a212;
                double ra13 = a113 + a213;
                double ra14 = a114 + a214;

                tv_result.setText(""+t.format(ra11)+"     "+t.format(ra12)+"\n"+t.format(ra13)+"     "+t.format(ra14));


            }
        });


    }
}
