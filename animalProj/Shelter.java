import java.util.ArrayList;

// The Shelter class manages an ArrayList of Animal objects
public class Shelter {

    // ArrayList to store Animal objects in the shelter
    private ArrayList<Animal> aList = new ArrayList<>();

    // Display all animals in the shelter, including those that have been adopted
    public void allAnimals() {
        for (Animal a : aList) {
            System.out.println(a);
        }
    }

    // Display all animals currently available for adoption
    public void available() {
        for (Animal a : aList) {
            if (a.getAdoption() == null) {
                System.out.println(a);
            }
        }
    }

    // Display all animals that have been adopted
    public void adopted() {
        for (Animal a : aList) {
            if (a.getAdoption() != null) {
                System.out.println(a);
            }
        }
    }

    // Display all animals of a particular type
    // You may need to create an AnimalType enumeration or use some other logic
    public void allType(String animalType, boolean includeAdopted) {
        for (Animal a : aList) {
            if (a.getClass().getSimpleName().equals(animalType)) {
                if (includeAdopted || a.getAdoption() == null) {
                    System.out.println(a);
                }
            }
        }
    }

    // Change an animal's status to adopted
    public boolean adopt(int id) {
        for (Animal a : aList) {
            if (a.getId() == id && a.getAdoption() == null) {
                a.setAdoption(new java.util.Date()); // set adoption date to now
                return true;
            }
        }
        return false;
    }

    // Accept an animal into the shelter
    public boolean accept(Animal pet) {
        // You can include logic to check if shelter is full
        aList.add(pet);
        return true;
    }

    // Accept an animal back into the shelter using its ID
    public boolean accept(int id) {
        for (Animal a : aList) {
            if (a.getId() == id) {
                a.setAdoption(null); // clear adoption date
                return true;
            }
        }
        return false;
    }
} // end class
