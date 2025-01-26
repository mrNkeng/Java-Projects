import java.io.*;
import java.util.*;

public class Item {

    private String name;
    private float calories;
    private String itemType;
    
    public Item(String name, float calories, String itemType) {
        this.name = name;
        this.calories = validateCalories(calories);
        this.itemType = itemType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = validateCalories(calories);
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        if(itemType == null || itemType.trim().isEmpty()) {
            throw new IllegalArgumentException("Item type cannot be null or empty.");
        }
        this.itemType = itemType;
    }

    @Override
    public String toString() {
        return "Item{" +
               "name='" + name + '\'' +
               ", calories=" + calories +
               ", itemType='" + itemType + '\'' +
               '}';
    }

    private float validateCalories(float calories) {
        if(calories < 0) {
            throw new IllegalArgumentException("Calories cannot be negative.");
        }
        return calories;
    }
}
