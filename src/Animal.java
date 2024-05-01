public abstract class Animal {

    public abstract void Move();
    public abstract void Breathe();
    public abstract void Eat();
    public abstract void Reproduce();

}

/*
* If your Animal class doesn't have an explicitly defined constructor, Java automatically provides a default constructor with no arguments (public Animal()). In this case, when you extend Animal in the Jaguar class,
* the compiler automatically adds a call to the Animal class's default constructor within the Jaguar constructor. Since the default constructor doesn't require any arguments, you don't need to define one explicitly in
*  the Jaguar class.
*
* If your Animal class has a defined constructor with arguments (e.g., public Animal(String species, int age)), then extending it in Jaguar requires you to either:
* Define a constructor in Jaguar that explicitly calls the Animal class constructor: This ensures the Animal object's attributes are properly initialized.
* Make the Animal class constructor have default values: If some arguments in the Animal constructor are optional and have default values, you can create a Jaguar object without explicitly calling the Animal
* Constructor. However, it's generally better practice to explicitly call the parent class constructor.
*
* Example (Explicit Call):

public class Animal {
    private String species;
    private int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    // ... other methods
}

public class Jaguar extends Animal {

    public Jaguar(String species, int age) {
        super(species, age); // Explicit call to Animal constructor
    }

    @Override
    public void Move() {
        System.out.println("Moving...");
    }

    // ... other methods
}
*
*
*/