package com.example.prashant.calculator_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Transpose3by3page extends AppCompatActivity {

    EditText eta11;
    EditText eta12;
    EditText eta13;
    EditText eta21;
    EditText eta22;
    EditText eta23;
    EditText eta31;
    EditText eta32;
    EditText eta33;
    Button reult;
    TextView answer;
    DecimalFormat t = new DecimalFormat("###,###.##");
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transpose3by3page);

        eta11 = (EditText)findViewById(R.id.ettra33a11);
        eta12 = (EditText)findViewById(R.id.ettra33a12);
        eta13 = (EditText)findViewById(R.id.ettra33a13);
        eta21 = (EditText)findViewById(R.id.ettra33a21);
        eta22 = (EditText)findViewById(R.id.ettra33a22);
        eta23 = (EditText)findViewById(R.id.ettra33a23);
        eta31 = (EditText)findViewById(R.id.ettra33a31);
        eta32 = (EditText)findViewById(R.id.ettra33a32);
        eta33 = (EditText)findViewById(R.id.ettra33a33);
        reult = (Button)findViewById(R.id.bttra3by3result);
        answer = (TextView)findViewById(R.id.tvtra3by3reault);

        reult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double c11 = Double.parseDouble(eta11.getText().toString());
                double c12 = Double.parseDouble(eta12.getText().toString());
                double c13 = Double.parseDouble(eta13.getText().toString());
                double c21 = Double.parseDouble(eta21.getText().toString());
                double c22 = Double.parseDouble(eta22.getText().toString());
                double c23 = Double.parseDouble(eta23.getText().toString());
                double c31 = Double.parseDouble(eta31.getText().toString());
                double c32 = Double.parseDouble(eta32.getText().toString());
                double c33 = Double.parseDouble(eta33.getText().toString());

               /* double m11 = c11*((c22*c33)-(c32*c23));
                double m12 = -c12*((c21*c33)-(c31*c23));
                double m13 = c13*((c21*c32)-(c31*c22));

                double sum = m11 + m12 + m13;

                double x11 = ((c22*c33)-(c32*c23));
                double x12 = -((c21*c33)-(c31*c23));
                double x13 = ((c21*c32)-(c31*c22));
                double x21 = -((c12*c33)-(c32*c13));
                double x22 = ((c11*c33)-(c31*c13));
                double x23 = -((c11*c32)-(c31*c12));
                double x31 = ((c12*c23)-(c22*c13));
                double x32 = -((c11*c23)-(c21*c13));
                double x33 = ((c11*c22)-(c21*c12));

                x11 = x11 / sum;
                x12 = x12 / sum;
                x13 = x13 / sum;
                x21 = x21 / sum;
                x22 = x22 / sum;
                x23 = x23 / sum;
                x31 = x31 / sum;
                x32 = x32 / sum;
                x33 = x33 / sum; */

                answer.setText(""+t.format(c11)+"     "+t.format(c21)+"     "+t.format(c31)+"\n"+t.format(c12)+"     "+t.format(c22)+"     "+t.format(c32)+"\n"+t.format(c13)+"     "+t.format(c23)+"     "+t.format(c33));
            }
        });
    }
}
