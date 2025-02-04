import factory.FurnitureFactory;
import furniture.Chair;
import furniture.CoffeeTable;
import furniture.Sofa;

public class DemoFactory {
    public static void main(String[] args) throws Exception {
        FurnitureFactory factory = FurnitureFactory.createFactory(FurnitureFactory.Style.VICTORIAN);
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable coffeeTable = factory.createCoffeeTable();

        chair.hasLegs();
        chair.sitOn();

        sofa.hasLegs();
        sofa.sitOn();

        coffeeTable.hasLegs();
        coffeeTable.putCoffee();
    }
}
