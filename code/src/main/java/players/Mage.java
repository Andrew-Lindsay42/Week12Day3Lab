package players;

import behaviours.ICast;
import powers.Familiar;
import powers.Spell;

public abstract class Mage extends Player implements ICast {
    int manaPool;
    Spell spell;
    Familiar familiar;

    public Mage(String name, int healthPoints, int manaPool, Spell spell, Familiar familiar) {
        super(name, healthPoints);
        this.manaPool = manaPool;
        this.spell = spell;
        this.familiar = familiar;
    }

    public int getManaPool() {
        return manaPool;
    }

    public void reduceManaPool(int i) {
        manaPool -= i;
    }

    public void increaseManaPool(int i) {
        manaPool += i;
    }

    public Spell getSpell() {
        return spell;
    }

    public void swap(Spell spell) {
        this.spell = spell;
    }

    public Familiar getFamiliar() {
        return familiar;
    }

    public void swap(Familiar familiar) {
        this.familiar = familiar;
    }

    public int cast() {
        reduceManaPool(spell.getManaCost());
        return this.spell.getDamage();
    }
}
