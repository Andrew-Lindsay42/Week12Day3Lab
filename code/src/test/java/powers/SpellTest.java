package powers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    Spell spell;

    @Before
    public void before(){
        spell = new Spell("Abracadabra Fireball!", 30, 10);
    }

    @Test
    public void hasName(){
        assertEquals("Abracadabra Fireball!", spell.getName());
    }

    @Test
    public void hasDamage(){
        assertEquals(30, spell.getDamage());
    }

    @Test
    public void hasManaCost(){
        assertEquals(10, spell.getManaCost());
    }
}
