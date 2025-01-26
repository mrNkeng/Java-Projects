// The Reptile class extends the Animal class, inheriting its properties and methods
public class Reptile extends Animal {

    // Additional attribute specific to the Reptile class
    private String type;

    // Default constructor
    // Initializes a new Reptile object with default values for all attributes
    public Reptile() {
        this("", "", 0, ""); // Calls the overloaded constructor with default values
    }

    // Overloaded constructor
    // Initializes a new Reptile object with the provided attribute values
    public Reptile(String name, String description, int age, String type) {
        super(name, description, age); // Calls the overloaded constructor of the Animal superclass
        this.type = type;
    }

    // Equals method
    // Compares this Reptile object with another Reptile object for equality
    public boolean equals(Reptile testReptile) {
        boolean match = false;
        // Uses the equals() method of the Animal superclass for comparison of common attributes
        // Then checks the additional attribute (type) specific to Reptile
        if (super.equals(testReptile) && this.type.equals(testReptile.type))
            match = true;
        return match;
    }

    // toString method
    // Returns a string representation of this Reptile object
    public String toString() {
        // Uses the toString() method of the Animal superclass for common attributes
        String str = super.toString();
        // Appends the additional attribute specific to Reptile
        return str + "\nType: " + type;
    }
} // End of Reptile class
