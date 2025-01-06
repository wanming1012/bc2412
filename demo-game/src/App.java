public class App {
    public static void main(String[] args) throws Exception {
        Hero[] heros = new Hero[3];
        heros[0] = new Archer();
        heros[1] = new Mage();
        heros[2] = new Warrior();

        for (Hero hero : heros) {
            System.out.println(hero);
        }

        for (Hero hero : heros) {
            hero.levelUp();
            System.out.println(hero);
        }
    }
}
