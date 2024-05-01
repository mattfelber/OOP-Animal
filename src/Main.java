import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Polar Bear:");
        PolarBear polarBear = new PolarBear();
        polarBear.surface();
        polarBear.dive();

        System.out.println();

        System.out.println("Jaguar:");
        Jaguar jaguar = new Jaguar();
        jaguar.Breathe();
        jaguar.Eat();
        jaguar.Move();
        jaguar.Reproduce();



        }


}