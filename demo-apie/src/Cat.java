public class Cat extends Animal {
    private int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void walk() {
        System.out.println("Cat " + getName() + " is walking ...");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("m", 2);
        cat.walk();
    }
}
