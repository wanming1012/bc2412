import java.util.ArrayList;
import java.util.List;

public class Deck {
  private final List<Card> cards;

  public Deck() {
    this.cards = new ArrayList<>();
    for (Suite suite : Suite.values()) {
      for (Rank rank : Rank.values()) {
        this.cards.add(new Card(rank, suite));
      }
    }
  }

  public Card getCard(int index) {
    return this.cards.get(index);
  }

  @Override
  public String toString() {
    return this.cards.toString();
  }

  public static void main(String[] args) {
    Deck deck = new Deck();

    System.out.println(deck);
  }
}
