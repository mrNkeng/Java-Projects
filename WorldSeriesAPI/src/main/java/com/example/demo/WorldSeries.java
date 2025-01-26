package com.example.demo;


import java.util.ArrayList;
//import java.util.List;
/** In this lab, I will demonstrate my understanding of arrays of one dimension. 
* There are 2 classes to be completed, 
*a class that maintains an array and a client class.
@author: Aminkeng Nkeng
*/
import java.util.Scanner;
import java.io.*;

public class WorldSeries {

Scanner scan = new Scanner(System.in);
final int SIZE = 121;
String[] winners = new String[SIZE]; // this is where I created my array

public WorldSeries() throws IOException {
  String winner = "";
  InputStream is = getClass().getClassLoader().getResourceAsStream("WorldSeriesWinners.txt");
  Scanner inFile = new Scanner(is); // Read from the file
  int i = 121;
  while (inFile.hasNext()) { //while the file has a next line
      i--;
      winner = inFile.nextLine(); // set the winner equal to what's on the next line
      winners[i] = winner; // you are setting winner to what winner is at 'i' 
  }// end while
  inFile.close();
}//end constructor

	
	public void mainMenu(){
		System.out.println("Main Menu");
		System.out.println("1: Show all winners by descending years");
		System.out.println("2: Show all winners by ascending years");
		System.out.println("3: Show how many times a particular team has won");
		System.out.println("4: Show the years a particluar team has won");
		System.out.println("5: Show the winner for a particular year");
		System.out.println("6: Exit");
		System.out.println("What number interests you?: ");
	}

	public String[] getWinners(){ // for controller access
		return winners;
	}

	public void displayWinner() {
		for ( int i = 120; i >= 0; i--) {
			System.out.println((2023 - i) + " " + winners[i]);
		}// end for
	}// end Winner method

	public void displayWinnersByYear() {
	for ( int i = 0; i < SIZE; i++) { 
			System.out.println((i + 1903)+ " "+ winners[i]);
		}//end for
	}// end method 2
	
	public int findWinner(String chmaps) {
    int count = 0; // Initialize a counter to keep track of the number of wins
    for (String winner : winners) { // Iterate through the array of winners
        if (winner.equalsIgnoreCase(chmaps)) { // Check if the current winner matches the team name (case-insensitive)
            count++; // Increment the counter if a match is found
        }
    }
    return count; // Return the total count of wins for the specified team
}
	
	
public int[] findYears(String team) { // Create a list to store the years when the specified team won the World Series
    ArrayList<Integer> yearsList = new ArrayList<>(); // Iterate through the array of World Series winners
    for (int i = 0; i < winners.length; i++) { // Check if the current winner matches the specified team name, ignoring case differences
        if (winners[i].equalsIgnoreCase(team)) {
            // Calculate the corresponding year and add it to the list
            // Assuming the first entry in the 'winners' array corresponds to the year 1903
            yearsList.add(1903 + i);
        }
    }
    // Convert the list of years to an array and return it
    return yearsList.stream().mapToInt(i -> i).toArray();
}

	
public String winner(int year) {
	int index = year - 1903; // Adjust based on your array's starting year
	if (index >= 0 && index < winners.length) {
			return winners[index];
	} else {
			return "Data not available for this year";
	}
}



}// end class
