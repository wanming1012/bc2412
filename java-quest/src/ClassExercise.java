import java.util.Arrays;

public class ClassExercise {

  public static void main(String[] args) {
    Screw[] screws = new Screw[] {new Screw(3.0, 10.0), new Screw(4.0, 20.0), new Screw(3.0, 25.0)};
    Spring[] springs = new Spring[] {new Spring(1.0, 5.0, 10.0, 3.0), new Spring(1.5, 6.0, 20.0, 5.0)};
    Machine machine = new Machine("SuperMachine", screws, springs);

    System.out.println(machine.getModel());
    Screw[] temp = machine.getScrews();
    System.out.println(temp[0].getDiameter());
    temp[0] = new Screw(5.0, 50.0); // object's screw array are modified?  Supposed to behave like this?
    Screw[] temp2 = machine.getScrews();
    System.out.println(temp2[0].getDiameter());
  }
  
}
