package furniture;
public class ModernSofa implements Sofa {
  @Override
  public void hasLegs() {
    System.out.println("Modern sofa has legs");
  }

  @Override
  public void sitOn() {
    System.out.println("Sitting on modern sofa");
  }
}
