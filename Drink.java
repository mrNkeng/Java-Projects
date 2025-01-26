import java.io.*;
import java.util.*;

public class Drink extends Item{
	
	private float ounces;
	private String type;
	
	public Drink(String name, float calories, String itemType, float ounces, String type){
		super(name, calories, itemType);
		this.ounces = ounces;
		this.type = type;
		// TODO Auto-generated constructor stub
	}

	public float getOunces() {
		return ounces;
	}

	public void setOunces(float ounces) {
    if (ounces > 0) {
        this.ounces = ounces;
    } else {
        throw new IllegalArgumentException("Ounces must be positive.");
    }
}

	public String getType() {
		return type;
	}

	public void setType(String type) {
    if (type == null || type.trim().isEmpty()) {
        throw new IllegalArgumentException("Type cannot be null or empty.");
    }
    this.type = type;
}

	@Override
	public String toString() {
		return "Drink [ounces=" + ounces + ", type=" + type + "]";
	}
	
	
	
	
	
	
	
}