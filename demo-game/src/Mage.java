import java.util.Objects;

public class Mage extends Hero {
  private static final int CD_MULTIPLIER = 2;
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
    Mage.MAX_HP[0] = 9;
    Mage.MAX_HP[1] = 90;
    Mage.MAX_HP[2] = 900;
    Mage.MAX_HP[3] = 9000;
    Mage.MAX_HP[4] = 90000;

    Mage.MAX_MP[0] = 10;
    Mage.MAX_MP[1] = 100;
    Mage.MAX_MP[2] = 1000;
    Mage.MAX_MP[3] = 10000;
    Mage.MAX_MP[4] = 100000;
    
    Mage.PA[0] = 6;
    Mage.PA[1] = 60;
    Mage.PA[2] = 600;
    Mage.PA[3] = 6000;
    Mage.PA[4] = 60000;
    
    Mage.PD[0] = 6;
    Mage.PD[1] = 60;
    Mage.PD[2] = 600;
    Mage.PD[3] = 6000;
    Mage.PD[4] = 60000;
    
    Mage.MA[0] = 6;
    Mage.MA[1] = 60;
    Mage.MA[2] = 600;
    Mage.MA[3] = 6000;
    Mage.MA[4] = 60000;
    
    Mage.MD[0] = 6;
    Mage.MD[1] = 60;
    Mage.MD[2] = 600;
    Mage.MD[3] = 6000;
    Mage.MD[4] = 60000;
    
    Mage.AG[0] = 3;
    Mage.AG[1] = 30;
    Mage.AG[2] = 300;
    Mage.AG[3] = 3000;
    Mage.AG[4] = 30000;
    
    Mage.CC[0] = 8;
    Mage.CC[1] = 80;
    Mage.CC[2] = 800;
    Mage.CC[3] = 8000;
    Mage.CC[4] = 80000;

    for (int i = 0; i < Mage.MAX_LEVEL; i++) {
      Mage.CD[i] = Mage.CD_MULTIPLIER * Mage.PA[i];
    }  
  }

  @Override
  public String toString() {
    return "Mage[id=" + this.getId() + ",level=" + this.getLevel() + 
      ",hp=" + this.getHp() + ",mp=" + this.getMp() + "]";
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


  @Override
  public void levelUp()
  {
    int level = super.getLevel();
    if (level < MAX_LEVEL)
      super.setLevel(level + 1);

    super.setHp(Mage.MAX_HP[level]);
    super.setMp(Mage.MAX_MP[level]);
  }

  public Mage() {}
}
