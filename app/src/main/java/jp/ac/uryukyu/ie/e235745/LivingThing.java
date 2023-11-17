package jp.ac.uryukyu.ie.e235745;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;   

    public LivingThing(String _name, int _maximumHP, int _attack){
        this.name = _name;
        this.hitPoint = _maximumHP;
        this.attack = _attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", _name, _maximumHP, _attack);
    }

    public boolean isDead(){
        if(this.hitPoint < 0){
            this.dead = true;
        }
        return this.dead;
    }
    public String getName(){
        return this.name;             
    }

    public void attack(LivingThing opponent){
        if(hitPoint >= 0){
            int damage = (int)(Math.random() * attack);
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
    public void setName(String name){this.name = name;}
    public void setHitPoint(int maximumHP){hitPoint = maximumHP;}
    public void setAttack(int attack){this.attack = attack;}
    public void setDead(boolean dead){this.dead = false;}
    
    public int getHitPoint(){return this.hitPoint;}
    public int getAttack(){return this.attack;}
}
