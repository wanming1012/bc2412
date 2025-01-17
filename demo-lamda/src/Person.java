/**
 * Description...
 * @author matthew.wan
 * @since
 * @version
 * Date:
 */

public class Person {

    private String name;
    private int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    /**
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this.name, this.age);
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("abc", 18);
        Person p2 = Person.builder()
            .name("abc")
            .age(18)
            .build();
    }
}
