package com.example.hugoiracheta.myapplication1;

public class child{

    public int lvl, hp, str, mag, skl, spd, lck, def, res, mov, skil1, skill2, skill3, numskil;
    public CharSequence  wpn, itm, cls;
    public child lucina , morgan, owain, brady, nah, severa, noire, kjelle, laurent, yarne, cynthia, inigo, gerome;

    public CharSequence getCls() {
        return cls;
    }

    public void setCls(CharSequence cls) {
        this.cls = cls;
    }

    public int getSkil1() {
        return skil1;
    }

    public void setSkil1(int skil1) {
        this.skil1 = skil1;
    }

    public int getSkill2() {
        return skill2;
    }

    public void setSkill2(int skill2) {
        this.skill2 = skill2;
    }

    public int getSkill3() {
        return skill3;
    }

    public void setSkill3(int skill3) {
        this.skill3 = skill3;
    }

    public int getNumskil() {
        return numskil;
    }

    public void setNumskil(int numskil) {
        this.numskil = numskil;
    }

    public int getLvl() {
        return lvl;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getMag() {
        return mag;
    }

    public void setMag(int mag) {
        this.mag = mag;
    }

    public int getSkl() {
        return skl;
    }

    public void setSkl(int skl) {
        this.skl = skl;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public int getLck() {
        return lck;
    }

    public void setLck(int lck) {
        this.lck = lck;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public int getMov() {
        return mov;
    }

    public void setMov(int mov) {
        this.mov = mov;
    }

    public CharSequence getWpn() {
        return wpn;
    }

    public void setWpn(CharSequence wpn) {
        this.wpn = wpn;
    }

    public CharSequence getItm() {
        return itm;
    }

    public void setItm(CharSequence itm) {
        this.itm = itm;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    public void stats(child g, int level, int life, int strenght, int magic, int skill, int speed, int luck, int defense, int resistance, int movement,  CharSequence weapon, CharSequence item, CharSequence clas, int skill1, int skill2, int skill3, int numeroskil){
        g.setLvl(level);
        g.setHp(life);
        g.setStr(strenght);
        g.setMag(magic);
        g.setSkl(skill);
        g.setSpd(speed);
        g.setLck(luck);
        g.setDef(defense);
        g.setRes(resistance);
        g.setMov(movement);
        g.setWpn(weapon);
        g.setItm(item);
        g.setCls(clas);
        g.setSkil1(skill1);
        g.setSkill2(skill2);
        g.setSkill3(skill3);
        g.setNumskil(numeroskil);
    }
    public void calculate(child g,int strength, int magic, int skill, int speed, int luck, int defense, int resistence){

        g.str+=strength;
        g.mag+=magic;
        g.skl+=skill;
        g.spd+=speed;
        g.lck+=luck;
        g.def+=defense;
        g.res+=resistence;
    }
    public void makeChilds(){

      lucina = new child();
        morgan = new child();
        owain = new child();
        brady = new child();
        nah = new child();
        severa = new child();
        noire = new child();
        kjelle = new child();
        laurent  =  new child();
        yarne = new child();
        cynthia = new child();
        inigo = new child();
        gerome = new child();

        stats(lucina, 10, 12, 5, 1, 8, 4, 13, 3, 3, 5, "Sword -C", "Parallel Falchion, Rapier", "Lord",  R.drawable.dualttack, R.drawable.charm, R.drawable.aether,3);
        stats(owain, 10, 10, 4, 4, 5, 6, 9, 6, 5, 5, "Sword -C", "Steel Sword", "Myrmidon", R.drawable.avoid10, R.drawable.vantage,R.drawable.aether,2);
        stats(brady,10,9,6,5,4,2,10,7,4,5,"Staff -D", "Mend, Concoction", "Priest", R.drawable.miracle, R.drawable.healthtouch, R.drawable.aptitude,2);
        stats(nah,10,5,3,3,5,6,8,3,3,6,"Stone", "Dragon Stone", "Manakete", R.drawable.oddrhythm, R.drawable.acrobat, R.drawable.aether,1);
        stats(severa, 10,8,6,1,7,6,6,6,5,5, "Sword -C", "Steel Sword", "Mercenary", R.drawable.armsthrft, R.drawable.patience, R.drawable.aether,2);
        stats(noire, 10,8,5,3,6,7,10,4,6,5, "Bow -C", "Steel Bow", "Archer", R.drawable.skill2, R.drawable.prescience,R.drawable.aptitude,2);
        stats(kjelle, 10,10,6,2,6,5,11,5,3,4,"Lance -C", "Steel Lance, Concoction", "Knight", R.drawable.defense2, R.drawable.indoorfighter, R.drawable.aether,2);
        stats(laurent, 10,10,3,9,7,4,11,4,5,5, "Tome -C", "Elwind", "Mage", R.drawable.magic2, R.drawable.focus, R.drawable.aether,2);
        stats(yarne, 10,16,9,1,4,4,13,6,1,6,"Stone", "Beaststone, Elixir", "Taguel", R.drawable.evenrhythm,R.drawable.acrobat,R.drawable.aether,1);
        stats(cynthia, 10, 7,5,2,4,12,17,6,6,7,"Lance -C", "Steel Lance", "Pegasus Knight", R.drawable.spped2, R.drawable.relief, R.drawable.aptitude,2);
        stats(inigo, 10,11,5,2,4,9,12,4,4,5,"Sword -C", "Killing Edge, Concoction", "Mercenary", R.drawable.armsthrft,R.drawable.patience, R.drawable.aether,2 );
        stats(gerome, 10, 13, 10, 0, 4, 8, 5, 5, 1, 7, "Axe -C", "Steel Axe, Concoction", "Wyvern Rider", R.drawable.strength2,R.drawable.tantivity,R.drawable.aether,2);
    }


}
