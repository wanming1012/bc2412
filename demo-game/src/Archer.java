import java.util.Objects;

public class Archer extends Hero {
  static {
    Hero.CD_MULTIPLIER.put(Role.ARCHER, 1);
    Hero.MAX_HP.put(Role.ARCHER, new Integer[] {8, 80, 800, 8000, 80000});
    Hero.MAX_MP.put(Role.ARCHER, new Integer[] {9, 90, 900, 9000, 90000});
    Hero.PA.put(Role.ARCHER, new Integer[] {8, 80, 800, 8000, 80000});
    Hero.PD.put(Role.ARCHER, new Integer[] {8, 80, 800, 8000, 80000});
    Hero.MA.put(Role.ARCHER, new Integer[] {8, 80, 800, 8000, 80000});
    Hero.MD.put(Role.ARCHER, new Integer[] {8, 80, 800, 8000, 80000});
    Hero.AG.put(Role.ARCHER, new Integer[] {10, 100, 1000, 10000, 100000});
    Hero.CC.put(Role.ARCHER, new Integer[] {10, 100, 1000, 10000, 100000});
  }

  public Archer() {
    super(Role.ARCHER);
  }

  @Override
  public void setWeapon(Weapon weapon) {
    if (weapon.getType() == WeaponType.BOW) {
      super.setWeapon(weapon);
    }
    else {
      System.out.println("Invalid weapon type");
    }
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (!(obj instanceof Archer))
      return false;

    Archer archer = (Archer) obj;
    return Objects.equals(this.getId(), archer.getId());
  }
}
