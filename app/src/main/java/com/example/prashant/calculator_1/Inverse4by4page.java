package com.example.prashant.calculator_1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Inverse4by4page extends AppCompatActivity {

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
    DecimalFormat t = new DecimalFormat("###,###.#");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inverse4by4page);

        eta11 = (EditText)findViewById(R.id.etinv44a11);
        eta12 = (EditText)findViewById(R.id.etinv44a12);
        eta13 = (EditText)findViewById(R.id.etinv44a13);
        eta14 = (EditText)findViewById(R.id.etinv44a14);
        eta21 = (EditText)findViewById(R.id.etinv44a21);
        eta22 = (EditText)findViewById(R.id.etinv44a22);
        eta23 = (EditText)findViewById(R.id.etinv44a23);
        eta24 = (EditText)findViewById(R.id.etinv44a24);
        eta31 = (EditText)findViewById(R.id.etinv44a31);
        eta32 = (EditText)findViewById(R.id.etinv44a32);
        eta33 = (EditText)findViewById(R.id.etinv44a33);
        eta34 = (EditText)findViewById(R.id.etinv44a34);
        eta41 = (EditText)findViewById(R.id.etinv44a41);
        eta42 = (EditText)findViewById(R.id.etinv44a42);
        eta43 = (EditText)findViewById(R.id.etinv44a43);
        eta44 = (EditText)findViewById(R.id.etinv44a44);
        result = (Button)findViewById(R.id.btinv4by4result);
        answer = (TextView)findViewById(R.id.tvinv4by4result);

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

                if(sum==0)
                {
                    openDialog();
                }
                else
                {
                    double x11 = c22*((c33*c44)-(c43*c34)) -c23*((c32*c44)-(c42*c34)) + c24*((c32*c43)-(c42*c33));
                    double x12 = -c21*((c33*c44)-(c43*c34)) -c23*((c31*c44)-(c41*c34)) + c24*((c31*c42)-(c32*c41));
                    double x13 = c21*((c32*c44)-(c42*c34)) -c22*((c31*c44)-(c41*c34)) + c24*((c31*c42)-(c32*c41));
                    double x14 = -c21*((c32*c43)-(c42*c33)) -c22*((c31*c43)-(c41*c33)) + c23*((c31*c42)-(c32*c41));
                    double x21 = c12*((c33*c44)-(c43*c34)) -c13*((c32*c44)-(c42*c34)) + c14*((c32*c43)-(c42*c33));
                    double x22 = c11*((c33*c44)-(c43*c34)) -c13*((c31*c44)-(c41*c34)) + c14*((c31*c43)-(c41*c33));
                    double x23 = c11*((c32*c44)-(c42*c34)) -c12*((c31*c44)-(c41*c34)) + c14*((c31*c42)-(c41*c32));
                    double x24 = c11*((c32*c43)-(c42*c33)) -c12*((c31*c43)-(c41*c33)) + c13*((c13*c42)-(c41*c32));
                    double x31 = c12*((c23*c44)-(c43*c24)) -c13*((c22*c44)-(c42*c24)) + c14*((c22*c43)-(c42*c23));
                    double x32 = c11*((c23*c44)-(c43*c24)) -c13*((c21*c44)-(c41*c24)) + c14*((c21*c43)-(c41*c23));
                    double x33 = c11*((c22*c44)-(c42*c24)) -c12*((c21*c44)-(c41*c24)) + c14*((c22*c41)-(c42*c21));
                    double x34 = c11*((c22*c43)-(c42*c23)) -c12*((c21*c42)-(c41*c22)) + c13*((c21*c42)-(c41*c22));
                    double x41 = c12*((c23*c34)-(c33*c24)) -c13*((c22*c34)-(c32*c24)) + c14*((c22*c33)-(c32*c23));
                    double x42 = c11*((c23*c34)-(c33*c24)) -c13*((c21*c34)-(c31*c24)) + c14*((c21*c33)-(c31*c23));
                    double x43 = c11*((c22*c44)-(c32*c24)) -c12*((c21*c44)-(c31*c24)) + c14*((c21*c32)-(c31*c22));
                    double x44 = c11*((c22*c33)-(c32*c23)) -c12*((c21*c33)-(c31*c23)) + c13*((c21*c32)-(c31*c22));

                    x11 = x11/sum;
                    x12 = x12/sum;
                    x13 = x13/sum;
                    x14 = x14/sum;
                    x21 = x21/sum;
                    x22 = x22/sum;
                    x23 = x23/sum;
                    x24 = x24/sum;
                    x31 = x31/sum;
                    x32 = x32/sum;
                    x33 = x33/sum;
                    x34 = x34/sum;
                    x41 = x41/sum;
                    x42 = x42/sum;
                    x43 = x43/sum;
                    x44 = x44/sum;



                    answer.setText(""+t.format(x11)+"     "+t.format(x21)+"     "+t.format(x31)+"     "+t.format(x41)+"\n"+t.format(x12)+"     "+t.format(x22)+"     "+t.format(x32)+"     "+t.format(x42)+"\n"+t.format(x13)+"     "+t.format(x23)+"     "+t.format(x33)+"     "+t.format(x43)+"\n"+t.format(x14)+"     "+t.format(x24)+"     "+t.format(x34)+"     "+t.format(x44));


                }
            }
        });
    }
    public void openDialog() {
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("WARNING");
        alertDialog.setMessage("Determinant is zero Enter valid value");
        alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertDialog.show();
    }
}
