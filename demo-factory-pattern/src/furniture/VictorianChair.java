package furniture;
public class VictorianChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("VitorianChair has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on VitorianChair");
    }
  
}
