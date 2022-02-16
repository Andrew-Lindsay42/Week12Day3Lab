package players;

import org.junit.Before;
import org.junit.Test;
import powers.Heal;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Heal heal;

    @Before
    public void before(){
        heal = new Heal("Rosemary", 5);
        cleric = new Cleric("Casandra", 30, heal);
    }

    @Test
    public void canGetHeal(){
        assertEquals(heal, cleric.getHeal());
    }

    @Test
    public void canSwapHeal(){
        heal = new Heal("Love potion", 20);
        cleric.swap(heal);
        assertEquals(heal, cleric.getHeal());
    }

    @Test
    public void canHealCharacter(){
        cleric.heal(cleric);
        assertEquals(35, cleric.getHealthPoints());
    }

}
