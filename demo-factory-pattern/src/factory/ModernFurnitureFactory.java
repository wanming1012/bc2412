package factory;
import furniture.Chair;
import furniture.CoffeeTable;
import furniture.ModernChair;
import furniture.ModernCoffeeTable;
import furniture.ModernSofa;
import furniture.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {
  @Override
  public Chair createChair() {
    return new ModernChair();
  }

  @Override
  public Sofa createSofa() {
    return new ModernSofa();
  }

  @Override
  public CoffeeTable createCoffeeTable() {
    return new ModernCoffeeTable();
  }
}
