import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class ArrayListExercise {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.
    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(10);
    integers.add(20);
    integers.add(30);
    integers.add(40);
    integers.add(50);

    // for (Integer integer : integers) {
    //   System.out.println(integer);
    // }
    System.out.println(integers);
    integers.remove(Integer.valueOf(30));
    System.out.println(integers.size());

    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.

    System.out.println("-------------------------");
    ArrayList<String> strings = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango", "Orange"));

    if (!strings.contains("Grapes")) {
      strings.add("Grape");
    }

    strings.set(2, "Peach");
    System.out.println(strings);

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.
    System.out.println("-------------------------");
    ArrayList<Integer> integers2 = new ArrayList<>(Arrays.asList(10, 20, 10, 30, 40, 20, 50));

    // HashSet<Integer> integers3 = new HashSet<>(integers2);
    // System.out.println(integers3);

    HashSet<Integer> integers4 = new HashSet<>();
    for (Integer integer : integers2) {
      integers4.add(integer);
    }
    System.out.println(integers4);

    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.
    System.out.println("-------------------------");
    HashSet<String> strings2 = new HashSet<>(Arrays.asList("USA", "India", "China", "Japan"));
    strings2.add("Canada");
    System.out.println(strings2.add("India"));
    System.out.println(strings2);

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of integers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.
    System.out.println("-------------------------");
    HashSet<Double> doubles = new HashSet<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
    System.out.println(doubles.contains(Double.valueOf(3.3)));
    doubles.remove(Double.valueOf(2.2));
    System.out.println(doubles.size());

    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.
    System.out.println("-------------------------");
    HashSet<Integer> set1 = new HashSet<>(Arrays.asList(10, 20, 30, 40));
    HashSet<Integer> set2 = new HashSet<>(Arrays.asList(30, 40, 50, 60));
    HashSet<Integer> common = new HashSet<>();
    common.addAll(set1);
    common.retainAll(set2);
    System.out.println(common);

    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.
    System.out.println("-------------------------");
    HashSet<String> strings3 = new HashSet<>(Arrays.asList("Cherry", "Steve", "Chole", "Jenny", "Vicky"));
    ArrayList<String> strings4 = new ArrayList<>(strings3);
    System.out.println(strings4);

    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'
    System.out.println("-------------------------");
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student(1, "Alice"));
    students.add(new Student(2, "Bob"));
    students.add(new Student(3, "Charlie"));

    System.out.println(students);

    System.out.println(searchStudent(1, students));

    ArrayList<Student> newStudents = new ArrayList<>();
    for (Student student : students) {
      if (student.getName().startsWith("A"))
        newStudents.add(student);
    }
    System.out.println(newStudents);


    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.
    System.out.println("-------------------------");
    HashSet<Student> studentSet1 = new HashSet<>(Arrays.asList(new Student(1, "Alice"), new Student(2, "Bob"), new Student(3, "Charlie")));
    HashSet<Student> studentSet2 = new HashSet<>(Arrays.asList(new Student(2, "Bob"), new Student(3, "Charlie"), new Student(4, "David")));
    System.out.println(studentSet1);
    System.out.println(studentSet2);
    studentSet1.retainAll(studentSet2);
    System.out.println(studentSet1);
  }

  public static class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
      this.id = id;
      this.name = name;
    }
    // getter, setter, etc.

    public int getId() {
      return this.id;
    }

    public String getName() {
      return this.name;
    }

    @Override
    public String toString() {
      return "Student[id=" + this.id + ", name=" + this.name + "]";
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.id);
    }
    
    @Override
    public boolean equals(Object obj) {
      if (obj == this)
        return true;

      if (!(obj instanceof Student))
        return false;

      Student student = (Student) obj;
      return Objects.equals(this.id, student.getId()) && Objects.equals(this.name, student.getName());
    }
  }

  public static String searchStudent(int id, ArrayList<Student> students) {
    for (Student student : students) {
      if (id == student.getId())
        return student.getName();
    }
    return "Student not found";
  }
}
