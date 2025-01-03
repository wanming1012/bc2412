public class Pig extends Animal {
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
