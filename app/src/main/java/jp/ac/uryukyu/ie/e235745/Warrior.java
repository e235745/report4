package jp.ac.uryukyu.ie.e235745;

public class Warrior extends Hero{
    public Warrior (String _name, int _maximumHP, int _attack){
        super(_name, _maximumHP, _attack);
    }
    public void attackWithWeponSkill(LivingThing opponent){
        if(getHitPoint() >= 0){
            int damage = (int)(1.5 * getAttack());
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n",getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}