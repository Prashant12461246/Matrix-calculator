package com.example.prashant.calculator_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Det4by4page extends AppCompatActivity {
    EditText eta11;
    EditText eta12;
    EditText eta13;
    EditText eta14;
    EditText eta21;
    EditText eta22;
    EditText eta23;
    EditText eta24;
    EditText eta31;
    EditText eta32;
    EditText eta33;
    EditText eta34;
    EditText eta41;
    EditText eta42;
    EditText eta43;
    EditText eta44;
    Button result;
    TextView answer;
    DecimalFormat t = new DecimalFormat("#####,###.##");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_det4by4page);

        eta11 = (EditText)findViewById(R.id.etinv44a11);
        eta12 = (EditText)findViewById(R.id.etinv44a12);
        eta13 = (EditText)findViewById(R.id.etinv44a13);
        eta14 = (EditText)findViewById(R.id.etinv44a14);
        eta21 = (EditText)findViewById(R.id.etinv44a21);
        eta22 = (EditText)findViewById(R.id.etdet44a22);
        eta23 = (EditText)findViewById(R.id.etdet44a23);
        eta24 = (EditText)findViewById(R.id.etdet44a24);
        eta31 = (EditText)findViewById(R.id.etinv44a31);
        eta32 = (EditText)findViewById(R.id.etdet44a32);
        eta33 = (EditText)findViewById(R.id.etdet44a33);
        eta34 = (EditText)findViewById(R.id.etdet44a34);
        eta41 = (EditText)findViewById(R.id.etinv44a41);
        eta42 = (EditText)findViewById(R.id.etdet44a42);
        eta43 = (EditText)findViewById(R.id.etdet44a43);
        eta44 = (EditText)findViewById(R.id.etdet44a44);
        result = (Button)findViewById(R.id.btdet4by4result);
        answer = (TextView)findViewById(R.id.tvdet4by4result);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double c11 = Double.parseDouble(eta11.getText().toString());
                double c12 = Double.parseDouble(eta12.getText().toString());
                double c13 = Double.parseDouble(eta13.getText().toString());
                double c14 = Double.parseDouble(eta14.getText().toString());
                double c21 = Double.parseDouble(eta21.getText().toString());
                double c22 = Double.parseDouble(eta22.getText().toString());
                double c23 = Double.parseDouble(eta23.getText().toString());
                double c24 = Double.parseDouble(eta24.getText().toString());
                double c31 = Double.parseDouble(eta31.getText().toString());
                double c32 = Double.parseDouble(eta32.getText().toString());
                double c33 = Double.parseDouble(eta33.getText().toString());
                double c34 = Double.parseDouble(eta34.getText().toString());
                double c41 = Double.parseDouble(eta41.getText().toString());
                double c42 = Double.parseDouble(eta42.getText().toString());
                double c43 = Double.parseDouble(eta43.getText().toString());
                double c44 = Double.parseDouble(eta44.getText().toString());

                double sum = 0 ;
                double m1= 0;
                double m2 = 0;
                double m3 =0;
                double m4 =0;

                m1 = c11*(c22*((c33*c44)-(c43*c34))-c23*((c32*c44)-(c42*c34))+c24*((c32*c43)-(c33*c42)));
                m2 = c12*(c21*((c33*c44)-(c43*c34))-c23*((c31*c44)-(c41*c34))+c24*((c31*c42)-(c32*c41)));
                m3 = c13*(c21*((c32*c44)-(c42*c34))-c22*((c31*c44)-(c41*c34))+c24*((c31*c42)-(c32*c41)));
                m4 = c14*(c21*((c32*c43)-(c42*c33))-c22*((c31*c43)-(c41*c33))+c23*((c31*c42)-(c32*c41)));

                sum = m1 - m2 + m3 - m4;

                answer.setText(""+t.format(sum));
            }
        });
    }
}
