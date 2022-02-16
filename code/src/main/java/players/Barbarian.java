package players;

import powers.Weapon;

public class Barbarian extends Fighter {
    boolean berserk;

    public Barbarian(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints, weapon);
        this.berserk = false;
    }

    public boolean isBerserk() {
        return berserk;
    }

    private void setBerserk(boolean berserk) {
        this.berserk = berserk;
    }

    public void berserkRage() {
        setBerserk(true);
    }
    
    public void calmDown() {
        setBerserk(false);
    }
}

