public enum Rank {
  ONE("1", 1),
  TWO("2", 2), 
  THREE("3", 3),
  FOUR("4", 4),
  FIVE("5", 5),
  SIX("6", 6),
  SEVEN("7", 7),
  EIGHT("8", 8),
  NINE("9", 9),
  TEN("10", 10),
  JACK("J", 10),
  QUEEN("Q", 10),
  KING("K", 10),
  ACE("A", 11);

  private final String description;
  private final int value;

  private Rank(String description, int value) {
    this.description = description;
    this.value = value;
  }

  public String getDescription() {
    return this.description;
  }

  public int getValue() {
    return this.value;
  }
}
