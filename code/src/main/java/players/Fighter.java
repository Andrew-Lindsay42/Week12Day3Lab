package players;

import behaviours.IWield;
import powers.Weapon;

public abstract class Fighter extends Player implements IWield {
    Weapon weapon;

    public Fighter(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void swap(Weapon weapon) {
        this.weapon = weapon;
    }

    public int attack() {
        return this.weapon.getDamage();
    }
}
