public interface Swimmer {

    public abstract void swim(double speed, double duration) throws OutOfStaminaException;
    public abstract void dive();
    public abstract void surface();


}
