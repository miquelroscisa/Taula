package com.example.cfgs2inf.taula;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;




public class joc extends AppCompatActivity {
    EditText h,k,li,fr,cs,be;


    int i=0;
    Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_joc);
        h=(EditText)findViewById(R.id.hr);
        k=(EditText)findViewById(R.id.kr);
        li=(EditText)findViewById(R.id.lir);
        fr=(EditText)findViewById(R.id.frr);
        cs=(EditText)findViewById(R.id.csr);
        be=(EditText)findViewById(R.id.ber);
        enviar = (Button)findViewById(R.id.corregir);
        if(h.getText().equals("H")){
            i++;
        }else {
            if (h.getText().equals("h")) {
                i++;
            }
        }
        if(k.getText().equals("K")){
            i++;
        }else {
            if (h.getText().equals("k")) {
                i++;
            }
        }
        if(li.getText().equals("LI")){
            i++;
        }else {
            if (li.getText().equals("li")) {
                i++;
            }
            if (li.getText().equals("Li")) {
                i++;
            }
        }
        if (fr.getText().equals("FR")) {
            i++;
        }else {
            if (fr.getText().equals("fr")) {
                i++;
            }
            if (li.getText().equals("Fr")) {
                i++;
            }
        }
        if (cs.getText().equals("CS")) {
            i++;
        }else {
            if (cs.getText().equals("cs")) {
                i++;
            }
            if (cs.getText().equals("Cs")) {
                i++;
            }
        }
        if (be.getText().equals("BE")) {
            i++;
        }else {
            if (be.getText().equals("be")) {
                i++;
            }
            if (li.getText().equals("Be")) {
                i++;
            }
        }
        enviar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Bundle b = new Bundle();
                Intent intencions = new Intent(joc.this, resultat_joc.class);
                intencions.putExtras(b);
                startActivity(intencions);
            }
        });
    }
}
