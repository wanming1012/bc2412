public class Dog extends Animal {
  
  public Dog(String name) {
    super(name);
  }

  public void walk() {
    System.out.println("Dog " + getName() + " is walking ...");
  }
}
