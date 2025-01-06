import java.util.Objects;

public class Warrior extends Hero {
  private static final int CD_MULTIPLIER = 4;
  private static final int[] MAX_HP = new int[MAX_LEVEL];
  private static final int[] MAX_MP = new int[MAX_LEVEL];
  private static final int[] PA = new int[MAX_LEVEL];
  private static final int[] PD = new int[MAX_LEVEL];
  private static final int[] MA = new int[MAX_LEVEL];
  private static final int[] MD = new int[MAX_LEVEL];
  private static final int[] AG = new int[MAX_LEVEL];
  private static final int[] CC = new int[MAX_LEVEL];
  private static final int[] CD = new int[MAX_LEVEL];

  static {
    Warrior.MAX_HP[0] = 10;
    Warrior.MAX_HP[1] = 100;
    Warrior.MAX_HP[2] = 1000;
    Warrior.MAX_HP[3] = 10000;
    Warrior.MAX_HP[4] = 100000;

    Warrior.MAX_MP[0] = 7;
    Warrior.MAX_MP[1] = 70;
    Warrior.MAX_MP[2] = 700;
    Warrior.MAX_MP[3] = 7000;
    Warrior.MAX_MP[4] = 70000;
    
    Warrior.PA[0] = 10;
    Warrior.PA[1] = 100;
    Warrior.PA[2] = 1000;
    Warrior.PA[3] = 10000;
    Warrior.PA[4] = 100000;
    
    Warrior.PD[0] = 10;
    Warrior.PD[1] = 100;
    Warrior.PD[2] = 1000;
    Warrior.PD[3] = 10000;
    Warrior.PD[4] = 100000;
    
    Warrior.MA[0] = 6;
    Warrior.MA[1] = 60;
    Warrior.MA[2] = 600;
    Warrior.MA[3] = 6000;
    Warrior.MA[4] = 60000;
    
    Warrior.MD[0] = 6;
    Warrior.MD[1] = 60;
    Warrior.MD[2] = 600;
    Warrior.MD[3] = 6000;
    Warrior.MD[4] = 60000;
    
    Warrior.AG[0] = 4;
    Warrior.AG[1] = 40;
    Warrior.AG[2] = 400;
    Warrior.AG[3] = 4000;
    Warrior.AG[4] = 40000;
    
    Warrior.CC[0] = 2;
    Warrior.CC[1] = 20;
    Warrior.CC[2] = 200;
    Warrior.CC[3] = 2000;
    Warrior.CC[4] = 20000;

    for (int i = 0; i < Hero.MAX_LEVEL; i++) {
      Warrior.CD[i] = Warrior.CD_MULTIPLIER * Warrior.PA[i];
    }  
  }

  @Override
  public String toString() {
    return "Warrior[id=" + this.getId() + ",level=" + this.getLevel() + 
      ",hp=" + this.getHp() + ",mp=" + this.getMp() + "]";
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

  @Override
  public void levelUp()
  {
    int level = super.getLevel();
    if (level < MAX_LEVEL)
      super.setLevel(level + 1);

    super.setHp(Warrior.MAX_HP[level]);
    super.setMp(Warrior.MAX_MP[level]);
  }

  public Warrior() {

  }


}
