public class Card {
  private Rank rank;
  private Suite suite;
  //public static final char[] RANKS = new char[] {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
  //public static final char[] SUITES = new char[] {'D', 'C', 'H', 'S'};

  public Card(Rank rank, Suite suite) {
    this.rank = rank;
    this.suite = suite;
  }

  public Rank getRank() {
    return this.rank;
  }
  
  public Suite getSuite() {
    return this.suite;
  }

  @Override
  public String toString() {
    return this.rank.getDescription() + this.suite.getSymbol();
  }

  public static void main(String[] args) {
    Card c1 = new Card(Rank.ACE, Suite.SPADE);
    System.out.println(c1);
    Card c2 = new Card(Rank.ONE, Suite.DIAMOND);
    System.out.println(c2);
  }
}
