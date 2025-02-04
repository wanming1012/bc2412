package furniture;
public class ModernChair implements Chair {
  @Override
  public void hasLegs() {
    System.out.println("Modern chair has 4 legs.");
  }

  @Override
  public void sitOn() {
    System.out.println("Sitting on modern chair.");
  }

}
