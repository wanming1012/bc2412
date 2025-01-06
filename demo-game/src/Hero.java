public abstract class Hero {
  private static int numOfHeros = 0;
  private long id;
  private int hp;
  private int mp;
  private int level;

  //private Weapon weapon;
  protected static final int MAX_LEVEL = 5;
  //private Skill skill;
  protected static final int[] MAX_HP = new int[MAX_LEVEL];
  protected static final int[] MAX_MP = new int[MAX_LEVEL];
  protected static final int[] PA = new int[MAX_LEVEL];
  protected static final int[] PD = new int[MAX_LEVEL];
  protected static final int[] MA = new int[MAX_LEVEL];
  protected static final int[] MD = new int[MAX_LEVEL];
  protected static final int[] AG = new int[MAX_LEVEL];
  protected static final int[] CC = new int[MAX_LEVEL];
  protected static final int[] CD = new int[MAX_LEVEL];

  public Hero() {
    this.id = ++numOfHeros;
    this.level = 1;
    this.hp = MAX_HP[level - 1];
    this.mp = MAX_MP[level - 1];
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

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getMp() {
    return this.mp;
  }

  public void setMp(int mp) {
    this.mp = mp;
  }

  public int getLevel() {
    return this.level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public boolean isAlive() {
    return this.hp > 0;
  }

  public abstract void levelUp();
  
}
