public class Animal2 implements Eatable {
  private String name;

  public Animal2(String name) {
    this.name = name;
  }
  
  public String getName() {
    return this.name;
  }

  @Override
  public void eat() {
    System.out.println("Animal " + this.name + " is eating ...");
  }

  public static void main(String[] args) {
    Animal2[] animals = new Animal2[3];
    animals[0] = new Cat("Cat1", 10);
    animals[1] = new Dog("Dog1");
    animals[2] = new Pig("PIg1");

    for(int i = 0; i < 3; i++) {
      animals[i].eat();
    }
  }
}
