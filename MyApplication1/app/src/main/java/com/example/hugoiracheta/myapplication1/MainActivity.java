package com.example.hugoiracheta.myapplication1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity implements OnClickListener, AdapterView.OnItemSelectedListener {
    public static int NCM=0;
    public static child a = new child();
    int already;
    int choice;
    ArrayList<Integer> e = new ArrayList<Integer>();
    ArrayList<String> arrayList1 = new ArrayList<String>();

    public void prepare(String gender, String name, int src){
        e.add(src);
        arrayList1.add(name);
    }
    public MainActivity() {
        choice = 0;
        already = 0;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = (Spinner) findViewById(R.id.mother);

        prepare("female","Nah",R.drawable.nah);
        prepare("female","Lucina",R.drawable.lucina);
        prepare("female","Robin",R.drawable.robinf);
        prepare("female","Lissa",R.drawable.lissa);
        prepare("female","Sully",R.drawable.sully);
        prepare("female","Miriel",R.drawable.miriel);
        prepare("female","Sumia",R.drawable.sumia);
        prepare("female","Maribelle",R.drawable.maribelle);
        prepare("female","Panne",R.drawable.panne);
        prepare("female","Cordelia",R.drawable.cordelia);
        prepare("female","Nowi",R.drawable.nowi);
        prepare("female","Tharja",R.drawable.tharja);
        prepare("female","Anna",R.drawable.anna);
        prepare("female","Olivia",R.drawable.olivia);
        prepare("female","Cherche",R.drawable.cherche);
        prepare("female","Sayri",R.drawable.sayri);
        prepare("female","Tiki",R.drawable.tiki);
        prepare("female","Flavia",R.drawable.flavia);
        prepare("female","Kjelle",R.drawable.kjelle);
        prepare("female","Cynthia",R.drawable.cynthia);
        prepare("female","Severa",R.drawable.severa);
        prepare("female","Morgan",R.drawable.fmorgan);
        prepare("female","Noire",R.drawable.noire);
        ArrayAdapter<String> adapter =  new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item,
                arrayList1);
                // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        a.makeChilds();

    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
             Object src = parent.getItemAtPosition(pos);
        Log.w("Position clicked",String.valueOf(pos));

        ((ImageView) findViewById(R.id.motherImage)).setImageResource(e.get(pos));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

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

        }

}
