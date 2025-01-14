import java.util.Objects;

public class Mage extends Hero {
  static {
    Hero.CD_MULTIPLIER.put(Role.MAGE, 2);
    Hero.MAX_HP.put(Role.MAGE, new Integer[] {9, 90, 900, 9000, 90000});
    Hero.MAX_MP.put(Role.MAGE, new Integer[] {10, 100, 1000, 10000, 100000});
    Hero.PA.put(Role.MAGE, new Integer[] {6, 60, 600, 6000, 60000});
    Hero.PD.put(Role.MAGE, new Integer[] {6, 60, 600, 6000, 60000});
    Hero.MA.put(Role.MAGE, new Integer[] {6, 60, 600, 6000, 60000});
    Hero.MD.put(Role.MAGE, new Integer[] {6, 60, 600, 6000, 60000});
    Hero.AG.put(Role.MAGE, new Integer[] {3, 30, 300, 3000, 30000});
    Hero.CC.put(Role.MAGE, new Integer[] {8, 80, 800, 8000, 80000});
  }

  public Mage() {
    super(Role.MAGE);
  }

  @Override
  public void setWeapon(Weapon weapon) {
    if (weapon.getType() == WeaponType.STAVE) {
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

    if (!(obj instanceof Mage))
      return false;

    Mage mage = (Mage) obj;
    return Objects.equals(this.getId(), mage.getId());
  }

}
