package com.example.prashant.calculator_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Sum3by3page extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    EditText eta111;
    EditText eta112;
    EditText eta113;
    EditText eta121;
    EditText eta122;
    EditText eta123;
    EditText eta131;
    EditText eta132;
    EditText eta133;
    EditText eta211;
    EditText eta212;
    EditText eta213;
    EditText eta221;
    EditText eta222;
    EditText eta223;
    EditText eta231;
    EditText eta232;
    EditText eta233;
    Button bt_result;
    TextView tv_result;
    DecimalFormat t = new DecimalFormat("###,###.##");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum3by3page);

        tv1 = (TextView)findViewById(R.id.tvsum33m1);
        tv2 = (TextView)findViewById(R.id.tvsum33m2);
        eta111 = (EditText)findViewById(R.id.etsum33a111);
        eta112 = (EditText)findViewById(R.id.etsum33a112);
        eta113 = (EditText)findViewById(R.id.etsum33a113);
        eta121 = (EditText)findViewById(R.id.etsum33a121);
        eta122 = (EditText)findViewById(R.id.etsum33a122);
        eta123 = (EditText)findViewById(R.id.etsum33a123);
        eta131 = (EditText)findViewById(R.id.etsum33a131);
        eta132 = (EditText)findViewById(R.id.etsum33a132);
        eta133 = (EditText)findViewById(R.id.etsum33a133);
        eta211 = (EditText)findViewById(R.id.etsum33a211);
        eta212 = (EditText)findViewById(R.id.etsum33a212);
        eta213 = (EditText)findViewById(R.id.etsum33a213);
        eta221 = (EditText)findViewById(R.id.etsum33a221);
        eta222 = (EditText)findViewById(R.id.etsum33a222);
        eta223 = (EditText)findViewById(R.id.etsum33a223);
        eta231 = (EditText)findViewById(R.id.etsum33a231);
        eta232 = (EditText)findViewById(R.id.etsum33a232);
        eta233 = (EditText)findViewById(R.id.etsum33a233);
        bt_result = (Button)findViewById(R.id.btsum3by3result);
        tv_result = (TextView)findViewById(R.id.tvsum3by3result);

        bt_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a111 = Double.parseDouble(eta111.getText().toString());
                double a112 = Double.parseDouble(eta112.getText().toString());
                double a113 = Double.parseDouble(eta113.getText().toString());
                double a121 = Double.parseDouble(eta121.getText().toString());
                double a122 = Double.parseDouble(eta122.getText().toString());
                double a123 = Double.parseDouble(eta123.getText().toString());
                double a131 = Double.parseDouble(eta131.getText().toString());
                double a132 = Double.parseDouble(eta132.getText().toString());
                double a133 = Double.parseDouble(eta133.getText().toString());
                double a211 = Double.parseDouble(eta211.getText().toString());
                double a212 = Double.parseDouble(eta212.getText().toString());
                double a213 = Double.parseDouble(eta213.getText().toString());
                double a221 = Double.parseDouble(eta221.getText().toString());
                double a222 = Double.parseDouble(eta222.getText().toString());
                double a223 = Double.parseDouble(eta223.getText().toString());
                double a231 = Double.parseDouble(eta231.getText().toString());
                double a232 = Double.parseDouble(eta232.getText().toString());
                double a233 = Double.parseDouble(eta233.getText().toString());

                double r11 = a111 + a211;
                double r12 = a112 + a212;
                double r13 = a113 + a213;
                double r21 = a121 + a221;
                double r22 = a122 + a222;
                double r23 = a123 + a223;
                double r31 = a131 + a231;
                double r32 = a132 + a232;
                double r33 = a133 + a233;

                tv_result.setText(""+t.format(r11)+"     "+t.format(r12)+"     "+t.format(r13)+"\n"+t.format(r21)+"     "+t.format(r22)+"      "+t.format(r23)+"\n"+t.format(r31)+"     "+t.format(r32)+"     "+t.format(r33));


            }
        });

    }
}
