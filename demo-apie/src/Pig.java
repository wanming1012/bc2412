public class Pig extends Animal2 {
  public Pig(String name) {
    super(name);
  }

  public Pig() {
    super("Default");
  }

  public void sleep() {
    System.out.println("Pig " + getName() + " is sleeping ...");
  }
}
