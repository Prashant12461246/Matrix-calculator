package com.example.prashant.calculator_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Multuplication33by33page extends AppCompatActivity {

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
    DecimalFormat t = new DecimalFormat("###,###.###");
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multuplication33by33page);

        tv1 = (TextView)findViewById(R.id.tvmul33m1);
        tv2 = (TextView)findViewById(R.id.tvmul33m2);
        eta111 = (EditText)findViewById(R.id.etmul33a111);
        eta112 = (EditText)findViewById(R.id.etmul33a112);
        eta113 = (EditText)findViewById(R.id.etmul33a113);
        eta121 = (EditText)findViewById(R.id.etmul33a121);
        eta122 = (EditText)findViewById(R.id.etmul33a122);
        eta123 = (EditText)findViewById(R.id.etmul33a123);
        eta131 = (EditText)findViewById(R.id.etmul33a131);
        eta132 = (EditText)findViewById(R.id.etmul33a132);
        eta133 = (EditText)findViewById(R.id.etmul33a133);
        eta211 = (EditText)findViewById(R.id.etmul33a211);
        eta212 = (EditText)findViewById(R.id.etmul33a212);
        eta213 = (EditText)findViewById(R.id.etmul33a213);
        eta221 = (EditText)findViewById(R.id.etmul33a221);
        eta222 = (EditText)findViewById(R.id.etmul33a222);
        eta223 = (EditText)findViewById(R.id.etmul33a223);
        eta231 = (EditText)findViewById(R.id.etmul33a231);
        eta232 = (EditText)findViewById(R.id.etmul33a232);
        eta233 = (EditText)findViewById(R.id.etmul33a233);
        bt_result = (Button)findViewById(R.id.btmul3by3result);
        tv_result = (TextView)findViewById(R.id.tvmul3by3result);

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

                double r11 = (a111*a211)+(a112*a221)+(a113*a231);
                double r12 = (a111*a212)+(a112*a222)+(a113*a232);
                double r13 = (a111*a213)+(a112*a223)+(a113*a233);
                double r21 = (a121*a211)+(a122*a221)+(a123*a231);
                double r22 = (a121*a212)+(a122*a222)+(a123*a232);
                double r23 = (a121*a213)+(a122*a223)+(a123*a233);
                double r31 = (a131*a211)+(a132*a221)+(a133*a231);
                double r32 = (a131*a212)+(a132*a222)+(a133*a232);
                double r33 = (a131*a213)+(a132*a223)+(a133*a233);

                tv_result.setText(""+r11+"     "+r12+"     "+r13+"\n"+r21+"     "+r22+"     "+r23+"\n"+r31+"     "+r32+"     "+r33);


            }
        });

    }
}
