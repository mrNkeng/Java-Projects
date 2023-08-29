# World Series Champions Lookup System

## Table of Contents
1. [Project Description](#project-description)
2. [Features](#features)
3. [Technologies Used](#technologies-used)
4. [Data Structures Used](#data-structures-used)
5. [Classes and Logic](#classes-and-logic)
6. [Getting Started](#getting-started)
7. [Author](#author)

## Project Description
The World Series Champions Lookup System is designed to provide a comprehensive lookup for World Series winners from 1903 to the present day. The project reads from a text file to fetch the data and offers a menu-driven interface for querying various aspects related to the championship.

## Features
- Display all winners by descending years
- Display all winners by ascending years
- Search for the number of wins by a particular team
- Show the years a specific team has won
- Look up the champion for a particular year
- User-friendly menu-driven interface

## Technologies Used
- Java
- File I/O

## Data Structures Used
- Array: Used to hold the list of World Series winners. The array is a straightforward way to keep the list in memory for quick access.
  
## Classes and Logic

### WorldSeries Class
**Attributes:**
- `winners[]`: An array to hold the names of the teams that have won.

**Methods:**
- `mainMenu`: Displays the main menu.
- `displayWinner`: Lists all winners by descending years.
- `displayWinnersByYear`: Lists all winners by ascending years.
- `findWinner`: Searches for the number of wins by a particular team.
- `findYears`: Lists the years a particular team has won.
- `winner`: Retrieves the winner for a specific year.

### ClientDriver Class
This is the driver class containing the main method. It interacts with the `WorldSeries` class to handle user inputs and display outputs.

## Getting Started
1. Clone the repository.
2. Open the project in your favorite IDE.
3. Run the `ClientDriver` class to start the program.

## Author
[Aminkeng Nkeng]

