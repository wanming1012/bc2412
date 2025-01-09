public class SuperBox<T extends Animal3, U extends Hero, V extends Weapon> {
  private T animal;
  private U hero;
  private V weapon;

  public SuperBox() {
  }

  public void setAnimal(T animal) {
    this.animal = animal;
  }

  public void setHero(U hero) {
    this.hero = hero;
  }

  public void setWeapon(V weapon) {
    this.weapon = weapon;
  }

  public int totalAttack() {
    return this.animal.run() + this.hero.attack() + this.weapon.onTopAttach();
  }

  public static void main(String[] args) {
    SuperBox<Animal3, Hero, Weapon> s1 = new SuperBox<>();
    s1.setAnimal(new Tiger());
    s1.setHero(new Mage());
    s1.setWeapon(new Bow());
    System.out.println(s1.totalAttack());
    s1.setAnimal(new Panda());
    System.out.println(s1.totalAttack());
  }
}
