/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    System.out.println(str.charAt(str.indexOf('J')));
    // prints e (the 1st e)
    System.out.println(str.charAt(str.indexOf('e')));
    // code here ...

    // Use indexOf()
    // prints 3
    System.out.println(str.indexOf('t'));
    // prints 9
    System.out.println(str.indexOf('x'));
    // prints 10
    System.out.println(str.indexOf('L'));
    // code here ...

    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.println(abc.trim());

    // Use String replace() method
    // prints VenturenixLAB, Coding
    System.out.println(str.replace("Java", "Coding"));
    // code here ...

    // int length()
    // prints 19
    System.out.println(str.length());
    // code here ...

    // Use String substring(int start, int end)
    // prints "ren"
    System.out.println(str.substring(5, 8));
    // code here ...

    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    System.out.println(str.toUpperCase());
    // code here ...

    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    System.out.println(str.toUpperCase().replace('E', '*').concat("!!!"));
    // code here ...

  }
}