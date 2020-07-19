package com.example.prashant.calculator_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Adjoint2by2page extends AppCompatActivity {

    EditText eta11;
    EditText eta12;
    EditText eta21;
    EditText eta22;
    Button btadjanswer;
    TextView tvadjanswer;
    DecimalFormat t = new DecimalFormat("###,###.###");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjoint2by2page);

        eta11 = (EditText)findViewById(R.id.etadj22a11);
        eta12 = (EditText)findViewById(R.id.etadj22a12);
        eta21 = (EditText)findViewById(R.id.etadj22a21);
        eta22 = (EditText)findViewById(R.id.etadj22a22);
        btadjanswer = (Button)findViewById(R.id.btadj2by2result);
        tvadjanswer = (TextView)findViewById(R.id.tvadj2by2result);

        btadjanswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double aa11 = Double.parseDouble(eta11.getText().toString());
                double aa12 = Double.parseDouble(eta12.getText().toString());
                double aa21 = Double.parseDouble(eta21.getText().toString());
                double aa22 = Double.parseDouble(eta22.getText().toString());

                double sum = (aa11*aa22)-(aa21*aa12);



              /*  aa11 = aa11/sum;
                aa12 = aa12/sum;
                aa21 = aa21/sum;
                aa22 = aa22/sum;
                */
              tvadjanswer.setText(""+t.format(aa22)+"     "+t.format(-aa12)+"\n"+t.format(-aa21)+"     "+t.format(aa11));
            }
        });
    }
}
