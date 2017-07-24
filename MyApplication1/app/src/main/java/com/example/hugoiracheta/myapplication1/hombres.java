package com.example.hugoiracheta.myapplication1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.solver.widgets.ConstraintTableLayout;
import android.support.design.internal.BottomNavigationMenu;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class hombres extends AppCompatActivity implements OnClickListener {
    public static int mujeres;
    boolean NCH = true;
    int already;
    int choice;
    int p;

    public hombres() {
        p = 0;
        NCH = true;
        already = 0;
        choice = 0;
    }

    public ImageView colorcandy() {
        ((ImageView) findViewById(R.id.gaius)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.gaius);
    }

    public ImageView colorvalkye() {
        ((ImageView) findViewById(R.id.valkye)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.valkye);
    }

    public ImageView colorbasilio() {
        ((ImageView) findViewById(R.id.basilio)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.basilio);
    }

    public ImageView colorlaurent() {
        ((ImageView) findViewById(R.id.laurent)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.laurent);
    }

    public ImageView colorhenry() {
        ((ImageView) findViewById(R.id.henry)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.henry);
    }

    public ImageView colorrobin() {
        ((ImageView) findViewById(R.id.gerome)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.gerome);
    }

    public ImageView colorricken() {
        ((ImageView) findViewById(R.id.ricken)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.ricken);
    }

    public ImageView colorvirion() {
        ((ImageView) findViewById(R.id.virion)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.virion);
    }

    public ImageView colorstahl() {
        ((ImageView) findViewById(R.id.stahl)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.stahl);
    }

    public ImageView colorlonqu() {
        ((ImageView) findViewById(R.id.lonqu)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.lonqu);
    }

    public ImageView colordonnel() {
        ((ImageView) findViewById(R.id.donnel)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.donnel);
    }

    public ImageView colorbrady() {
        ((ImageView) findViewById(R.id.brady)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.brady);
    }

    public ImageView colorfrederick() {
        ((ImageView) findViewById(R.id.frederick)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.frederick);
    }

    public ImageView colorrego() {
        ((ImageView) findViewById(R.id.gregor)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.gregor);
    }

    public ImageView colorchrom() {
        ((ImageView) findViewById(R.id.chrom)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.chrom);
    }

    public ImageView colorkullum() {
        ((ImageView) findViewById(R.id.kullum)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.kullum);
    }

    public ImageView colorrobin2() {
        ((ImageView) findViewById(R.id.robin)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.robin);
    }

    public ImageView colorowain() {
        ((ImageView) findViewById(R.id.owain)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.owain);
    }

    public ImageView coloryarne() {
        ((ImageView) findViewById(R.id.yarne)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.yarne);
    }

    public ImageView colorlaslow() {
        ((ImageView) findViewById(R.id.laslow)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.laslow);
    }

    public ImageView colorlibra() {
        ((ImageView) findViewById(R.id.libra)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.libra);
    }

    public ImageView colormmorgan() {
        ((ImageView) findViewById(R.id.mmorgan)).setColorFilter(Color.parseColor("#003F51B5"));
        return (ImageView) findViewById(R.id.mmorgan);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hombres);
        ImageView[] btn = new ImageView[100];
        switch (hombres.mujeres) {
            case 1 :
                btn[p] = colorchrom();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorfrederick();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvirion();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorstahl();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvalkye();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorkullum();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colordonnel();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlonqu();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorricken();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorcandy();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrego();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlibra();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorhenry();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 2:
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorfrederick();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvirion();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorstahl();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvalkye();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colordonnel();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlonqu();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorricken();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorcandy();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrego();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlibra();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorhenry();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 3:
                btn[p] = colorchrom();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorfrederick();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvirion();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorstahl();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvalkye();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colordonnel();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlonqu();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorricken();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorcandy();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrego();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlibra();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorhenry();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlaslow();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorowain();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorbrady();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrobin();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlaurent();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = coloryarne();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorkullum();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorbasilio();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 4:
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorowain();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlaslow();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorbrady();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrobin();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlaurent();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = coloryarne();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colormmorgan();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 5:
                btn[p] = colorchrom();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorfrederick();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorcandy();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorhenry();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 6:
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlaslow();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorowain();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorbrady();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrobin();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlaurent();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = coloryarne();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colormmorgan();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 7:
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorfrederick();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvirion();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorstahl();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvalkye();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorkullum();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colordonnel();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlonqu();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorricken();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorcandy();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrego();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlibra();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorhenry();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 8:
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorfrederick();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvirion();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorstahl();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvalkye();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorkullum();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colordonnel();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlonqu();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorricken();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorcandy();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrego();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlibra();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorhenry();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 9:
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlaslow();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorowain();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorbrady();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrobin();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlaurent();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = coloryarne();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colormmorgan();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 10:
                btn[p] = colorchrom();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorfrederick();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvirion();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorstahl();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvalkye();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorkullum();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colordonnel();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlonqu();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorricken();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorcandy();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrego();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlibra();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorhenry();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 11:
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 12:
                btn[p] = colorchrom();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorfrederick();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvirion();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorstahl();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvalkye();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorkullum();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colordonnel();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlonqu();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorricken();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorcandy();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrego();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlibra();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorhenry();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 13:
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 14:
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorfrederick();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvirion();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorstahl();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvalkye();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorkullum();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colordonnel();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlonqu();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorricken();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorcandy();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrego();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlibra();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorhenry();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 15:
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorfrederick();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvirion();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorstahl();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvalkye();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorkullum();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colordonnel();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlonqu();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorricken();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorcandy();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrego();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlibra();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorhenry();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 16:
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 17:
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorfrederick();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvirion();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorstahl();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvalkye();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorkullum();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colordonnel();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlonqu();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorricken();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorcandy();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrego();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlibra();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorhenry();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 18:
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorfrederick();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvirion();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorstahl();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorvalkye();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorkullum();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colordonnel();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlonqu();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorricken();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorcandy();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrego();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlibra();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorhenry();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 19:
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 20:
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlaslow();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorowain();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorbrady();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrobin();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlaurent();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = coloryarne();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colormmorgan();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 21:
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlaslow();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorowain();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorbrady();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrobin();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlaurent();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = coloryarne();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colormmorgan();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 22:
                btn[p] = colorrobin2();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlaslow();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorowain();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorbrady();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrobin();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlaurent();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = coloryarne();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colormmorgan();
                btn[p].setOnClickListener(this);
                p++;
                break;
            case 23:
                btn[p] = colorlaslow();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorowain();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorbrady();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorrobin();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = colorlaurent();
                btn[p].setOnClickListener(this);
                p++;
                btn[p] = coloryarne();
                btn[p].setOnClickListener(this);
                p++;
                break;
        }
    }

    public void onBackPressed() {
        if (choice == 1) {
            ((ImageView) findViewById(already)).setColorFilter(Color.parseColor("#003F51B5"));
            choice = 0;
            ((ImageView) findViewById(R.id.next)).setColorFilter(Color.parseColor("#af696063"));
            return;
        }
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    public void onClick(View v) {
        ImageView[] btn = new ImageView[100];
        if (choice == 1) {
            ((ImageView) findViewById(already)).setColorFilter(Color.parseColor("#003F51B5"));
        }
        switch (v.getId()) {
            case R.id.next:
                if (MainActivity.NCM != 1 || NCH==false) {
                    startActivity(new Intent(this, childs.class));
                    finish();
                    break;
                }
                Toast.makeText(getApplication(), "No childrens found", Toast.LENGTH_LONG).show();
                break;
            case R.id.gaius /*2131558556*/:
                btn[p] = (ImageView) findViewById(R.id.gaius);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                already = R.id.gaius;
                choice = 1;
                childs.y = 22;
                NCH = true;
                break;
            case R.id.valkye /*2131558557*/:
                btn[p] = (ImageView) findViewById(R.id.valkye);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                already = R.id.valkye;
                choice = 1;
                childs.y = 21;
                NCH = true;
                break;
            case R.id.basilio /*2131558558*/:
                btn[p] = (ImageView) findViewById(R.id.basilio);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                already = R.id.basilio;
                choice = 1;
                childs.y = 4;
                NCH = true;
                break;
            case R.id.laurent /*2131558559*/:
                btn[p] = (ImageView) findViewById(R.id.laurent);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                already = R.id.laurent;
                choice = 1;
                NCH = true;
                childs.y = 5;
                break;
            case R.id.henry /*2131558560*/:
                btn[p] = (ImageView) findViewById(R.id.henry);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                NCH = true;
                already = R.id.henry;
                choice = 1;
                childs.y = 6;
                break;
            case R.id.robin /*2131558561*/:
                btn[p] = (ImageView) findViewById(R.id.robin);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                NCH = false;
                already = R.id.robin;
                choice = 1;
                childs.y = 2;
                break;
            case R.id.ricken /*2131558562*/:
                btn[p] = (ImageView) findViewById(R.id.ricken);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                NCH = true;
                already = R.id.ricken;
                choice = 1;
                childs.y = 8;
                break;
            case R.id.virion /*2131558563*/:
                btn[p] = (ImageView) findViewById(R.id.virion);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                NCH = true;
                already = R.id.virion;
                choice = 1;
                childs.y = 9;
                break;
            case R.id.stahl /*2131558564*/:
                btn[p] = (ImageView) findViewById(R.id.stahl);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                NCH = true;
                already = R.id.stahl;
                choice = 1;
                childs.y = 3;
                break;
            case R.id.lonqu /*2131558565*/:
                btn[p] = (ImageView) findViewById(R.id.lonqu);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                NCH = true;
                already = R.id.lonqu;
                choice = 1;
                childs.y = 10;
                break;
            case R.id.donnel /*2131558566*/:
                btn[p] = (ImageView) findViewById(R.id.donnel);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                NCH = true;
                already = R.id.donnel;
                choice = 1;
                childs.y = 11;
                break;
            case R.id.brady /*2131558567*/:
                btn[p] = (ImageView) findViewById(R.id.brady);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                NCH = true;
                already = R.id.brady;
                choice = 1;
                childs.y = 12;
                break;
            case R.id.frederick /*2131558568*/:
                btn[p] = (ImageView) findViewById(R.id.frederick);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                NCH = true;
                already = R.id.frederick;
                choice = 1;
                childs.y = 13;
                break;
            case R.id.gregor /*2131558569*/:
                btn[p] = (ImageView) findViewById(R.id.gregor);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                NCH = true;
                already = R.id.gregor;
                choice = 1;
                childs.y = 14;
                break;
            case R.id.chrom /*2131558570*/:
                btn[p] = (ImageView) findViewById(R.id.chrom);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                already = R.id.chrom;
                choice = 1;
                childs.y = 1;
                NCH = false;
                break;
            case R.id.kullum /*2131558571*/:
                btn[p] = (ImageView) findViewById(R.id.kullum);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                NCH = true;
                already = R.id.kullum;
                choice = 1;
                childs.y = 15;
                break;
            case R.id.gerome/*2131558572*/:
                btn[p] = (ImageView) findViewById(R.id.gerome);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                NCH = true;
                already = R.id.gerome;
                choice = 1;
                childs.y = 40;
                break;
            case R.id.owain /*2131558573*/:
                btn[p] = (ImageView) findViewById(R.id.owain);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                NCH = true;
                already = R.id.owain;
                choice = 1;
                childs.y = 16;
                break;
            case R.id.yarne /*2131558574*/:
                btn[p] = (ImageView) findViewById(R.id.yarne);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                NCH = true;
                already = R.id.yarne;
                choice = 1;
                childs.y = 17;
                break;
            case R.id.laslow /*2131558575*/:
                btn[p] = (ImageView) findViewById(R.id.laslow);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                NCH = true;
                already = R.id.laslow;
                choice = 1;
                childs.y = 18;
                break;
            case R.id.libra /*2131558576*/:
                btn[p] = (ImageView) findViewById(R.id.libra);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                NCH = true;
                already = R.id.libra;
                choice = 1;
                childs.y = 19;
                break;
            case R.id.mmorgan /*2131558577*/:
                btn[p] = (ImageView) findViewById(R.id.mmorgan);
                btn[p].setColorFilter(Color.parseColor("#af696063"));
                p++;
                NCH = true;
                already = R.id.mmorgan;
                choice = 1;
                childs.y = 20;
                break;
        }
        if (choice == 1) {
            ImageView btn1 = (ImageView) findViewById(R.id.next);
            btn1.setOnClickListener(this);
            btn1.setColorFilter(null);
            return;
        }
        ImageView btn1 = (ImageView) findViewById(R.id.next);
        btn1.setOnClickListener(this);
        btn1.setColorFilter(Color.parseColor("#af696063"));
    }
}
