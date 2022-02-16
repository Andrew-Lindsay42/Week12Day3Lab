package players;

import powers.Weapon;

public class Knight extends Fighter{
    int armour;

    public Knight(String name, int healthPoints, Weapon weapon, int armour) {
        super(name, healthPoints, weapon);
        this.armour = armour;
    }

    public int getArmour() {
        return armour;
    }
}
