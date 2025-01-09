import java.util.Objects;

public class Cat extends Animal2 implements Walkable, Sleepable {
    private int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public void walk() {
        System.out.println("Cat " + getName() + " is walking ...");
    }

    @Override
    public void sleep() {
        System.out.println("Cat " + getName() + " is sleeping ...");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Cat))
            return false;
        Cat cat = (Cat) obj;
        return Objects.equals(cat.getAge(), this.age)
            && Objects.equals(cat.getName(), super.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.age, super.getName());
    }

    @Override
    public String toString() {
        return "Cat["
            + "age=" + this.age
            + ", name=" + super.getName()
            + "]";
    }

    public static void main(String[] args) {
        Cat cat = new Cat("m", 2);
        cat.walk();
    }
}
