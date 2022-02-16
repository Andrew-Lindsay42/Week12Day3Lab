package players;

import org.junit.Before;
import org.junit.Test;
import powers.Familiar;
import powers.Spell;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Spell spell;
    Familiar familiar;

    @Before
    public void before() {
        spell = new Spell("Fire Bolt", 25, 8);
        familiar = new Familiar("Fred", "Frog", 2, 1);
        warlock = new Warlock("Saruman", 20, 80, spell, familiar);
    }

    @Test
    public void canCastWildMagic() {
        assertEquals(50, warlock.castWildMagic());
    }
}
