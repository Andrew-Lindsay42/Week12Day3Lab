package powers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamiliarTest {

    Familiar familiar;

    @Before
    public void before(){
        familiar = new Familiar("Salem", "Cat", 10, 5);
    }

    @Test
    public void hasName(){
        assertEquals("Salem", familiar.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Cat", familiar.getType());
    }

    @Test
    public void hasAttack(){
        assertEquals(10, familiar.attack());
    }

    @Test
    public void hasDefence(){
        assertEquals(5, familiar.defend());
    }
}
