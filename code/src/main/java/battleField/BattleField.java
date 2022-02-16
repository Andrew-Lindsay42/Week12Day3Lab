package battleField;

import enemies.Enemy;
import players.Fighter;
import players.Healer;
import players.Mage;
import players.Player;

public class BattleField {

    public void playerAttacks(Fighter fighter, Enemy enemy){
        enemy.reduceHP(fighter.attack());
    }

    public void playerCastsSpell(Mage mage, Enemy enemy){
        enemy.reduceHP(mage.cast());
    }

    public void playerHeal(Healer healer, Player player){
        healer.heal(player);
    }


}
