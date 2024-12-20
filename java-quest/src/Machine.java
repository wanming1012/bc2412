public class Machine {
  private String model;
  private Screw[] screws;
  private Spring[] springs;

  Machine(String model, Screw[] screws, Spring[] springs) {
    this.model = model;
    this.screws = screws;
    this.springs = springs;
  }

  public String getModel() {
    return model;
  }

  public Screw[] getScrews() {
    return screws;
  }

  public Spring[] getSprings() {
    return springs;
  }
}
