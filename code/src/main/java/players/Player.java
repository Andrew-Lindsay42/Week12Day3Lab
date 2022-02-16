package players;

public abstract class Player {
    private final String name;
    private int healthPoints;
    private int gold;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.gold = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void increaseHP(int i) {
        healthPoints += i;
    }

    public void decreaseHP(int i) {
        healthPoints -= i;
    }

    public int getGold() {
        return gold;
    }

    public void increaseGold(int i) {
        gold += i;
    }

    public void decreaseGold(int i) {
        gold -= i;
    }
}
