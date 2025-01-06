public interface Walkable {
  void walk();

  default void walkFaster() {
    System.out.println("A way to walk faster ...");
  }

  static int calculateDistance() {
    return -1;
  }
}
