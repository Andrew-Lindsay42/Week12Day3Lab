package players;

import behaviours.IHeal;
import powers.Heal;

public abstract class Healer extends Player implements IHeal {

    Heal heal;

    public Healer(String name, int healthPoints, Heal heal) {
        super(name, healthPoints);
        this.heal = heal;
    }

    public Heal getHeal() {
        return heal;
    }

    public void swap(Heal heal){
        this.heal = heal;
    }

    public int heal(Player player) {
        player.increaseHP(heal.getHealthRestore());
        return player.getHealthPoints();
    }

}
