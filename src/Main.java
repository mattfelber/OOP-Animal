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