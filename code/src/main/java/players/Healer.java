package players;

import behaviours.IHeal;
import powers.Heal;

public abstract class Healer extends Character implements IHeal {

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

    public int heal(Character character) {
        character.increaseHP(heal.getHealthRestore());
        return character.getHealthPoints();
    }

}
