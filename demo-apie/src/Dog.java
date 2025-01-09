public class Dog extends Animal2 implements KeepAlive {
  
  public Dog(String name) {
    super(name);
  }

  public void walk() {
    System.out.println("Dog " + getName() + " is walking ...");
  }

  @Override 
  public void sleep() {
    System.out.println("Dog " + getName() + " is sleeping ...");
  }

  @Override
  public void drink() {
    System.out.println("Dog " + getName() + " is drinking ...");
  }
}
