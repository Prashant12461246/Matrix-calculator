package com.example.prashant.calculator_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Det2by2page extends AppCompatActivity {

    EditText eta11;
    EditText eta12;
    EditText eta21;
    EditText eta22;
    Button btdetanswer;
    TextView tvdetanswer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_det2by2page);

        eta11 = (EditText)findViewById(R.id.ettra22a11);
        eta12 = (EditText)findViewById(R.id.ettra22a12);
        eta21 = (EditText)findViewById(R.id.ettra22a21);
        eta22 = (EditText)findViewById(R.id.etdet22a22);
        btdetanswer = (Button)findViewById(R.id.btdet2by2result);
        tvdetanswer = (TextView)findViewById(R.id.tvdet2by2result);

        btdetanswer.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                double aa11 = Double.parseDouble(eta11.getText().toString());
                double aa12 = Double.parseDouble(eta12.getText().toString());
                double aa21 = Double.parseDouble(eta21.getText().toString());
                double aa22 = Double.parseDouble(eta22.getText().toString());



                double sum = (aa11*aa22)-(aa21*aa12);

                tvdetanswer.setText(""+sum);
            }
        });

    }
}
