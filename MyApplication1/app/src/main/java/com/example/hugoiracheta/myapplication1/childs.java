package com.example.hugoiracheta.myapplication1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.solver.widgets.ConstraintTableLayout;
import android.support.design.internal.BottomNavigationMenu;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class childs extends AppCompatActivity implements OnClickListener {
    public static int y;
    child i = MainActivity.a;

    public void imagen(int personaje) {
        ((ImageView) findViewById(R.id.child)).setImageResource(personaje);
    }

    public void campos(child kiddo) {
        switch(y){
            case 13://frederick
                i.calculate(i.brady,0,1,4,-1,4,0,3);
                i.calculate(i.noire,3,2,2,0,-2,4,1);
                i.calculate(i.nah,4,0,2,-3,2,6,3);
                i.calculate(i.owain,+1,	+1,	+2,	-1,	+3,	+2,	+2);
                i.calculate(i.brady,0,1,4,-1,4,0,3);
                i.calculate(i.severa,4,-2,5,1,0,3,0);
                i.calculate(i.kjelle,2,-2,5,1,1,2,1);
                i.calculate(i.laurent,1,2,4,0,1,1,1);
                i.calculate(i.yarne,5,-2,5,2,0,4,0);
                i.calculate(i.cynthia,1,-1,5,2,1,1,2);
                i.calculate(i.inigo,3,-1,4,0,1,2,0);
                i.calculate(i.gerome,6,-1,2,-2,1,5,-1);
                break;
            case 9://virion
                i.calculate(i.noire,1,3,2,4,-3,0,1);
                i.calculate(i.nah,2,2,2,1,1,2,3);
                i.calculate(i.gerome,3,1,2,2,0,1,-1);
                i.calculate(i.yarne,3,0,5,6,-1,0,0);
                i.calculate(i.kjelle,0,0,5,5,0,-2,1);
                i.calculate(i.severa,2,0,5,5,-1,-1,0);
                i.calculate(i.owain,-1,	+3,	+2,	+3,	+2,	-2,	+2);
                i.calculate(i.brady,-2,3,4,3,3,-4,3);
                i.calculate(i.laurent,-1,4,4,4,0,-3,1);
                i.calculate(i.inigo,1,1,4,4,0,-2,0);
                break;
            case 3://stahl
                i.calculate(i.noire,3,3,1,2,-4,4,0);
                i.calculate(i.gerome,6,0,1,0,-1,5,-2);
                i.calculate(i.nah,4,1,1,-1,0,6,2);
                i.calculate(i.inigo,3,0,3,2,-1,2,-1);
                i.calculate(i.yarne,5,-1,4,4,-2,4,-1);
                i.calculate(i.laurent,1,3,3,2,-1,1,0);
                i.calculate(i.severa,4,-1,4,3,-2,3,-1);
                i.calculate(i.brady,0,2,3,1,2,0,2);
                i.calculate(i.owain,+1,	+2,	+1,	+1,	+1,	+2,	+1);
                i.calculate(i.kjelle,2,-1,4,3,-1,2,0);
                break;
            case 21://vaike
                i.calculate(i.noire,4,2,1,3,-2,2,-1);
                i.calculate(i.gerome,7,-1,1,1,0,3,-3);
                i.calculate(i.nah,5,0,1,0,1,4,1);
                i.calculate(i.inigo,4,-1,3,3,0,0,-2);
                i.calculate(i.yarne,6,-2,4,5,-1,2,-2);
                i.calculate(i.kjelle,3,-1,4,4,0,0,-1);
                i.calculate(i.laurent,2,2,3,3,0,-1,-1);
                i.calculate(i.severa,5,-2,4,4,-1,1,-2);
                i.calculate(i.brady,1,1,3,2,3,-2,1);
                i.calculate(i.owain,+2,	+1,	+1,	+2,	+2,	0,0);
                break;
            case 15://kellam
                i.calculate(i.noire,2,4,1,0,-4,5,1);
                i.calculate(i.laurent,0,4,3,0,-1,2,1);
                i.calculate(i.nah,3,2,1,-3,0,7,3);
                i.calculate(i.gerome,5,1,1,-2,-1,6,-1);
                i.calculate(i.inigo,2,1,3,0,-1,3,0);
                i.calculate(i.yarne,4,0,4,2,-2,5,0);
                i.calculate(i.kjelle,1,0,4,1,-1,3,1);
                i.calculate(i.severa,3,0,4,1,-2,4,0);
                i.calculate(i.brady,-1,3,3,-1,2,1,3);
                i.calculate(i.owain,0,3,1,-1,1,3,2);
                break;
            case 11://donnel
                i.calculate(i.noire,2,3,-1,1,1,3,0);
                i.calculate(i.nah,3,1,-1,-1,5,5,2);
                i.calculate(i.gerome,5,0,-1,-1,4,4,-2);
                i.calculate(i.inigo,2,0,1,1,4,1,-1);
                i.calculate(i.yarne,4,-1,2,3,3,3,-1);
                i.calculate(i.severa,3,-1,2,2,3,2,-1);
                i.calculate(i.laurent,0,3,1,1,4,0,0);
                i.calculate(i.brady,-1,2,1,0,7,-1,2);
                i.calculate(i.owain,0,2,-1,0,6,1,1);
                i.calculate(i.kjelle,1,-1,2,2,4,1,0);
                break;
            case 10://lonqu
                i.calculate(i.noire,1,4,3,5,-2,0,-1);
                i.calculate(i.nah,2,2,3,2,2,2,1);
                i.calculate(i.gerome,4,1,3,3,1,1,-3);
                i.calculate(i.inigo,1,1,5,5,1,-2,-2);
                i.calculate(i.yarne,3,0,6,7,0,0,-2);
                i.calculate(i.laurent,-1,4,5,5,1,-3,-1);
                i.calculate(i.severa,2,0,6,6,0,-1,-2);
                i.calculate(i.brady,-2,3,5,4,4,-4,1);
                i.calculate(i.owain,-1,3,3,4,3,-2,0);
                i.calculate(i.kjelle,0,0,6,6,1,-2,-1);
                break;
            case 8://ricken
                i.calculate(i.noire,0,6,0,2,-1,1,1);
                i.calculate(i.nah,1,4,0,-1,3,3,3);
                i.calculate(i.gerome,3,3,0,0,2,2,-1);
                i.calculate(i.yarne,2,2,3,4,1,1,0);
                i.calculate(i.inigo,0,3,2,2,2,-1,0);
                i.calculate(i.laurent,-2,6,2,2,2,-2,1);
                i.calculate(i.kjelle,-1,2,3,3,2,-1,1);
                i.calculate(i.severa,1,2,3,3,1,0,0);
                i.calculate(i.brady,-3,5,2,1,5,-3,3);
                i.calculate(i.owain,-2,5,0,1,4,-1,2);
                break;
            case 22://gaius
                i.calculate(i.noire,2,3,2,4,-4,1,1);
                i.calculate(i.nah,3,1,2,1,0,3,3);
                i.calculate(i.yarne,4,-1,5,6,-2,1,0);
                i.calculate(i.inigo,2,0,4,4,-1,-1,0);
                i.calculate(i.gerome,5,0,2,2,-1,2,-1);
                i.calculate(i.laurent,0,3,4,4,-1,-2,1);
                i.calculate(i.kjelle,1,-1,5,5,-1,-1,1);
                i.calculate(i.severa,3,-1,5,5,-2,0,0);
                i.calculate(i.brady,-1,2,4,3,2,-3,3);
                i.calculate(i.owain,0,2,2,3,1,-1,2);
                i.calculate(i.cynthia,0,0,5,6,-1,-2,2);
                break;
            case 14://gregor
                i.calculate(i.noire,3,3,2,2,-3,3,-1);
                i.calculate(i.nah,4,1,2,-1,1,5,1);
                i.calculate(i.gerome,6,0,2,0,0,4,-3);
                i.calculate(i.inigo,3,0,4,2,0,1,-2);
                i.calculate(i.yarne,5,-1,5,4,-1,3,-2);
                i.calculate(i.laurent,1,3,4,2,0,0,-1);
                i.calculate(i.kjelle,2,-1,5,3,0,1,-1);
                i.calculate(i.severa,4,-1,5,3,-1,2,-2);
                i.calculate(i.brady,0,2,4,1,3,-1,1);
                i.calculate(i.owain,1,2,2,1,2,1,0);
                break;
            case 19://libra
                i.calculate(i.noire,1,5,1,2,-3,2,2);
                i.calculate(i.nah,2,3,1,-1,1,4,4);
                i.calculate(i.gerome,4,2,1,0,0,3,0);
                i.calculate(i.inigo,1,2,3,2,0,0,1);
                i.calculate(i.yarne,3,1,4,4,-1,2,1);
                i.calculate(i.laurent,-1,5,3,2,0,-1,2);
                i.calculate(i.severa,2,1,4,3,-1,1,1);
                i.calculate(i.brady,-2,4,3,1,3,-2,4);
                i.calculate(i.owain,1,4,1,1,2,0,3);
                i.calculate(i.kjelle,0,1,4,3,0,0,2);
                break;
            case 6://henry
                i.calculate(i.noire,2,5,2,2,-4,3,0);
                i.calculate(i.nah,3,3,4,-1,0,5,2);
                i.calculate(i.yarne,4,1,5,4,-2,3,-1);
                i.calculate(i.laurent,0,5,4,2,-1,0,0);
                i.calculate(i.severa,3,1,5,3,-2,2,-1);
                i.calculate(i.brady,-1,4,4,1,2,-1,2);
                i.calculate(i.owain,0,4,2,1,1,1,1);
                i.calculate(i.gerome,5,2,2,0,-1,4,-2);
                i.calculate(i.inigo,2,2,4,2,-1,1,-1);
                i.calculate(i.cynthia,0,2,5,4,-1,0,1);
                i.calculate(i.kjelle,1,1,5,3,-1,1,0);
                break;
        }
        ((TextView) findViewById(R.id.Class)).setText(kiddo.getCls());
        String strlvl = "Level " + String.valueOf(kiddo.getLvl());
        ((TextView) findViewById(R.id.LVL)).setText(strlvl);
        String strhp = "HP: " + String.valueOf(kiddo.getHp());
        ((TextView) findViewById(R.id.HP)).setText(strhp);
        String strstr = "Strong: " + String.valueOf(kiddo.getStr());
        ((TextView) findViewById(R.id.STR)).setText(strstr);
        String strmag = "Magic: " + String.valueOf(kiddo.getMag());
        ((TextView) findViewById(R.id.MAG)).setText(strmag);
        String strskl = "Skill: " + String.valueOf(kiddo.getSkl());
        ((TextView) findViewById(R.id.SKL)).setText(strskl);
        String strspd = "Speed: " + String.valueOf(kiddo.getSpd());
        ((TextView) findViewById(R.id.SPD)).setText(strspd);
        String strlck = "Luck: " + String.valueOf(kiddo.getLck());
        ((TextView) findViewById(R.id.LCK)).setText(strlck);
        String strdef = "Defense: " + String.valueOf(kiddo.getDef());
        ((TextView) findViewById(R.id.DEF)).setText(strdef);
        String strres = "Resistance: " + String.valueOf(kiddo.getRes());
        ((TextView) findViewById(R.id.RES)).setText(strres);
        String strmov = "Movement: " + String.valueOf(kiddo.getMov());
        ((TextView) findViewById(R.id.MOV)).setText(strmov);
        ((TextView) findViewById(R.id.WPN)).setText(kiddo.getWpn());
        ((TextView) findViewById(R.id.ITM)).setText(kiddo.getItm());

        if (kiddo.getNumskil() >= 1) {
            ((ImageView) findViewById(R.id.skl1)).setImageResource(kiddo.getSkil1());
            ((ImageView) findViewById(R.id.skl1)).setOnClickListener(this);
            popit = new SimplePopup(childs.this,kiddo.getSkil1());



            if (kiddo.getNumskil() >= 2) {

                ((ImageView) findViewById(R.id.skl2)).setVisibility(View.VISIBLE);
                ((ImageView) findViewById(R.id.skl2)).setImageResource(kiddo.getSkill2());
                ((ImageView) findViewById(R.id.skl2)).setOnClickListener(this);
                popit2 = new SimplePopup(childs.this,kiddo.getSkill2());

                if (kiddo.getNumskil() == 3) {

                    ((ImageView) findViewById(R.id.skl3)).setVisibility(View.VISIBLE);
                    ((ImageView) findViewById(R.id.skl3)).setImageResource(kiddo.getSkill3());
                    ((ImageView) findViewById(R.id.skl3)).setOnClickListener(this);
                    popit3 = new SimplePopup(childs.this,kiddo.getSkill3());


                }
            }
        }
    }

    SimplePopup popit;
    SimplePopup popit2;
    SimplePopup popit3;

    public void name(CharSequence name) {
        ((TextView) findViewById(R.id.name)).setText(name);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.childs);
        ((ImageView) findViewById(R.id.back)).setOnClickListener(this);
        ImageView next;
        if (y == 1) {
            ((ImageView) findViewById(R.id.child)).setImageResource(R.drawable.finalcena);
            if (MainActivity.NCM == 0) {

                }

                next = (ImageView) findViewById(R.id.next);
                next.setVisibility(View.VISIBLE);
                next.setColorFilter(Color.parseColor("#003F51B5"));
                next.setOnClickListener(this);

            campos(MainActivity.a.lucina);
            name("LUCINA");
        } else if (y == 2) {
            ((ImageView) findViewById(R.id.child)).setImageResource(R.drawable.finalmorgan);
            if (MainActivity.NCM == 0) {
                next = (ImageView) findViewById(R.id.next);
                next.setVisibility(View.VISIBLE);
                next.setColorFilter(Color.parseColor("#003F51B5"));
                next.setOnClickListener(this);
            }
           campos(MainActivity.a.morgan);
            name("MORGAN");
        } else {
            switch (hombres.mujeres) {
                case 1:
                    imagen(R.drawable.finalbrady);
                    campos(i.brady);
                    name("BRADY");
                    break;
                case 2:
                    imagen(R.drawable.finalnoire);
                    campos(i.noire);
                    name("NOIRE");
                    break;
                case 3:
                    imagen(R.drawable.finalmorgan);
                    name("MORGAN");
                    break;
                case 5:
                    imagen(R.drawable.finalcintia);
                    name("Cynthia");
                    campos(i.cynthia);
                    break;
                case 7:
                    imagen(R.drawable.finalgerome);
                    name("GEROME");
                    campos(i.gerome);
                    break;
                case 8:
                    imagen(R.drawable.finalnah);
                    name("NAH");
                    campos(i.nah);
                    break;
                case 10:
                    imagen(R.drawable.finalkjelle);
                    name("KJELLE");
                    campos(i.kjelle);
                    break;
                case 12:
                    imagen(R.drawable.finalinigo);
                    name("INIGO");
                    campos(i.inigo);
                    break;
                case 14:
                    imagen(R.drawable.finalowain);
                    name("OWAIN");
                    campos(i.owain);
                    break;
                case 15:
                    imagen(R.drawable.finallaurent);
                    name("LAURENT");
                    campos(i.laurent);
                    break;
                case 17:
                    imagen(R.drawable.finalsevera);
                    name("SEVERA");
                    campos(i.severa);
                    break;
                case 18:
                    imagen(R.drawable.finalyarne);
                    name("YARNE");
                    campos(i.yarne);
                    break;
                default:
            }
        }
    }

    public void onBackPressed() {
        if (y != 1 && y != 2) {
            return;
        }
        ImageView next;
        if (y == 1) {
            ((ImageView) findViewById(R.id.child)).setImageResource(R.drawable.finalcena);
            next = (ImageView) findViewById(R.id.next);
            next.setVisibility(View.VISIBLE);
            next.setColorFilter(Color.parseColor("#003F51B5"));
            next.setOnClickListener(this);
            name("LUCINA");
        } else if (y == 2) {
            ((ImageView) findViewById(R.id.child)).setImageResource(R.drawable.finalmorgan);
            next = (ImageView) findViewById(R.id.next);
            next.setVisibility(View.VISIBLE);
            next.setColorFilter(Color.parseColor("#003F51B5"));
            next.setOnClickListener(this);
            name("MORGAN");
        } else {
            startActivity(new Intent(this, hombres.class));
            finish();
        }
    }

    public void onClick(View v) {
        if (v.getId() == R.id.next) {
            ((ImageView) findViewById(R.id.next)).setVisibility(View.INVISIBLE);
        } else if (v.getId() == R.id.back) {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }else if(v.getId()==R.id.skl1){

            popit.show();
        }else if(v.getId()==R.id.skl2){

            popit2.show();
        }else if(v.getId()==R.id.skl3){

            popit3.show();
        }
        switch (hombres.mujeres) {
            case 1:
                imagen(R.drawable.finalbrady);
                name("BRADY");
                campos(i.brady);
                break;
            case 2:
                imagen(R.drawable.finalnoire);
                name("NOIRE");
                campos(i.noire);
                break;
            case 3:
                imagen(R.drawable.finalmorgan);
                name("MORGAN");
                break;
            case 5:
                imagen(R.drawable.finalcintia);
                name("Cynthia");
                campos(i.cynthia);
                break;
            case 7:
                imagen(R.drawable.finalgerome);
                name("GEROME");
                campos(i.gerome);
                break;
            case 8:
                imagen(R.drawable.finalnah);
                name("NAH");
                campos(i.nah);
                break;
            case 10:
                imagen(R.drawable.finalkjelle);
                name("KJELLE");
                campos(i.kjelle);
                break;
            case 12:
                imagen(R.drawable.finalinigo);
                name("INIGO");
                campos(i.inigo);
                break;
            case 14:
                imagen(R.drawable.finalowain);
                name("OWAIN");
                campos(i.owain);
                break;
            case 15:
                imagen(R.drawable.finallaurent);
                name("LAURENT");
                campos(i.laurent);
                break;
            case 17:
                imagen(R.drawable.finalsevera);
                name("SEVERA");
                campos(i.severa);
                break;
            case 18:
                imagen(R.drawable.finalyarne);
                name("YARNE");
                campos(i.yarne);
                break;
            default:
        }
    }
}
