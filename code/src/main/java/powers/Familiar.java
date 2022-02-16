package powers;

public class Familiar {
    private String name;
    private String type;
    private int attack;
    private int defence;

    public Familiar(String name, String type, int attack, int defence) {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int attack() {
        return attack;
    }

    public int defend() {
        return defence;
    }
}
