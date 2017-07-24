package com.example.hugoiracheta.myapplication1;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;


public class SimplePopup {
    private Boolean yesno=false;
    Activity that;
    String title;
    String message;
    String buttony = "Si";
    String buttonn = "No";
    String buttonok = "Ok";
    private Boolean method=false,noncanceleable=false;
    private Runnable y;
    private Runnable n;
    private Runnable m;

    public SimplePopup(Activity that,int drawable){
        switch (drawable) {

            case R.drawable.oddrhythm:
                this.that=that;
                this.title="Odd Rythm";
                this.message="The user's Accuracy and Avoid have 10 extra points during odd numbered turns.";
                break;

            case R.drawable.aether:
                this.that=that;
                this.title="Aether";
                this.message="2 consecutive hits; First strike uses Sol and second strike uses Luna.";
                break;
            case R.drawable.charm:
                this.that=that;
                this.title="Charm";
                this.message="Hit rate and Avoid +5 to all allies within a 3 tile radius";
                break;
            case R.drawable.dualttack:
                this.that=that;
                this.title="Dual Strike+";
                this.message="Adds 10% to Dual Strike activation";
                break;
            case R.drawable.avoid10:
                this.that=that;
                this.title="Avoid +10";
                this.message="Avoid +10";
                break;
            case R.drawable.strength2:
                this.that=that;
                this.title="Strength +2";
                this.message="Strength +2";
                break;
            case R.drawable.vantage:
                this.that=that;
                this.title="Vantage";
                this.message="Strike first during an enemy attack when HP is under half";
                break;

            case R.drawable.tantivity:
                this.that=that;
                this.title="Tantivity";
                this.message="Hit rate and Avoid +10 if no allies within a 3 tile radius.";
                break;
            case R.drawable.defense2:
                this.that=that;
                this.title="Defense +2";
                this.message="Defense +2";
                break;
            case R.drawable.indoorfighter:
                this.that=that;
                this.title="Indoor Fighter";
                this.message="Hit rate and Avoid +10 when fighting indoors";
                break;
            case R.drawable.magic2:
                this.that=that;
                this.title="Magic +2";
                this.message="Magic +2";
                break;
            case R.drawable.focus:
                this.that=that;
                this.title="Focus";
                this.message="Critical +10 when no allies are within a 3 tile radius";
                break;
            case R.drawable.miracle:
                this.that=that;
                this.title="Miracle";
                this.message="Character survives with 1 HP after receiving a fatal blow. (Must have at least 2 HP or more to activate)";
                break;
            case R.drawable.healthtouch:
                this.that=that;
                this.title="HealtTouch";
                this.message="Restores an extra 5 HP when healing allies";
                break;
            case R.drawable.evenrhythm:
                this.that=that;
                this.title="Even Rhythm";
                this.message="Hit rate and Avoid +10 during even numbered Turns";
                break;
            case R.drawable.armsthrft:
                this.that=that;
                this.title="Armsthrift";
                this.message="Weapon durability is not decreased when activated";
                break;
            case R.drawable.prescience:
                this.that=that;
                this.title="Prescience";
                this.message="Hit rate and Avoid +15 during the user's Turn";
                break;
            case R.drawable.skill2:
                this.that=that;
                this.title="Skill +2";
                this.message="Increases Skill by 2";
                break;
        }

        }


    void addyn(final Runnable y,final Runnable n){
        this.y = y;
        this.n = n;
        this.yesno=true;
        this.method=false;
    }
    void addyn(final Runnable y,final Runnable n,String button_yes,String button_no){
        this.y = y;
        this.n = n;
        this.yesno=true;
        this.method=false;
        this.buttonn = button_no;
        this.buttony = button_yes;
    }
    void addmethod(final Runnable method){
        this.method = true;
        this.m = method;
        this.yesno=false;
    }
    void show(){
        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(that);
        helpBuilder.setTitle(title);
        helpBuilder.setMessage(message);
        if(yesno) {
            helpBuilder.setCancelable(false)
                    .setPositiveButton(buttony, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            y.run();
                        }
                    })
                    .setNegativeButton(buttonn, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            n.run();
                        }
                    });
        }else {
            if(method) {
                helpBuilder.setCancelable(false)
                        .setPositiveButton("Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        m.run();
                                    }
                                });
            }else{
                helpBuilder.setPositiveButton(buttonok,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
            }
        }
        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();
    }
}
/*simplepopup popit = new simplepopup(MainActivity.this,"Alerta",message);
popit.show()*/