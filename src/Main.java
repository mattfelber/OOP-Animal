

public class Main {
    public static void main(String[] args)
    {

        System.out.println("Polar Bear:");
        PolarBear polarBear = new PolarBear();
        polarBear.surface();
        polarBear.dive();
        try {
            polarBear.swim(55, 88);
        } catch (OutOfStaminaException e) {
            System.out.println("Stamina alert");
            System.out.println(e.getMessage());
        }

        System.out.println();

        Jaguar jaguar = new Jaguar();
        jaguar.Breathe();
        jaguar.Eat();
        jaguar.Move();
        jaguar.Reproduce();

        System.out.println();

        Rhinoceros rhinoceros = new Rhinoceros("Rhinoceros", "Jabari", 33);
        System.out.println(rhinoceros.getInfo());

    }
}