package warrior;

public class Main {
    public static void main(String[] args) {
        //Zad 1 i 2

        Warrior paladin = new Warrior("Adam", 30, 150);
        Warrior pierdola = new Warrior("chujowy piechór");
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
        paladin.fight(pierdola);
        System.out.println(paladin);
        System.out.println(pierdola);
    }
}
