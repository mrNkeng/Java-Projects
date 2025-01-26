import java.io.*;
import java.util.*;

public class Vending {
	
	private ArrayList<String> directory;
	// do I need to populate this? The contents are already in loadDirectory
	private ArrayList<Queue<Item>> slots; //contain a QUEUE of your Items (Drinks or Snacks)
	//
	
	public Vending(ArrayList<String> vender) {
		// initialize directory and slots arraylist
		directory = new ArrayList<String>();
		slots = new ArrayList<Queue<Item>>();
		
		loadItem(vender); // parse the data and load it into the vending machine 
	}// end constructor
	
	
	public void loadItem(ArrayList<String> loader) {
    for (String line : loader) {
        try {
            String[] divide = line.split(", ");
            String type = divide[0];
            String name = divide[1];
            float calories = Float.parseFloat(divide[2].trim());
            float quantity = Float.parseFloat(divide[3].trim());
            String attribute = divide[4];
            int count = Integer.parseInt(divide[5].trim());

            Queue<Item> q = new LinkedList<>();
            for (int i = 0; i < count; i++) {
                if (type.equalsIgnoreCase("Drink")) {
                    q.add(new Drink(name, calories, "Drink", quantity, attribute));
                } else if (type.equalsIgnoreCase("Snack")) {
                    boolean containsNuts = Boolean.parseBoolean(attribute);
                    q.add(new Snack(name, calories, "Snack", quantity, containsNuts));
                }
            }
            slots.add(q);  // Assuming slots is a List<Queue<Item>>
        } catch (Exception e) {
            System.out.println("Error processing line: " + line);
            e.printStackTrace();
        }
    }
}



	public void unloadItem(int index) {
    if (slots.isEmpty()) {
        System.out.println("The queue is empty, cannot unload item from empty queue");
        return;
    }
    if (index < 0 || index >= slots.size()) {
        System.out.println("Index out of bounds.");
        return;
    }

    Queue<Item> qTemp = slots.get(index);
    if (qTemp == null || qTemp.isEmpty()) {
        System.out.println("No product Items found at Index " + index);
        return;
    }
    
    qTemp.poll(); // Correctly removes the head of the queue
    System.out.println("Successfully removed item from index " + index);
	}

	public void unloadItem(ArrayList<Integer> indices) {
    for (int index : indices) {
        if (index >= 0 && index < slots.size()) {
            Queue<Item> slot = slots.get(index);
            if (slot != null && !slot.isEmpty()) {
                slot.poll();  // Remove one item from the queue
                System.out.println("Removed one item from slot " + index);
            } else {
                System.out.println("Slot " + index + " is already empty.");
            }
        } else {
            System.out.println("Index " + index + " is out of bounds.");
        }
    }
}


	public void displayItems() {
			for (Queue<Item> itemCount : slots) {
					if (itemCount == null || itemCount.isEmpty()) {
							System.out.println("Empty");
					} else {
							System.out.println(itemCount.peek().toString() + ", Amount: " + itemCount.size());
					}
			}
	}

	
}// end function

