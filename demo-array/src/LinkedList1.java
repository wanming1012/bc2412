import java.util.Vector;

public class LinkedList1 {
  private Node head;

  public LinkedList1() {

  }

  public void add(int value) {
    Node node = new Node(value);
    if (this.head == null) {
      this.head = node;
    }
    else {
      Node temp = this.head;
      while (temp.next() != null) {
        temp = temp.next();
      }
      temp.setNode(node);
    }
  }

  public void remove() {
    if (this.head == null)
      return;
      
    this.head = this.head.next();
  }

  public int size() {
    int count = 0;
    Node temp = this.head;
    while (temp != null) {
      count++;
      temp = temp.next();
    }
    return count;
  }

  @Override
  public String toString() {
    String string = "[";
    Node temp = this.head;
    boolean firstElement = true;
    while (temp != null) {
      if (firstElement) {
        firstElement = false;
      }
      else {
        string += ", ";
      }
      string += temp.getValue();
      temp = temp.next();
    }
    string += "]";
    return string;
  }

  public static void main(String[] args) {
    LinkedList1 ll = new LinkedList1();
    ll.add(10);
    ll.add(20);
    ll.add(30);
    ll.add(40);
    System.out.println(ll);
    ll.remove();
    System.out.println(ll);
    System.out.println(ll.size());
  }
}
