package players;

import powers.Familiar;
import powers.Spell;

public class Warlock extends Mage{

    public Warlock(String name, int healthPoints, int manaPool, Spell spell, Familiar familiar) {
        super(name, healthPoints, manaPool, spell, familiar);
    }

    public int castWildMagic(){
        reduceManaPool(spell.getManaCost());
        return spell.getDamage() * 2;
    }
}
