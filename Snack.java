import java.io.*;
import java.util.*;

public class Snack extends Item {

    private float weight;
    private boolean containsNuts;
    
    public Snack(String name, float calories, String itemType, float weight, boolean containsNuts) {
        super(name, calories, itemType);
        this.weight = validateWeight(weight);
        this.containsNuts = containsNuts;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = validateWeight(weight);
    }

    public boolean isContainsNuts() {
        return containsNuts;
    }

    public void setContainsNuts(boolean containsNuts) {
        this.containsNuts = containsNuts;
    }

    @Override
    public String toString() {
        return "Snack{" +
               "name='" + getName() + '\'' +
               ", calories=" + getCalories() +
               ", itemType='" + getItemType() + '\'' +
               ", weight=" + weight +
               ", containsNuts=" + containsNuts +
               '}';
    }

    private float validateWeight(float weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be greater than 0.");
        }
        return weight;
    }
}
