public class DemoIf {
  public static void main(String[] args) {
    String s = "hello";
    if (s.length() > 3) {
      System.out.println("Length of s is more than 3");
    }

    int age = 18;
    if (age >= 18) {
      System.out.println("You are adult");
    }

    char grade = ' ';
    int score = 87;
    char gender = 'M';
    if (score >= 90) {
      grade = 'A';
    }
    else if (gender == 'M' && score >= 87 || gender == 'F' && score >= 85) {
      grade = 'T';
    }
    else if (score >= 80) {
      grade = 'B';
    }
    else if (score >= 70) {
      grade = 'C';
    }
    else {
      grade = 'F';
    }

    System.out.println(grade);

    int tGradeMinScore = 85;
    if (gender == 'M') {
      tGradeMinScore = 87;
    }
    if (score >= 90) {
      grade = 'A';
    }
    else if (score >= tGradeMinScore) {
      grade = 'T';
    }
    else if (score >= 80) {
      grade = 'B';
    }
    else if (score >= 70) {
      grade = 'C';
    }
    else {
      grade = 'F';
    }

    System.out.println(grade);

  }
}
