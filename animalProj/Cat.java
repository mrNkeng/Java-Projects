// The Cat class is a subclass of the Animal class
public class Cat extends Animal {
    
    // Additional attributes specific to Cat
    private String breed, sex;
    
    // Overloaded constructor
    // Initializes a new Cat object with the specified name, description, age, breed, and sex
    public Cat(String name, String description, int age, String breed, String sex) {
        super(name, description, age);  // Calls the overloaded constructor of the superclass Animal
        this.breed = breed;
        this.sex = sex;
    }
    
    // Default constructor
    // Initializes a new Cat object with default values
    public Cat(){
        this("","",0,"","");  // Calls the overloaded constructor with default values
    }
    
    // Equals method
    // Compares this Cat object to another Cat object
    public boolean equals(Cat testCat){
        boolean match = false;
        // Calls the equals method of the superclass Animal to check common attributes
        // Then compares additional attributes specific to Cat
        if (super.equals(testCat) && this.breed.equals(testCat.breed) && this.sex.equals(testCat.sex))
            match = true;
        return match;
    }
    
    // ToString method
    // Returns a string representation of this Cat object
    public String toString(){
        // Calls the toString method of the superclass Animal to get common attributes
        String str = super.toString();
        // Appends additional attributes specific to Cat
        return str + "\nBreed: " + breed
                   + "\nSex: " + sex;
    }
}//end class
