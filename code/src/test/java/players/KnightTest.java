package players;

import org.junit.Before;
import org.junit.Test;
import powers.Weapon;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon("Sword", 20);
        knight = new Knight("Lancelot", 50, weapon, 10);
    }

    @Test
    public void hasArmour(){
        assertEquals(10, knight.getArmour());
    }
}
