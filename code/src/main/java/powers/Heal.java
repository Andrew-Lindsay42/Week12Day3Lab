package powers;

public class Heal {

    private String name;
    private int healthRestore;

    public Heal(String name, int healthRestore) {
        this.name = name;
        this.healthRestore = healthRestore;
    }

    public String getName() {
        return name;
    }

    public int getHealthRestore() {
        return healthRestore;
    }

}
