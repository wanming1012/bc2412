import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Hero> heros = new ArrayList<>();
        heros.add(new Archer());
        heros.add(new Mage());
        heros.add(new Warrior());

        System.out.println("Oringal Heros");
        for (Hero hero : heros) {
            System.out.println(hero);
        }

        System.err.println("Hero Level Up");
        for (Hero hero : heros) {
            hero.levelUp();
            System.out.println(hero);
        }

        List<Weapon> weapons = new ArrayList<>();
        weapons.add(new Recurve());
        weapons.add(new Guinsoo());
        weapons.add(new Doran());
        weapons.add(new Hexdrinker());
        weapons.add(new Archangel());
        weapons.add(new Liandry());

        for (Weapon weapon : weapons) {
            System.out.println(weapon);
        }

        System.out.println("No weapon");
        System.out.println(heros.get(0));

        heros.get(0).setWeapon(weapons.get(0));
        System.out.println("With weapon");
        System.out.println(heros.get(0));

        heros.get(0).getWeapon().levelUp();
        System.out.println("Weapon level up");
        System.out.println(heros.get(0));

        heros.get(0).setWeapon(weapons.get(1));
        System.err.println("Change weapon");
        System.out.println(heros.get(0));

        heros.get(0).setWeapon(weapons.get(2));

        heros.get(0).removeWeapon();
        System.err.println("Remove weapon");
        System.out.println(heros.get(0));
    }
}
