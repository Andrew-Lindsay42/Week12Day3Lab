package powers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon("Axe", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Axe", weapon.getName());
    }

    @Test
    public void hasDamage(){
        assertEquals(10, weapon.getDamage());
    }
}
