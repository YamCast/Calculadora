package com.example.calcyam;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvdisplay = (TextView) findViewById(R.id.tv_dis);
    double n1, n2, res;
    String Operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void btncero(View View) {
        tvdisplay= (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"0");
    }

    public void btnuno(View View) {
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"1");
    }

    public void btndos(View View) {
        tvdisplay= (TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"2");
    }
    public void btntres(View View) {
        tvdisplay= (TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"3");
    }
    public void btncuatr(View View) {
        tvdisplay= (TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"4");
    }

    public void btncinc(View View) {
        tvdisplay= (TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"5");
    }
    public void btnseis(View View) {
        tvdisplay= (TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"6");
    }
    public void btnsie(View View) {
        tvdisplay= (TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"7");
    }

    public void btnoct(View View) {
        tvdisplay= (TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"8");
    }

    public void btnnuev(View View) {
        tvdisplay= (TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"9");
    }


    //capturando los datos
    public void onClickOperacionCapt1(View View){
        tvdisplay=(TextView) findViewById(R.id.tv_dis);
        n1=Double.parseDouble(tvdisplay.getText().toString());
        tvdisplay.setText("");
    }


    //mostrar simbolos de las operaciones
    public void sumar(View View){
        Operador="+";
        onClickOperacionCapt1(View);
    }
    public void rest(View View){
        Operador="-";
        onClickOperacionCapt1(View);
    }
    public void mult(View View){
        Operador="*";
        onClickOperacionCapt1(View);
    }
    public void div(View View){
        Operador="/";
        onClickOperacionCapt1(View);
    }


    //es otra operacion
    public void Expn(View View){
        Operador="exp";
        tvdisplay=(TextView) findViewById(R.id.tv_dis);
        try{

            n1= Double.parseDouble(tvdisplay.getText().toString());
            tvdisplay.setText("");

        }catch (NumberFormatException nfe) {}

    }


    //boton de resultado
    //operaciones a seguir
    public void btnigual(View View){
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        n2=Double.parseDouble(tvdisplay.getText().toString());
        //condicional para rta
        if(Operador.equals("+")){
            res=n1+n2;
        }else if(Operador.equals("-")){
            res=n1-n2;
        }else if(Operador.equals("*")){
            res=n1*n2;
        }else if(Operador.equals("/")){
            res=n1/n2;
        }else if(Operador.equals("exp")){
            tvdisplay=(TextView)findViewById(R.id.tv_dis);
            n2=Double.parseDouble(tvdisplay.getText().toString());
            tvdisplay.setText(" ");
            res=Math.pov(n1,n2);
        }
    }



}