package com.example.cfgs2inf.taula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.R.attr.button;
import static android.R.attr.password;
import static com.example.cfgs2inf.taula.R.id.encerts;

public class resultat_joc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat_joc);
        Button menu;
        TextView resultat;
        Bundle b = new Bundle();
        menu =(Button)findViewById(R.id.menu);

        menu.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Bundle b = new Bundle();
                Intent retorn = new Intent(resultat_joc.this, MainActivity.class);
                retorn.putExtras(b);
                startActivity(retorn);
            }
        });
    }
}
