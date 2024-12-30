public class Card {
  private char rank;
  private char suite;
  public static final char[] RANKS = new char[] {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
  public static final char[] SUITES = new char[] {'D', 'C', 'H', 'S'};

  public Card(char rank, char suite) {
    this.rank = rank;
    this.suite = suite;
  }

  public char getRank() {
    return this.rank;
  }
  
  public char getSuite() {
    return this.suite;
  }

  public void print() {
    System.out.println(getRank() + " of " + getSuite());
  }

  public static void main(String[] args) {
    Card c1 = new Card('A', 'S');
    c1.print();
    Card c2 = new Card('1', 'D');
    c2.print();
  }
}
