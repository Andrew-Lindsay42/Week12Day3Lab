package powers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealTest {

    Heal heal;

    @Before
    public void before(){
        heal = new Heal("Potion of Healing", 15);
    }

    @Test
    public void hasName(){
        assertEquals("Potion of Healing", heal.getName());
    }

    @Test
    public void hasRestoreHP(){
        assertEquals(15, heal.getHealthRestore());
    }
}
