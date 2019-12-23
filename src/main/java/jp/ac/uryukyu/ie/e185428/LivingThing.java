package jp.ac.uryukyu.ie.e185428;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public String getName(){
        return this.name;
    }

    public int getHitPoint(){
        return this.hitPoint;
    }

    public int getAttack(){
        return this.attack;
    }

    public boolean getDead(){
        return this.dead;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHitPoint(int maximumHP){
        this.hitPoint = maximumHP;
    }

    public void setAttack(int attack){
        this.attack = attack;
    }

    public void setDead(boolean dead){
        this.dead = dead;
    }


    public void attack(LivingThing opponent){
        int damage = (int)(Math.random() * attack);
        if(!getDead()) {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }


    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }



}
