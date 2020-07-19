package com.example.prashant.calculator_1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.widget.TextView;
import android.support.v4.*;

import java.text.DecimalFormat;


public class Inverse2by2page extends Activity {

    EditText eta11;
    EditText eta12;
    EditText eta21;
    EditText eta22;
    Button btinvanswer;
    TextView tvinvanswer;

    DecimalFormat t = new DecimalFormat("###,###.###");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inverse2by2page);

        eta11 = (EditText)findViewById(R.id.etinv22a11);
        eta12 = (EditText)findViewById(R.id.etinv22a12);
        eta21 = (EditText)findViewById(R.id.etinv22a21);
        eta22 = (EditText)findViewById(R.id.etinv22a22);
        btinvanswer = (Button)findViewById(R.id.btinv2by2result);
        tvinvanswer = (TextView)findViewById(R.id.tvinv2by2result);

        btinvanswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double aa11 = Double.parseDouble(eta11.getText().toString());
                double aa12 = Double.parseDouble(eta12.getText().toString());
                double aa21 = Double.parseDouble(eta21.getText().toString());
                double aa22 = Double.parseDouble(eta22.getText().toString());

                double sum = (aa11*aa22)-(aa21*aa12);

                if(sum==0)
                {
                    openDialog();
                }
                else
                {

                aa11 = aa11/sum;
                aa12 = aa12/sum;
                aa21 = aa21/sum;
                aa22 = aa22/sum;



                tvinvanswer.setText(""+t.format(aa22)+"     "+t.format(-aa12)+"\n"+t.format(-aa21)+"     "+t.format(aa11));
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
