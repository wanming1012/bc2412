package factory;

import furniture.Chair;
import furniture.CoffeeTable;
import furniture.Sofa;

public interface FurnitureFactory {
  public enum Style {
    VICTORIAN, MODERN;
  }

  Chair createChair();

  Sofa createSofa();

  CoffeeTable createCoffeeTable();

  static FurnitureFactory createFactory(Style style) {
    return switch (style) {
      case VICTORIAN -> new VictorianFurnitureFactory();
      case MODERN -> new ModernFurnitureFactory();
    };
  }
}
