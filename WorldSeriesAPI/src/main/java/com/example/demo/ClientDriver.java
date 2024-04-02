package com.example.demo;

// this is the client driver class with the main method
import java.io.IOException;
import java.util.Scanner;

public class ClientDriver {

   public static void main(String[] args) throws IOException {
	   WorldSeries u1 = new WorldSeries();
      int choice = 0;
      String team = "";
      int year = 0;
      Scanner scan = new Scanner(System.in);
      u1.mainMenu();
      choice = scan.nextInt();

      while(true) {
         if(choice == 1){
            u1.displayWinner();
            u1.mainMenu();
            choice = scan.nextInt();
         }// end if

            //Method 2  
         else if(choice == 2) {
            u1.displayWinnersByYear();
            u1.mainMenu();
            choice = scan.nextInt();
         }// end else if
               
         else if(choice == 3) {
            scan.nextLine();// consumes the empty space character left in the input stream.
            System.out.println("Enter the name of the team you seek: ");
            team = scan.nextLine();
            u1.findWinner(team);
            u1.mainMenu();
            choice = scan.nextInt();
         }// end else if

               
         else if(choice == 4) {
            scan.nextLine();// consumes the empty space character left in the input stream.
            System.out.println(" Enter the team you are looking into: ");
            team = scan.nextLine();
            u1.findYears(team);
            u1.mainMenu();
         }// end else if

               
         else if(choice == 5) {
            System.out.println("Enter the year: ");
            year = scan.nextInt();
            u1.winner(year);
            u1.mainMenu();
            choice = scan.nextInt();
         }// end if

         else if(choice == 6) {
            System.out.println("GOODBYE!");
            break;
         }
         
         else{
            System.out.println("Your choice was not one of the given options. Please, try again.");
            u1.mainMenu();
            choice = scan.nextInt();
         }
         
      }// end while

   scan.close();   
         
   }//end main
      
}// end class 
