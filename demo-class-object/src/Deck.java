public class Deck {
  private Card[] cards;

  public Deck() {
    cards = new Card[Card.RANKS.length * Card.SUITES.length];
    int idx = 0;
    for (char suite : Card.SUITES) {
      for (char rank : Card.RANKS) {
        cards[idx++] = new Card(rank, suite);
      }
    }
  }

  public Card getCard(int index) {
    return this.cards[index];
  }

  public static void main(String[] args) {
    Deck deck = new Deck();

    for (int i = 0; i < 52; i++) {
      deck.getCard(i).print();
    }
  }
}
