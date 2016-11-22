package com.example.cfgs2inf.taula;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class element extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_element);
        Bundle b = getIntent().getExtras();

        TextView nom,serie,grup,massa,conf,electrons,link;
        ImageView foto;

        nom=(TextView)findViewById(R.id.txtnom);
        serie=(TextView)findViewById(R.id.txtserie);
        grup=(TextView)findViewById(R.id.txtgrup);
        massa=(TextView)findViewById(R.id.txtmassa);
        conf=(TextView)findViewById(R.id.txtconf);
        electrons=(TextView)findViewById(R.id.txtelectrons);
        link=(TextView)findViewById(R.id.txtwiki);
        foto=(ImageView) findViewById(R.id.foto);

        switch(b.getString("element")){
            case "Hidrogen":
                nom.setText("Hidrogen");
                serie.setText("No Metalls");
                grup.setText("1,1,s");
                massa.setText("1,00794 u");
                conf.setText("1S");
                electrons.setText("1");
                foto.setImageResource(R.drawable.h);
                link.setOnClickListener(new View.OnClickListener(){

                    public void onClick(View v){
                        Uri url = Uri.parse("https://es.wikipedia.org/wiki/Hidr%C3%B3geno");
                        Intent intent = new Intent(Intent.ACTION_VIEW,url);
                        startActivity(intent);
                    }

                });
            case "Liti":
                nom.setText("Liti");
                serie.setText("Metalls");
                grup.setText("1,2,s");
                massa.setText("1,00794 u");
                conf.setText("1s2 2s1 o [He]2s1\n+2, 1");
                electrons.setText("0,98 (escala de Pauling)");
                foto.setImageResource(R.drawable.li);
                link.setOnClickListener(new View.OnClickListener(){

                    public void onClick(View v){
                        Uri url = Uri.parse("https://ca.wikipedia.org/wiki/Liti");
                        Intent intent = new Intent(Intent.ACTION_VIEW,url);
                        startActivity(intent);
                    }

                });
                break;

            case "Berili":
                nom.setText("Beril·li");
                serie.setText("Metalls alcalinoterris");
                grup.setText("2,2,s");
                massa.setText("9,012182(3)");
                conf.setText("1s2 2s2\n" +"2, 2");
                electrons.setText("1,57 (escala de Pauling)");
                foto.setImageResource(R.drawable.li);
                link.setOnClickListener(new View.OnClickListener(){

                    public void onClick(View v){
                        Uri url = Uri.parse("https://ca.wikipedia.org/wiki/Beril%C2%B7li");
                        Intent intent = new Intent(Intent.ACTION_VIEW,url);
                        startActivity(intent);
                    }

                });
                break;
            case "Sodi":
                nom.setText("Sodi");
                serie.setText("Metalls alcalins");
                grup.setText("1, 3, s");
                massa.setText("22,98976928(2)");
                conf.setText("ne 3s 2,8,1");
                electrons.setText("0,93 (escala de Pauling)");
                foto.setImageResource(R.drawable.na);
                link.setOnClickListener(new View.OnClickListener(){

                    public void onClick(View v){
                        Uri url = Uri.parse("https://ca.wikipedia.org/wiki/Sodi");
                        Intent intent = new Intent(Intent.ACTION_VIEW,url);
                        startActivity(intent);
                    }

                });
                break;

            case "Magnesi":
                nom.setText("\"Magnesi\"");
                serie.setText("Metalls alcalinoterris");
                grup.setText("2,3,s");
                massa.setText("22,98976928(2)");
                conf.setText("[Ne] 3s2\n, 2, 8, 2\n");
                electrons.setText("1,31 (escala de Pauling)");
                foto.setImageResource(R.drawable.mg);
                link.setOnClickListener(new View.OnClickListener(){

                    public void onClick(View v){
                        Uri url = Uri.parse("https://ca.wikipedia.org/wiki/Magnesi");
                        Intent intent = new Intent(Intent.ACTION_VIEW,url);
                        startActivity(intent);
                    }

                });
                break;
            case "Potasi":
                nom.setText("Potassi");
                serie.setText("Metalls alcalins");
                grup.setText("1,4,s");
                massa.setText("39,0983(1)");
                conf.setText("[Ar] 4s1\n 2, 8, 8, 1");
                electrons.setText("0,82 (escala de Pauling)");
                foto.setImageResource(R.drawable.k);
                link.setOnClickListener(new View.OnClickListener(){

                    public void onClick(View v){
                        Uri url = Uri.parse("https://ca.wikipedia.org/wiki/Potassi");
                        Intent intent = new Intent(Intent.ACTION_VIEW,url);
                        startActivity(intent);
                    }

                });
                break;
            case "Calci":
                nom.setText("Calci");
                serie.setText("Metalls alcalinoterns");
                grup.setText("2,4,s");
                massa.setText("39,0983(1)");
                conf.setText("[Ar] 4s2\n2, 8, 8, 2");
                electrons.setText(	"1,00 (escala de Pauling)");
                foto.setImageResource(R.drawable.ca);
                link.setOnClickListener(new View.OnClickListener(){

                    public void onClick(View v){
                        Uri url = Uri.parse("https://ca.wikipedia.org/wiki/Calci");
                        Intent intent = new Intent(Intent.ACTION_VIEW,url);
                        startActivity(intent);
                    }

                });
                break;

            case "Rubidi":
                nom.setText("Rubidi");
                serie.setText("Metalls alcalins");
                grup.setText("1,5,s");
                massa.setText("85,4678(3)");
                conf.setText("[Kr] 5s1 2, 8, 18, 8, 1");
                electrons.setText(	"\t0,82 (escala de Pauling)");
                foto.setImageResource(R.drawable.rb);
                link.setOnClickListener(new View.OnClickListener(){

                    public void onClick(View v){
                        Uri url = Uri.parse("https://ca.wikipedia.org/wiki/Rubidi");
                        Intent intent = new Intent(Intent.ACTION_VIEW,url);
                        startActivity(intent);
                    }

                });
                break;
            case "Cesi":
                nom.setText("Cesi");
                serie.setText("Metalls alcalins");
                grup.setText("1,6,s");
                massa.setText("132,9054519(2)");
                conf.setText("[Xe] 6s1 2, 8, 18, 18, 8, 1");
                electrons.setText(	"0,79 (escala de Pauling)");
                foto.setImageResource(R.drawable.cs);
                link.setOnClickListener(new View.OnClickListener(){

                    public void onClick(View v){
                        Uri url = Uri.parse("https://ca.wikipedia.org/wiki/Cesi");
                        Intent intent = new Intent(Intent.ACTION_VIEW,url);
                        startActivity(intent);
                    }

                });
                break;
            case "Bari":
                nom.setText("Cesi");
                serie.setText("Metalls alcalinoterris");
                grup.setText("2,6,s");
                massa.setText("137,33");
                conf.setText("[Xe] 6s2 2, 8, 18, 18, 8, 2");
                electrons.setText(	"0,89 (escala de Pauling");
                foto.setImageResource(R.drawable.ba);
                link.setOnClickListener(new View.OnClickListener(){

                    public void onClick(View v){
                        Uri url = Uri.parse("https://ca.wikipedia.org/wiki/Bari_(element)");
                        Intent intent = new Intent(Intent.ACTION_VIEW,url);
                        startActivity(intent);
                    }

                });
                break;

            case "Franci":
                nom.setText("Franci");
                serie.setText("Metalls alcalins");
                grup.setText("1,7,s");
                massa.setText("(223)");
                conf.setText("[Rn] 7s12, 8, 18, 32, 18, 8, 1");
                electrons.setText(	"\t0,7 (escala de Pauling)");
                foto.setImageResource(R.drawable.fr);
                link.setOnClickListener(new View.OnClickListener(){

                    public void onClick(View v){
                        Uri url = Uri.parse("https://ca.wikipedia.org/wiki/Franci");
                        Intent intent = new Intent(Intent.ACTION_VIEW,url);
                        startActivity(intent);
                    }

                });
                break;
            case "Radi":
                nom.setText("Radi");
                serie.setText("Metalls alcalinoterris");
                grup.setText("2,7,s");
                massa.setText("(226)");
                conf.setText("[Rn] 7s12, 2, 8, 12, 18, 8, 1");
                electrons.setText(	"0,9 (escala de Pauling)");
                foto.setImageResource(R.drawable.ra);
                link.setOnClickListener(new View.OnClickListener(){

                    public void onClick(View v){
                        Uri url = Uri.parse("https://ca.wikipedia.org/wiki/Radi_(element)");
                        Intent intent = new Intent(Intent.ACTION_VIEW,url);
                        startActivity(intent);
                    }

                });
                break;

        }

    }




    }

