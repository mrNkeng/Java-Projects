# Animal Shelter Management System

## Table of Contents

1. [Project Description](#project-description)
2. [Features](#features)
3. [Technologies Used](#technologies-used)
4. [Data Structures Used](#data-structures-used)
5. [Classes and Logic](#classes-and-logic)
6. [Getting Started](#getting-started)
7. [Author](#author)

---

## Project Description

The Animal Shelter Management System is designed to streamline the operations of animal shelters. It keeps track of animals, adoption statuses, and other relevant information. 

---

## Features

- Add new animals to the shelter
- Display list of all animals
- Adopt animals out of the shelter
- View animals available for adoption
- View animals that have been adopted
- Search for animals by type
- Re-accept animals into the shelter

---

## Technologies Used

- Java

---

## Data Structures Used

- **ArrayList**: Used for managing a dynamic list of `Animal` objects. This data structure is part of Java's standard library and allows for efficient addition and removal of elements.

---

## Classes and Logic

### Animal Class
- **Attributes**: `name`, `description`, `age`
- **Methods**: `equals`, `toString`

### Subclasses: Cat, Dog, Reptile
- **Additional Attributes**:
  - `Cat`: `breed`, `sex`
  - `Dog`: `breed`, `sex`
  - `Reptile`: `type`
- **Methods**: `equals`, `toString`

### Shelter Class
- **Methods**:
  - `allAnimals`: Displays all animals
  - `available`: Displays available animals
  - `adopted`: Displays adopted animals
  - `allType`: Displays animals of a specific type
  - `adopt`: Changes an animal's status to adopted
  - `accept`: Accepts an animal into or back into the shelter
  
### animalDriver Class
- A driver class to demonstrate the functionalities of the Animal Shelter Management System.

---

## Getting Started

1. Clone the repository
2. Open the project in your favorite IDE
3. Run the `animalDriver` class to start the program

---

## Author

[Aminkeng Nkeng]

