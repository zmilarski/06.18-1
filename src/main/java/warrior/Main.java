package warrior;

public class Main {
    public static void main(String[] args) {
        //Zad 1 i 2

        Warrior paladin = new Warrior("Roland", 30, 150);
        Warrior pierdola = new Warrior("Chujowy Piechór");
        //Zad 3
        System.out.println("Zad 3");
        System.out.println(paladin);
        System.out.println(pierdola);
        //Zad 4
        System.out.println("Zad 4");
        paladin.hit(pierdola);
        System.out.println(pierdola);
        //Zad 5
        System.out.println("Zad 5");
        System.out.println(paladin);
        System.out.println(pierdola);
        paladin.fight(pierdola);
        System.out.println(paladin);
        System.out.println(pierdola);
    }
}
