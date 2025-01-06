public class Skill {
  private String name;
  private int type;
  private int power;

  private static final int MAGIC_SKILL = 1;
  private static final int ATTACK_SKILL = 2;

  public Skill(String name, int type, int power) {
    this.name = name;
    this.type = type;
    this.power = power;
  }

  public String getName() {
    return this.name;
  }

  public int getPower() {
    return this.power;
  }

  public int getType() {
    return this.type;
  }
}
