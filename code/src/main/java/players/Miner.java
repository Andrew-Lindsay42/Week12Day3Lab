package players;

import powers.Weapon;

import java.util.concurrent.ThreadLocalRandom;

public class Miner extends Fighter{
    public Miner(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints, weapon);
    }

    public void mine(){
        int num = ThreadLocalRandom.current().nextInt(1,  6);
        increaseGold(num);
    }
}
