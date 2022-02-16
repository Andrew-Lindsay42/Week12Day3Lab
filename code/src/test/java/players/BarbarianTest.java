package players;

import org.junit.Before;
import org.junit.Test;
import powers.Weapon;

import static org.junit.Assert.*;

public class BarbarianTest {
    Barbarian barbarian;
    Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon("Axe", 10);
        barbarian = new Barbarian("Conan", 50, weapon);
    }

    @Test
    public void hasName(){
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(50, barbarian.getHealthPoints());
    }

    @Test
    public void canIncreaseHP(){
        barbarian.increaseHP(10);
        assertEquals(60, barbarian.getHealthPoints());
    }

    @Test
    public void canDecreaseHP(){
        barbarian.decreaseHP(10);
        assertEquals(40, barbarian.getHealthPoints());
    }

    @Test
    public void goldStartsAt0(){
        assertEquals(0, barbarian.getGold());
    }

    @Test
    public void canIncreaseGold(){
        barbarian.increaseGold(10);
        assertEquals(10, barbarian.getGold());
    }

    @Test
    public void canDecreaseGold(){
        barbarian.increaseGold(15);
        barbarian.decreaseGold(10);
        assertEquals(5, barbarian.getGold());
    }

    @Test
    public void canAttack(){
        assertEquals(10, barbarian.attack());
    }

    @Test
    public void hasWeapon(){
        assertEquals(weapon, barbarian.getWeapon());
    }

    @Test
    public void canSwapWeapon(){
        weapon = new Weapon("Sword", 15);
        barbarian.swap(weapon);
        assertEquals(weapon, barbarian.getWeapon());
    }

    @Test
    public void startsCalm(){
        assertFalse(barbarian.isBerserk());
    }

    @Test
    public void canGoBerserk(){
        barbarian.berserkRage();
        assertTrue(barbarian.isBerserk());
    }

    @Test
    public void canCalmDown(){
        barbarian.berserkRage();
        barbarian.calmDown();
        assertFalse(barbarian.isBerserk());
    }
}
