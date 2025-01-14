public class Weapon {
  private static final int MAX_LEVEL = 3;
  private int level;
  private int[] pa;
  private int[] ma;
  private int[] cc;
  private boolean equiped;
  private WeaponType type;
  private String name;

  public Weapon(WeaponType type, String name, int[] pa, int[] ma, int[] cc) {
    this.level = 1;
    this.pa = pa;
    this.ma = ma;
    this.cc = cc;
    this.equiped = false;
    this.type = type;
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
  
  public WeaponType getType() {
    return this.type;
  }

  public void setEquiped(boolean equiped) {
    this.equiped = equiped;
  }

  public boolean isEquiped() {
    return this.equiped;
  }

  public int getLevel() {
    return this.level;
  }

  public int getPa() {
    return this.pa[level - 1];
  }

  public int getMa() {
    return this.ma[level - 1];
  }

  public int getCc() {
    return this.cc[level - 1];
  }

  public void levelUp() {
    if (this.level < Weapon.MAX_LEVEL)
      this.level++;
  }

  @Override
  public String toString() {
    return "Weapon[type=" + this.type + ",name=" + this.name + ",level=" + this.level + "]";
  }
}
