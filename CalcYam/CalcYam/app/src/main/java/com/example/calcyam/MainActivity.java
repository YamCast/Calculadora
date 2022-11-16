package com.example.calcyam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvdisplay;
    double n1, n2, res;
    String Operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btncero(View View) {
        tvdisplay= (TextView)findViewById(R.id.);
        tvdisplay.setText(tvdisplay.getText()+"0");
    }

    public void btnuno(View View) {
        tvdisplay= (TextView)findViewById(R.id.);
        tvdisplay.setText(tvdisplay.getText()+"1");
    }

    public void btndos(View View) {
        tvdisplay= (TextView)findViewById(R.id.);
        tvdisplay.setText(tvdisplay.getText()+"2");
    }
    public void btntres(View View) {
        tvdisplay= (TextView)findViewById(R.id.);
        tvdisplay.setText(tvdisplay.getText()+"3");
    }
    public void btncuatro(View View) {
        tvdisplay= (TextView)findViewById(R.id.);
        tvdisplay.setText(tvdisplay.getText()+"4");
    }

}