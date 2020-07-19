package com.example.prashant.calculator_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Transpose2by2page extends AppCompatActivity {

    EditText eta11;
    EditText eta12;
    EditText eta21;
    EditText eta22;
    Button bttraanswer;
    TextView tvtraanswer;

    DecimalFormat t = new DecimalFormat("###,###.###");
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transpose2by2page);

        eta11 = (EditText)findViewById(R.id.ettra22a11);
        eta12 = (EditText)findViewById(R.id.ettra22a12);
        eta21 = (EditText)findViewById(R.id.ettra22a21);
        eta22 = (EditText)findViewById(R.id.ettra22a22);
        bttraanswer = (Button)findViewById(R.id.bttra2by2result);
        tvtraanswer = (TextView)findViewById(R.id.tvtra2by2result);

        bttraanswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double aa11 = Double.parseDouble(eta11.getText().toString());
                double aa12 = Double.parseDouble(eta12.getText().toString());
                double aa21 = Double.parseDouble(eta21.getText().toString());
                double aa22 = Double.parseDouble(eta22.getText().toString());

                tvtraanswer.setText(""+t.format(aa11)+"     "+t.format(aa21)+"\n"+t.format(aa12)+"     "+t.format(aa22));
            }
        });
    }
}
