package warrior;

public class Main {
    public static void main(String[] args) {
        Warrior palladyn = new Warrior("Adam", 30, 150);
        Warrior pierdola = new Warrior("chujowy piechór");
        System.out.println(palladyn);
        System.out.println(pierdola);
        palladyn.hit(pierdola);
        System.out.println(pierdola);
    }
}
