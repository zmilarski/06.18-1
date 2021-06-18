package warrior;

public class Warrior {
    private String name;
    private int attackpts;
    private int healthpts;

    public Warrior(String name, int attackpts, int healthpts) {
        this.name = name;
        this.attackpts = attackpts;
        this.healthpts = healthpts;
    }

    public Warrior(String name) {
        this.name = name;
        attackpts = 1;
        healthpts = 100;
    }

    public String toString() {
        return "Wojownik o imieniu " + name + ", " + healthpts + " punktach życia i " + attackpts + " punktach ataku.";
    }
}
