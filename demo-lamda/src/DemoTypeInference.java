import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoTypeInference {
  public static void main(String[] args) {
    var x = 3;
    var y = 3.3;
    y = 3;

    List<List<String>> stringLists = new ArrayList<>();
    stringLists.add(Arrays.asList("abc", "def"));
    stringLists.add(Arrays.asList("123", "456"));

    for (var list : stringLists) {
      for (var str : list) {
        System.out.println(str);
      }
    }

    List<String> stringList = stringLists.stream().flatMap(e -> e.stream())
        .collect(Collectors.toList());
    System.out.println(stringList);

    List<Customer> customers = Arrays.asList(new Customer("vincent", "vlau", List.of("v9", "v8")),
        new Customer("lucas", "lll", List.of("l1", "l2", "l3")));

    List<String> usernames = customers.stream().map(Customer::getUserName)
        .collect(Collectors.toList());
    System.out.println(usernames);

    List<String> nicknames = customers.stream().flatMap(e -> e.getNickNames().stream())
        .collect(Collectors.toList());
    System.out.println(nicknames);
  }

  public static class Customer {
    private String name;
    private String username;
    private List<String> nicknames;

    public Customer(String name, String username, List<String> nicknames) {
      this.name = name;
      this.username = username;
      this.nicknames = nicknames;
    }

    public String getUserName() {
      return this.username;
    }

    public List<String> getNickNames() {
      return this.nicknames;
    }
  }
}
