/** In this lab, I will demonstrate my understanding of arrays of one dimension. 
* There are 2 classes to be completed, 
*a class that maintains an array and a client class.
@author: Aminkeng Nkeng
*/
import java.util.Scanner;
import java.io.*;

public class WorldSeries {

Scanner scan = new Scanner(System.in);
final int SIZE = 120;
String[] winners = new String[SIZE]; // this is where I created my array

	public WorldSeries() throws IOException {
	String winner = "";
	Scanner inFile = new Scanner(new File("WorldSeriesWinners.txt")); // i read from a file
	int i = 120;
		while (inFile.hasNext()) { //while the file has a next line
			i--;
			winner = inFile.nextLine(); // set the winner equal to whats on the next line
			winners[i] = winner; // you are setting winner to what winner is at 'i' 
		}// end while
	}//end constuctor
	
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

	public void displayWinner() {
		for ( int i = 119; i >= 0; i--) {
			System.out.println((2022 - i) + " " + winners[i]);
		}// end for
	}// end Winner method

	public void displayWinnersByYear() {
	for ( int i = 0; i < SIZE; i++) { 
			System.out.println((i + 1903)+ " "+ winners[i]);
		}//end for
	}// end method 2
	
	public void findWinner(String champs) {
	boolean found = false;
	int count = 0; 
	for ( int i = 0; i < SIZE; i++) {
		if (winners[i].equalsIgnoreCase(champs)) {
			count ++; // count will keep track of the times a team has won.
			found = true; 
		}
	}// end for
		System.out.println(" The " + champs + " have won the world series " + count + " time(s).");
	if(!found)
		System.out.println("Sorry, I dont recognize that as a champions");
	}// end findWinner
	
	
	public void findYears(String champs) {
	boolean found = false;
	for ( int i = 0; i < SIZE; i++) {
		if (winners[i].equalsIgnoreCase(champs)){
			System.out.println((i + 1903));
			found = true;
		}
	}// end for
	if(!found)
		System.out.println("Sorry, they are not recognized as champions");
	}// end findYears
	
	public void winner(int year) {
	int index = year - 1903;
		if (index >= 0 && index < SIZE) {
			System.out.println(winners[index]);
		}
		else {
			System.out.println("The year is either invalid or the winner data isn't available for this year.");
		}
	}// end winner


}// end class