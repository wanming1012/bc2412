public class Spring {
  private double springRate;
  private double diameter;
  private double freeLength;
  private double solidLength;

  Spring(double springRate, double diameter, double freeLength, double solidLength) {
    this.springRate = springRate;
    this.diameter = diameter;
    this.freeLength = freeLength;
    this.solidLength = solidLength;
  }

  public double getSpringRate() {
    return springRate;
  }

  public double getDiameter() {
    return diameter;
  }

  public double getFreeLength() {
    return freeLength;
  }

  public double getSolidLength() {
    return solidLength;
  }
}