package com.example.cfgs2inf.taula;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ListAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button periodica,joc;
        periodica = (Button)findViewById(R.id.periodica);
        periodica.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Bundle b = new Bundle();
                Intent intencio = new Intent(MainActivity.this, periodica.class);
                intencio.putExtras(b);
                startActivity(intencio);
            }
        });
        joc=(Button)findViewById(R.id.joc);
        joc.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Bundle b = new Bundle();
                Intent intention = new Intent(MainActivity.this, joc.class);
                intention.putExtras(b);
                startActivity(intention);
            }
        });
        }

}
