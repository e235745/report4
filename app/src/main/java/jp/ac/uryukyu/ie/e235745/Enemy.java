package jp.ac.uryukyu.ie.e235745;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{
    
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String _name, int _maximumHP, int _attack) {
        super(_name, _maximumHP, _attack);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override 
     public void wounded(int damage){
        super.setHitPoint(super.getHitPoint() - damage);
        if( super.getHitPoint() < 0 ) {
            super.setDead(true); 
            System.out.printf("モンスター%sは倒れた。\n",super.getName());
        }
    }
}
    
  
