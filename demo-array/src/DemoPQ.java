import java.util.Comparator;
import java.util.PriorityQueue;

public class DemoPQ {
  static class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public int getAge() {
      return this.age;
    }
    
    public String getName() {
      return this.name;
    }

    @Override
    public String toString() {
      return "Person[name=" + this.getName() + ", age=" + this.getAge() + "]";
    }
  }

  static class SortByAge implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
      return p2.getAge() - p1.getAge();
    }  
  }


  public static void main(String[] args) {
    PriorityQueue<Person> pq = new PriorityQueue<>(new SortByAge());
    pq.add(new Person("Vincent", 35));
    System.out.println(pq);
    pq.add(new Person("Oscar", 20));
    System.out.println(pq);
    pq.add(new Person("Lucas", 60));
    System.out.println(pq);

    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());
  }
}
