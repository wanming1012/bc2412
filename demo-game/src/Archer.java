import java.util.Objects;

public class Archer extends Hero {
  private static final int CD_MULTIPLIER = 1;
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
    Archer.MAX_HP[0] = 8;
    Archer.MAX_HP[1] = 80;
    Archer.MAX_HP[2] = 800;
    Archer.MAX_HP[3] = 8000;
    Archer.MAX_HP[4] = 80000;

    Archer.MAX_MP[0] = 9;
    Archer.MAX_MP[1] = 90;
    Archer.MAX_MP[2] = 900;
    Archer.MAX_MP[3] = 9000;
    Archer.MAX_MP[4] = 90000;
    
    Archer.PA[0] = 8;
    Archer.PA[1] = 80;
    Archer.PA[2] = 800;
    Archer.PA[3] = 8000;
    Archer.PA[4] = 80000;
    
    Archer.PD[0] = 8;
    Archer.PD[1] = 80;
    Archer.PD[2] = 800;
    Archer.PD[3] = 8000;
    Archer.PD[4] = 80000;
    
    Archer.MA[0] = 8;
    Archer.MA[1] = 80;
    Archer.MA[2] = 800;
    Archer.MA[3] = 8000;
    Archer.MA[4] = 80000;
    
    Archer.MD[0] = 8;
    Archer.MD[1] = 80;
    Archer.MD[2] = 800;
    Archer.MD[3] = 8000;
    Archer.MD[4] = 80000;
    
    Archer.AG[0] = 10;
    Archer.AG[1] = 100;
    Archer.AG[2] = 1000;
    Archer.AG[3] = 10000;
    Archer.AG[4] = 100000;
    
    Archer.CC[0] = 10;
    Archer.CC[1] = 100;
    Archer.CC[2] = 1000;
    Archer.CC[3] = 10000;
    Archer.CC[4] = 100000;

    for (int i = 0; i < Archer.MAX_LEVEL; i++) {
      Archer.CD[i] = Archer.CD_MULTIPLIER * Archer.PA[i];
    }  
  }

  @Override
  public String toString() {
    return "Archer[id=" + this.getId() + ",level=" + this.getLevel() + 
      ",hp=" + this.getHp() + ",mp=" + this.getMp() + "]";
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

  @Override
  public void levelUp()
  {
    int level = super.getLevel();
    if (level < MAX_LEVEL)
      super.setLevel(level + 1);

    super.setHp(Archer.MAX_HP[level]);
    super.setMp(Archer.MAX_MP[level]);
  }
  
public Archer() {
  }  
}
