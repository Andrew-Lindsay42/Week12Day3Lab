package players;

import org.junit.Before;
import org.junit.Test;
import powers.Weapon;

import static org.junit.Assert.assertTrue;

public class MinerTest {

    Miner miner;
    Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon("Pickaxe", 10);
        miner = new Miner("Billy", 20, weapon);
    }

    @Test
    public void canMine(){
        miner.mine();
        assertTrue(miner.getGold() > 0);
    }
}
