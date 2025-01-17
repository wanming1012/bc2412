public class DemoStringBuilder {
  public static void main(String[] args) {
    String s = "hello";
    s += "!!!";
    s = "";
    long before = System.currentTimeMillis();
    for (int i = 0; i < 10_000; i++) {
      s += "!";
    }
    long after = System.currentTimeMillis();
    System.out.println(after - before);

    StringBuilder sb = new StringBuilder("");
    before = System.currentTimeMillis();
    for (int i = 0; i < 10_000; i++) {
      sb.append("!");
    }
    after = System.currentTimeMillis();
    System.out.println(after - before);

    sb = new StringBuilder("abcd");
    sb.reverse();
    System.out.println(sb);

    System.out.println(sb.charAt(2));

    sb.replace(0, 1, "yy");
    System.out.println(sb);

    sb.deleteCharAt(2);
    System.out.println(sb);

    sb.setCharAt(2, 'o');
    System.out.println(sb);

    sb.insert(1, "!!!");
    System.out.println(sb);
  }

}
