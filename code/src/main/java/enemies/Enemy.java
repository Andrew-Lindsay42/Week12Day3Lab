package enemies;

public class Enemy {

    private String name;
    private int healthPoints;
    private int attack;
    private int defence;
    private int gold;

    public Enemy(String name, int healthPoints, int attack, int defence, int gold) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.attack = attack;
        this.defence = defence;
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void reduceHP(int i){
        this.healthPoints -= i;

    }

    public int attack() {
        return attack;
    }

    public int defend() {
        return defence;
    }

    public int getGold() {
        return gold;
    }
}
