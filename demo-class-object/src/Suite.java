public enum Suite {
  SPADE("♠", 0),
  HEART("♥", 1),
  DIAMOND("♦", 2),
  CLUB("♣", 3);

  private final String symbol;
  private final int value;

  private Suite(String symbol, int value) {
    this.symbol = symbol;
    this.value = value;
  }

  public String getSymbol() {
    return this.symbol;
  }

  public int getValue() {
    return this.value;
  }
}
