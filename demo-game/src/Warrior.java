import java.util.Objects;

public class Warrior extends Hero {

  static {
    Hero.CD_MULTIPLIER.put(Role.WARRIOR, 4);
    Hero.MAX_HP.put(Role.WARRIOR, new Integer[] {10, 100, 1000, 10000, 100000});
    Hero.MAX_MP.put(Role.WARRIOR, new Integer[] {7, 70, 700, 7000, 70000});
    Hero.PA.put(Role.WARRIOR, new Integer[] {10, 100, 1000, 10000, 100000});
    Hero.PD.put(Role.WARRIOR, new Integer[] {10, 100, 1000, 10000, 100000});
    Hero.MA.put(Role.WARRIOR, new Integer[] {6, 60, 600, 6000, 60000});
    Hero.MD.put(Role.WARRIOR, new Integer[] {6, 60, 600, 6000, 60000});
    Hero.AG.put(Role.WARRIOR, new Integer[] {4, 40, 400, 4000, 40000});
    Hero.CC.put(Role.WARRIOR, new Integer[] {2, 20, 200, 2000, 20000});
  }

  public Warrior() {
    super(Role.WARRIOR);
  }

  @Override
  public void setWeapon(Weapon weapon) {
    if (weapon.getType() == WeaponType.SWORD) {
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

    if (!(obj instanceof Warrior))
      return false;

    Warrior warrior = (Warrior) obj;
    return Objects.equals(this.getId(), warrior.getId());
  }
}
