// The Dog class extends the Animal class, inheriting its attributes and behaviors
public class Dog extends Animal {

    // Additional attributes specific to the Dog class
    private String breed, sex;

    // Overloaded constructor
    // Initializes a new Dog object with the provided parameters
    public Dog(String name, String description, int age, String breed, String sex) {
        super(name, description, age); // Calls the overloaded constructor of the Animal superclass
        this.breed = breed;
        this.sex = sex;
    }

    // Default constructor
    // Initializes a new Dog object with default attribute values
    public Dog() {
        this("", "", 0, "", ""); // Calls the overloaded constructor with default values
    }

    // Equals method
    // Compares this Dog object with another Dog object
    public boolean equals(Dog testDog) {
        boolean match = false;
        // Uses the equals() method of the Animal superclass to compare common attributes
        // Then checks the additional attributes specific to Dog
        if (super.equals(testDog) && this.breed.equals(testDog.breed) && this.sex.equals(testDog.sex))
            match = true;
        return match;
    }

    // toString method
    // Returns a string representation of this Dog object
    public String toString() {
        // Uses the toString() method of the Animal superclass for common attributes
        String str = super.toString();
        // Appends additional attributes specific to Dog
        return str + "\nBreed: " + breed
                   + "\nSex: " + sex;
    }
} // end of Dog class
