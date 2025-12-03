/**
 * The Dog class represents a dog with a name, breed, and weight.
 * It provides constructors to initialize these values and 
 * getter and setter methods for accessing and modifying them.
 */
public class Dog {

    /** The dog's name */
    private String name;

    /** The dog's breed */
    private String breed;

    /** The dog's weight in pounds */
    private int weight; // MUST be int for the tests

    /**
     * Constructs a new Dog with the specified name, breed, and weight.
     *
     * @param name  the name of the dog
     * @param breed the breed of the dog
     * @param weight the weight of the dog in pounds
     */
    public Dog(String name, String breed, int weight) { // MUST use int
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    /** Returns the dog's name. */
    public String getName() {
        return name;
    }

    /** Sets the dog's name. */
    public void setName(String name) {
        this.name = name;
    }

    /** Returns the dog's breed. */
    public String getBreed() {
        return breed;
    }

    /** Sets the dog's breed. */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /** Returns the dog's weight. */
    public int getWeight() {
        return weight;
    }

    /** Sets the dog's weight. */
    public void setWeight(int weight) { // MUST take int
        this.weight = weight;
    }
}
