import java.util.Date;
import java.util.Calendar;

public class Animal {

    // Static variable to keep track of the next ID
    private static int nextId = 10;

    // Instance variables for each Animal object
    private int id;
    private String gDescription;
    private String name;
    private int age;
    private Date arrival;
    private Date adoption;

    /**
     * Default constructor.
     * Initializes the Animal object with default values.
     */
    public Animal() {
        this("", "", 0);
    }

    /**
     * Overloaded constructor.
     * Initializes the Animal object with provided name, description, and age.
     * 
     * @param name The name of the animal.
     * @param gDescription The general description of the animal.
     * @param age The age of the animal.
     */
    public Animal(String name, String gDescription, int age) {
        this.name = name;
        this.gDescription = gDescription;
        this.age = age;
        arrival = Calendar.getInstance().getTime();
        adoption = Calendar.getInstance().getTime();
        id = nextId;
        nextId += 10;
    }

    /**
     * Copy constructor.
     * Creates a new Animal object as a copy of the given Animal object.
     * 
     * @param copyAnimal The Animal object to be copied.
     */
    public Animal(Animal copyAnimal) {
        id = copyAnimal.id;
        age = copyAnimal.age;
        name = copyAnimal.name;
        arrival = copyAnimal.arrival;
        adoption = copyAnimal.adoption;
    }

    /**
     * Gets the name of the Animal.
     * 
     * @return The name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the Animal.
     * 
     * @param name The new name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the ID of the Animal.
     * 
     * @return The ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the arrival date of the Animal.
     * 
     * @return The arrival date.
     */
    public Date getArrival() {
        return arrival;
    }

    /**
     * Sets the arrival date of the Animal.
     * 
     * @param arrival The new arrival date.
     */
    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    /**
     * Gets the adoption date of the Animal.
     * 
     * @return The adoption date.
     */
    public Date getAdoption() {
        return adoption;
    }

    /**
     * Sets the adoption date of the Animal.
     * 
     * @param adoption The new adoption date.
     */
    public void setAdoption(Date adoption) {
        this.adoption = adoption;
    }

    /**
     * Compares this Animal object to another for equality.
     * 
     * @param testAnimal The Animal to compare with.
     * @return True if equal, false otherwise.
     */
    public boolean equals(Animal testAnimal) {
        return this.name.equals(testAnimal.name) &&
               this.gDescription.equals(testAnimal.gDescription);
    }

    /**
     * Returns a string representation of the Animal object.
     * 
     * @return A string describing the Animal.
     */
    @Override
    public String toString() {
        return "\nName: " + name +
               "\nDescription: " + gDescription +
               "\nAge: " + age +
               "\nArrival: " + arrival +
               "\nAdoption: " + adoption;
    }
}
