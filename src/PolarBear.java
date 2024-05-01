public class PolarBear implements Swimmer
{
    double stamina;

    @Override
    public void swim(double speed, double duration) throws OutOfStaminaException
    {
        double staminaCost = speed * duration;
        if (stamina - staminaCost < 0)
        {
            throw new OutOfStaminaException();
        }
        stamina -= staminaCost;
    }

    @Override
    public void dive() {
        System.out.println("Swimming Down ↘️ ");
    }

    @Override
    public void surface() {
        System.out.println("Swimming Up ↗️");

    }


}
