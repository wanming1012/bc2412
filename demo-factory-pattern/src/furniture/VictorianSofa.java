package furniture;
public class VictorianSofa implements Sofa {
    @Override
    public void hasLegs() {
        System.out.println("Victorian sofa has legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on Victorian sofa");
    }

}
