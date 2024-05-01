public class Mammal {
    private String species;
    private String name;
    private int age;

    public Mammal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getInfo() {
        return String.format("Species: %s Name: %s Age: %d.",
                getSpecies(), getName(), getAge());
    }

}
