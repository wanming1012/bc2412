package furniture;
public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void hasLegs() {
        System.out.println("Victorian coffee table has legs");
    }

    @Override
    public void putCoffee() {
        System.out.println("You can put coffee on a Victorian coffee table");
    }
  
}
