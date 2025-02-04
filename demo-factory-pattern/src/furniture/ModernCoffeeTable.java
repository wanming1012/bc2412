package furniture;
public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void hasLegs() {
        System.out.println("Modern coffee table has legs");
    }

    @Override
    public void putCoffee() {
        System.out.println("Put coffee on modern coffee table");
    }
  
}
