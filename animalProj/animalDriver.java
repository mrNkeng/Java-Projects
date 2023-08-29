public class animalDriver {
    public static void main(String[] args) {
        // Creating a new shelter
        Shelter myShelter = new Shelter();
        
        // Creating some animal instances
        Animal genericAnimal = new Animal("Generic", "Just a generic animal", 5);
        Cat kitty = new Cat("Whiskers", "A lovely cat", 2, "Siamese", "Female");
        Dog doggo = new Dog("Rex", "A playful dog", 3, "Labrador", "Male");
        Reptile snake = new Reptile("Sly", "A quiet reptile", 1, "Python");

        // Test: Accepting animals into the shelter
        System.out.println("Adding animals to the shelter...");
        myShelter.accept(genericAnimal);
        myShelter.accept(kitty);
        myShelter.accept(doggo);
        myShelter.accept(snake);

        // Test: Display all animals in the shelter
        System.out.println("\nAll animals in the shelter:");
        myShelter.allAnimals();

        // Test: Adopting an animal
        System.out.println("\nAdopting an animal with ID: " + kitty.getId());
        myShelter.adopt(kitty.getId());

        // Test: Display all adopted animals
        System.out.println("\nAll adopted animals:");
        myShelter.adopted();

        // Test: Display all available animals
        System.out.println("\nAll available animals:");
        myShelter.available();

        // Test: Display animals of a specific type
        System.out.println("\nAll cats, including adopted ones:");
        myShelter.allType("Cat", true);

        System.out.println("\nAll dogs, not including adopted ones:");
        myShelter.allType("Dog", false);

        // Test: Accept an animal back into the shelter
        System.out.println("\nAccepting an animal back into the shelter with ID: " + kitty.getId());
        myShelter.accept(kitty.getId());

        // Test: Display all available animals after accepting one back
        System.out.println("\nAll available animals after accepting one back:");
        myShelter.available();
    }
}
