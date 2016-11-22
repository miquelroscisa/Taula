package com.example.cfgs2inf.taula;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
public class periodica extends AppCompatActivity{

Bundle b = new Bundle();
 String element;
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_periodica);
    ImageButton btnh, btnli, btnbe, btnna, btnmg, btnk, btnca, btnrb, btnsr, btncs, btnba, btnfr, btnra;
    btnh = (ImageButton) findViewById(R.id.h);
    btnli = (ImageButton) findViewById(R.id.li);
    btnbe = (ImageButton) findViewById(R.id.be);
    btnna = (ImageButton) findViewById(R.id.na);
    btnmg = (ImageButton) findViewById(R.id.mg);
    btnk = (ImageButton) findViewById(R.id.k);
    btnca = (ImageButton) findViewById(R.id.ca);
    btnrb = (ImageButton) findViewById(R.id.rb);
    btnsr = (ImageButton) findViewById(R.id.sr);
    btncs = (ImageButton) findViewById(R.id.cs);
    btnba = (ImageButton) findViewById(R.id.ca);
    btnfr = (ImageButton) findViewById(R.id.fr);
    btnra = (ImageButton) findViewById(R.id.ra);
}

    public void sell(Bundle b){
        Intent bonesintencions = new Intent(periodica.this, element.class);
        bonesintencions.putExtras(b);
        startActivity(bonesintencions);
    }

    public void btnH(View v) {
        element = "Hidrogen";
        b.putString("element", element.toString());
        sell(b);
    }


    public void btnLi(View v) {
        element = "Liti";
        b.putString("element", element.toString());
        sell(b);
    }

    public void btnBe(View v) {
        element = "Beril·li";
        b.putString("element", element.toString());
        sell(b);
    }

    public void btnNa(View v) {
        element = "Sodi";
        b.putString("element", element.toString());
        sell(b);
    }

    public void btnMg(View v) {
        element = "Magnesi";
        b.putString("element", element.toString());
        sell(b);
    }

    public void btnK(View v) {
        element = "Potassi";
        b.putString("element", element.toString());
        sell(b);
    }

    public void btnCa(View v) {
        element = "Calci";
        b.putString("element", element.toString());
        sell(b);
    }

    public void btnRb(View v) {
        element = "Rubidi";
        b.putString("element", element.toString());
        sell(b);
    }

    public void btnSr(View v) {
        element = "Estronci";
        b.putString("element", element.toString());
        sell(b);
    }

    public void btnCs(View v) {
        element = "Cesi";
        b.putString("element", element.toString());
        sell(b);
    }

    public void btnBa(View v) {
        element = "Bari";
        b.putString("element", element.toString());
        sell(b);
    }

    public void btnFr(View v) {
        element = "Franci";
        b.putString("element", element.toString());
        sell(b);
    }

    public void btnRa(View v) {
        element = "Radi";
        b.putString("element", element.toString());
        sell(b);
    }


}
