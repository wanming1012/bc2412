enum Role {
  ARCHER("Archer"),
  MAGE("Mage"),
  WARRIOR("Warrior");

  private String description;

  private Role(String description) {
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }
}
