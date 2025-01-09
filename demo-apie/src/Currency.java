public enum Currency {
  HKD("Hong Kong Dollar", 1), //
  CNY("Chinese Yuan Renminbi", 2), //
  USD("US Dollar", 3),;

  private final String desc;
  private final int value;

  private Currency(String desc, int value) {
    this.desc = desc;
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public String getDesc() {
    return this.desc;
  }

  public static String getDescription(Currency currency) {
    switch (currency) {
      case HKD:
        return "Hong Kong Dollar";

      case CNY:
        return "Chinese Yuan Renminbi";

      case USD:
        return "US Dollar";

      default:
        return "";
    }
  }

  public static void main(String[] args) {
    System.out.println(Currency.getDescription(Currency.CNY));

    System.out.println(Currency.CNY.getDesc());
    System.out.println(Currency.CNY.getValue());
  }
}
