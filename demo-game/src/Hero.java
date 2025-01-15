import java.util.HashMap;
import java.util.Map;

public abstract class Hero {
  private static long nextId = 0;
  private long id;
  private int hp;
  private int mp;
  private int level;
  private Weapon weapon;
  private Role role;

  //private Weapon weapon;
  private static final int MAX_LEVEL = 5;
  //private Skill skill;
  protected static final Map<Role, Integer> CD_MULTIPLIER = new HashMap<>();
  protected static final Map<Role, Integer[]> MAX_HP = new HashMap<>();
  protected static final Map<Role, Integer[]> MAX_MP = new HashMap<>();
  protected static final Map<Role, Integer[]> PA = new HashMap<>();
  protected static final Map<Role, Integer[]> PD = new HashMap<>();
  protected static final Map<Role, Integer[]> MA = new HashMap<>();
  protected static final Map<Role, Integer[]> MD = new HashMap<>();
  protected static final Map<Role, Integer[]> AG = new HashMap<>();
  protected static final Map<Role, Integer[]> CC = new HashMap<>();
  //protected static final HashMap<Role, Integer[]> CD = new HashMap<>();

  public Hero(Role role) {
    this.id = ++nextId;
    this.level = 1;
    this.role = role;
    this.hp = MAX_HP.get(role)[level - 1];
    this.mp = MAX_MP.get(role)[level - 1];
  }

  // public String getName() {
  //   return this.name;
  // }

  public long getId() {
    return this.id;
  }

  public int getHp() {
    return this.hp;
  }

  // public void setHp(int hp) {
  //   this.hp = hp;
  // }

  public int getMp() {
    return this.mp;
  }

  // public void setMp(int mp) {
  //   this.mp = mp;
  // }

  public int getLevel() {
    return this.level;
  }

  // public void setLevel(int level) {
  //   this.level = level;
  // }

  public boolean isAlive() {
    return this.hp > 0;
  }

  public void levelUp()
  {
    if (this.level < MAX_LEVEL)
      this.level++;

    this.hp = Hero.MAX_HP.get(role)[level - 1];
    this.mp = Hero.MAX_MP.get(role)[level - 1];
  }

  public int getPa() {
    int pa = Hero.PA.get(this.role)[level - 1];
    if (weapon != null)
      pa += weapon.getPa();

    return pa;
  }

  public int getPd() {
    return Hero.PD.get(this.role)[level - 1];
  }

  public int getMa() {
    int ma = Hero.MA.get(this.role)[level - 1];
    if (weapon != null)
      ma += weapon.getMa();

    return ma;
  }

  public int getMd() {
    return Hero.MD.get(this.role)[level - 1];
  }

  public int getAg() {
    return Hero.AG.get(this.role)[level - 1];
  }

  public int getCc() {
    int cc = Hero.CC.get(this.role)[level - 1];
    if (weapon != null)
      cc += weapon.getCc();

    return cc;
  }

  public int getCd() {
    return Hero.PA.get(this.role)[level - 1] * Hero.CD_MULTIPLIER.get(this.role);
  }

  public Weapon getWeapon() {
    return this.weapon;
  }

  public void setWeapon(Weapon weapon) {
    if (weapon.isEquiped())
      return;

    if (this.weapon != null)
      removeWeapon();

    this.weapon = weapon;
    this.weapon.setEquiped(true);
  }

  public void removeWeapon() {
    this.weapon.setEquiped(false);
    this.weapon = null;
  }

  @Override
  public String toString() {
    return role.getDescription() + "[id=" + this.id + ",level=" + this.level + 
      ",hp=" + this.hp + ",mp=" + this.mp + 
      ",pa=" + this.getPa() + ",pd=" + this.getPd() +
      ",ma=" + this.getMa() + ",md=" + this.getMd() +
      ",ag=" + this.getAg() + ",cc=" + this.getCc() + ",cd" + this.getCd() +
      ",weapon=" + this.weapon + "]";
  }
}
