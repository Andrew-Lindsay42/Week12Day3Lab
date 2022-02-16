package players;

import powers.Familiar;
import powers.Spell;

public class Wizard extends Mage {
    public Wizard(String name, int healthPoints, int manaPool, Spell spell, Familiar familiar) {
        super(name, healthPoints, manaPool, spell, familiar);
    }

    public void ponderOrb() {
        increaseManaPool(10);
    }
}
