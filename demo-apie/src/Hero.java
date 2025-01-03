public class Hero {
  private int health;
  private int magic;
  private static final int MAX_HP = 100;
  private static final int MAX_MP = 100;

  public Hero() {
    this.health = Hero.MAX_HP;
    this.magic = 0;
  }

  public boolean isAlive() {
    return this.health > 0;
  }

  public void levelUp() {
    if (this.magic < Hero.MAX_MP)
    this.magic++;
  }
}
