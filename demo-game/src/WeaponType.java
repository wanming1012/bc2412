public enum WeaponType {
  BOW("Bow"), SWORD("Sword"), STAVE("Stave");

  private String description;

  private WeaponType(String description) {
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }
}
