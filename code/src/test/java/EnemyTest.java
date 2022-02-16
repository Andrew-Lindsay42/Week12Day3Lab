import enemies.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy;

    @Before
    public void before(){
        enemy = new Enemy("Dragon",200,30,20,500);

    }

    @Test
    public void hasName(){
        assertEquals("Dragon", enemy.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(200,enemy.getHealthPoints());
    }

    @Test
    public void canAttack(){
        assertEquals(30,enemy.attack());
    }

    @Test
    public void canDefend(){
        assertEquals(20,enemy.defend());
    }

    @Test
    public void hasGold(){
        assertEquals(500,enemy.getGold());
    }

}
