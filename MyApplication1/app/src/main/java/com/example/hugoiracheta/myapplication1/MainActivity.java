package com.example.hugoiracheta.myapplication1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    public static int NCM=0;
    public static child a = new child();
    int already;
    int choice;

    public MainActivity() {
        choice = 0;
        already = 0;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView btn1 = (ImageView) findViewById(R.id.maribel);
        btn1.setOnClickListener(this);
        a.makeChilds();
        ((ImageView) findViewById(R.id.pendeja)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.pendeja2)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.roberta)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.cintia)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.sumia)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.sumisa)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.jhon_cena)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.buscar)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.tablon)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.sully)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.merchant)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.healercasiplana)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.miriel)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.buenaparandadeadulta)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.waifu)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.severa)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.brincobrinco)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.sayri)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.poppy)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.hijadetablon)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.nosumisa)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.fmorgan)).setOnClickListener(this);
    }


    public void onBackPressed() {
        if (choice == 1) {
            ((ImageView) findViewById(already)).setColorFilter(Color.parseColor("#003F51B5"));
            choice = 0;
            ((ImageView) findViewById(R.id.next)).setColorFilter(Color.parseColor("#af696063"));
            return;
        }
        finish();
    }

    public void onClick(View v) {
        int i = choice;
        if (i == 1) {
            i = already;
            ((ImageView) findViewById(i)).setColorFilter(Color.parseColor("#003F51B5"));
        }
        switch (v.getId()) {
            case R.id.next /*2131558516*/:
                i = choice;
                if (i == 1) {
                    startActivity(new Intent(this, hombres.class));
                    finish();
                    break;
                }
                break;
            case R.id.maribel:
                ImageView btn1 = (ImageView) findViewById(R.id.maribel);
                btn1.setOnClickListener(this);
                btn1.setColorFilter(Color.parseColor("#af696063"));
                already = R.id.maribel;
                choice = 1;
                hombres.mujeres = 1;
                NCM = 0;
                break;
            case R.id.poppy /*2131558519*/:
                ImageView btn21 = (ImageView) findViewById(R.id.poppy);
                btn21.setOnClickListener(this);
                btn21.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.poppy;
                hombres.mujeres = 20;
                NCM = 1;
                break;
            case R.id.pendeja /*2131558520*/:
                ImageView btn2 = (ImageView) findViewById(R.id.pendeja);
                btn2.setOnClickListener(this);
                btn2.setColorFilter(Color.parseColor("#af696063"));
                already = R.id.pendeja;
                choice = 1;
                hombres.mujeres = 2;
                NCM = 0;
                break;
            case R.id.roberta /*2131558521*/:
                ImageView btn4 = (ImageView) findViewById(R.id.roberta);
                btn4.setOnClickListener(this);
                btn4.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                NCM = 0;
                already = R.id.roberta;
                hombres.mujeres = 3;
                break;
            case R.id.cintia /*2131558522*/:
                ImageView btn5 = (ImageView) findViewById(R.id.cintia);
                btn5.setOnClickListener(this);
                btn5.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.cintia;
                hombres.mujeres = 4;
                NCM = 1;
                break;
            case R.id.sumia /*2131558523*/:
                ImageView btn6 = (ImageView) findViewById(R.id.sumia);
                btn6.setOnClickListener(this);
                btn6.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.sumia;
                hombres.mujeres = 5;
                NCM = 0;
                break;
            case R.id.jhon_cena /*2131558524*/:
                ImageView btn7 = (ImageView) findViewById(R.id.jhon_cena);
                btn7.setOnClickListener(this);
                btn7.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.jhon_cena;
                hombres.mujeres = 6;
                NCM = 1;
                break;
            case R.id.buscar /*2131558525*/:
                ImageView btn8 = (ImageView) findViewById(R.id.buscar);
                btn8.setOnClickListener(this);
                btn8.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.buscar;
                hombres.mujeres = 7;
                NCM = 0;
                break;
            case R.id.tablon /*2131558526*/:
                ImageView btn9 = (ImageView) findViewById(R.id.tablon);
                btn9.setOnClickListener(this);
                btn9.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.tablon;
                hombres.mujeres = 8;
                NCM = 0;
                break;
            case R.id.pendeja2 /*2131558527*/:
                ImageView btn10 = (ImageView) findViewById(R.id.pendeja2);
                btn10.setOnClickListener(this);
                btn10.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.pendeja2;
                hombres.mujeres = 9;
                NCM = 1;
                break;
            case R.id.sully /*2131558528*/:
                ImageView btn11 = (ImageView) findViewById(R.id.sully);
                btn11.setOnClickListener(this);
                btn11.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.sully;
                hombres.mujeres = 10;
                NCM = 0;
                break;
            case R.id.merchant /*2131558529*/:
                ImageView btn12 = (ImageView) findViewById(R.id.merchant);
                btn12.setOnClickListener(this);
                btn12.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.merchant;
                hombres.mujeres = 11;
                NCM = 1;
                break;
            case R.id.sumisa /*2131558530*/:
                ImageView btn13 = (ImageView) findViewById(R.id.sumisa);
                btn13.setOnClickListener(this);
                btn13.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.sumisa;
                hombres.mujeres = 12;
                NCM = 0;
                break;
            case R.id.nosumisa /*2131558531*/:
                ImageView btn14 = (ImageView) findViewById(R.id.nosumisa);
                btn14.setOnClickListener(this);
                btn14.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.nosumisa;
                hombres.mujeres = 13;
                NCM = 1;
                break;
            case R.id.healercasiplana /*2131558532*/:
                ImageView btn15 = (ImageView) findViewById(R.id.healercasiplana);
                btn15.setOnClickListener(this);
                btn15.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.healercasiplana;
                hombres.mujeres = 14;
                NCM = 0;
                break;
            case R.id.miriel /*2131558533*/:
                ImageView btn16 = (ImageView) findViewById(R.id.miriel);
                btn16.setOnClickListener(this);
                btn16.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.miriel;
                hombres.mujeres = 15;
                NCM = 0;
                break;
            case R.id.buenaparandadeadulta /*2131558534*/:
                ImageView btn17 = (ImageView) findViewById(R.id.buenaparandadeadulta);
                btn17.setOnClickListener(this);
                btn17.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.buenaparandadeadulta;
                hombres.mujeres = 16;
                NCM = 1;
                break;
            case R.id.waifu /*2131558535*/:
                ImageView btn18 = (ImageView) findViewById(R.id.waifu);
                btn18.setOnClickListener(this);
                btn18.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.waifu;
                hombres.mujeres = 17;
                NCM = 0;
                break;
            case R.id.severa /*2131558536*/:
                ImageView btn24 = (ImageView) findViewById(R.id.severa);
                btn24.setOnClickListener(this);
                btn24.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.severa;
                hombres.mujeres = 23;
                NCM = 1;
                break;
            case R.id.brincobrinco /*2131558537*/:
                ImageView btn19 = (ImageView) findViewById(R.id.brincobrinco);
                btn19.setOnClickListener(this);
                btn19.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.brincobrinco;
                hombres.mujeres = 18;
                NCM = 0;
                break;
            case R.id.sayri /*2131558538*/:
                ImageView btn20 = (ImageView) findViewById(R.id.sayri);
                btn20.setOnClickListener(this);
                btn20.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.sayri;
                hombres.mujeres = 19;
                NCM = 1;
                break;
            case R.id.hijadetablon /*2131558539*/:
                ImageView btn22 = (ImageView) findViewById(R.id.hijadetablon);
                btn22.setOnClickListener(this);
                btn22.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.hijadetablon;
                hombres.mujeres = 21;
                NCM = 1;
                break;
            case R.id.fmorgan /*2131558540*/:
                ImageView btn25 = (ImageView) findViewById(R.id.fmorgan);
                btn25.setOnClickListener(this);
                btn25.setColorFilter(Color.parseColor("#af696063"));
                choice = 1;
                already = R.id.fmorgan;
                hombres.mujeres = 24;
                NCM = 1;
                break;
        }

        if (choice == 1) {
            ImageView btn1 = (ImageView) findViewById(R.id.next);
            btn1.setOnClickListener(this);
            btn1.setColorFilter(Color.parseColor("#003F51B5"));
            return;
        } else {
            ImageView btn1 = (ImageView) findViewById(R.id.next);
            btn1.setColorFilter(Color.parseColor("#af696063"));
        }
    }
}
