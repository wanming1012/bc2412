public class DemoInnerClass {
  private int x = 0;

  public void setX(int x) {
    this.x = x;
  }

  public void print() {
    System.out.println("DIC.print() x=" + x + ", z=" + Library.z);
  }

  public static class Library {
    private static int z = 10;
  }

  public class Student {
    private int y = 0;

    public void setY(int y) {
      this.y = y;
    }

    public void print() {
      System.out.println("Student.print() x=" + x + ", y=" + this.y);
    }
  }

  public static void main(String[] args) {
    DemoInnerClass.Library library = new DemoInnerClass.Library();
    DemoInnerClass dic = new DemoInnerClass();
    DemoInnerClass.Student student = dic.new Student();
    student.setY(10);
    dic.setX(30);
    student.print();
    dic.print();
  }
}
