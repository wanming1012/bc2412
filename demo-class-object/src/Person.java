import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private String email;

    Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        Person p1 = new Person("vincent", 18, "vincent@abc.com");
        Person p2 = new Person("lucas", 17, "lucas@abc.com");

        Person[] persons = new Person[] {p1, p2, new Person("matthew", 100, "matthew@abc.com")};
        for(Person person : persons) {
            System.out.println(person.getName() + "," + person.getAge() + "," + person.getEmail());
        }

        String temp = p1.getName();
        temp = new String("new_vincent");
        System.out.println(temp);
        System.out.println(p1.getName());
    }
}
