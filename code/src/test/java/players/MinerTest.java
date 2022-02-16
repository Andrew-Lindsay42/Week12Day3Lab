package players;

import org.junit.Before;

public class MinerTest {

    Miner miner;

    @Before
    public void before(){
        miner = new Miner("Balin", 50);
    }
}
