import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        // Load data from files
        DataFile myData = new DataFile("directory.txt", "input.txt");

        // Initialize Vending machine with loaded data
        ArrayList<String> myVending = myData.loadDirectory();
        ArrayList<Integer> mySelections = myData.loadSampleInput();

        Vending myMachine = new Vending(myVending);

        // Display items before removing
        System.out.println("Items originally there:");
        myMachine.displayItems();

        // Remove items based on selections
        myMachine.unloadItem(mySelections);

        // Final output to display after removing items
        System.out.println("Final state of items:");
        myMachine.displayItems();
    }
}
