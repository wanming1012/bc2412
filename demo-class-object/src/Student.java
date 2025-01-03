public class Student {
  private int score;
  private Candy candy;
  //private int numOfCandies;
  //private static int numOfAvailableCandies = 20;

  public Student(int score) {
    this.score = score;
    if (score >= 80)
      this.candy = new Candy(Candy.RED);
    else if (score >= 60)
      this.candy = new Candy(Candy.BLUE);
    else
      this.candy = new Candy(Candy.YELLOW);
    //numOfCandies = 0;
  }

  // public void addCandy(int numOfCandies) {
  //   this.numOfCandies += numOfCandies;
  //   Student.numOfAvailableCandies -= numOfCandies;
  // }

  // public int getNumOfCandies() {
  //   return this.numOfCandies;
  // }

  public int getScore() {
    return this.score;
  }

  public String getCandyColor() {
    return candy.getColorStr();
  }

  // public static int getNumOfAvailableCandies() {
  //   return Student.numOfAvailableCandies;
  // }

  public static void main(String[] args) {
    Student[] students = new Student[] {new Student(67), new Student(89), new Student(50), new Student(99), new Student(60), new Student(59)};
    // while (Student.getNumOfAvailableCandies() > 0) {
    //   for (Student student : students) {
    //     int score = student.getScore();
    //     if (score >= 80 && Student.getNumOfAvailableCandies() >= 2) {
    //       student.addCandy(2);
    //     }
    //     else if (score >= 60 && Student.getNumOfAvailableCandies() >= 1) {
    //       student.addCandy(1);
    //     }
    //   }
    // }

    for (int i = 0; i < students.length; i++) {
      System.out.println("Student " + (i + 1) + " has " + students[i].getCandyColor() + " candy");
    }
  }
}
