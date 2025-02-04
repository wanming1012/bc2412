package factory;
import furniture.Chair;
import furniture.CoffeeTable;
import furniture.Sofa;
import furniture.VictorianChair;
import furniture.VictorianCoffeeTable;
import furniture.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
  @Override
  public Chair createChair() {
    return new VictorianChair();
  }

  @Override
  public Sofa createSofa() {
    return new VictorianSofa();
  }

  @Override
  public CoffeeTable createCoffeeTable() {
    return new VictorianCoffeeTable();
  }
}
