## Description
The **Shape Calculator** is a Java-based program that allows users to calculate the area, perimeter, and volume (where applicable) of various geometric shapes. The program is designed using **Object-Oriented Programming (OOP) principles** to ensure modularity and scalability. It provides a **menu-driven interface** for ease of use and follows structured coding guidelines.

## Features
- Supports the following shapes:
  - **Circle**
  - **Rectangle**
  - **Square**
  - **Sphere**
  - **Cylinder**
  - **Equilateral Pyramid (Square Base)**
- Implements an **abstract class (`Shape`)** to define common properties and methods for all shapes.
- Provides an **interactive menu** for user input.
- Computes **area, perimeter, and volume** (where applicable).
- Uses **separate Java files** for each class to maintain modularity and clarity.
- Follows **clean coding practices** with proper comments and structured logic.

## Installation & Execution
### Prerequisites
Ensure you have **Java Development Kit (JDK)** installed on your system.

### Steps to Run the Program
1. **Clone the Repository** or download the source files.
2. **Open the terminal or command prompt** in the project directory.
3. **Compile all Java files** using:
   ```sh
   javac *.java
   ```
4. **Run the program** using:
   ```sh
   java Main
   ```
5. **Follow the on-screen instructions** to select a shape and provide necessary inputs.

## Files & Classes
The project is structured into multiple Java files, each representing a specific class:

- **`Main.java`** - Contains the `main` method and handles user interaction via a menu-driven approach.
- **`Shape.java`** - Abstract class defining the blueprint for all shapes, including common methods.
- **`Circle.java`** - Implements `Shape` for Circle calculations.
- **`Rectangle.java`** - Implements `Shape` for Rectangle calculations.
- **`Square.java`** - Implements `Shape` for Square calculations.
- **`Sphere.java`** - Implements `Shape` for Sphere calculations.
- **`Cylinder.java`** - Implements `Shape` for Cylinder calculations.
- **`EquilateralPyramid.java`** - Implements `Shape` for Equilateral Pyramid calculations.

## Example Output
```
Select a shape to calculate area, perimeter, and volume (if applicable):
1. Circle
2. Rectangle
3. Square
4. Sphere
5. Cylinder
6. Equilateral Pyramid
7. Exit
Enter your choice: 1
Enter the radius of the circle: 5
Area: 78.54
Perimeter: 31.42
Volume: 0.0
```

## License
This project is licensed under the **MIT License** – allowing modification, distribution, and private use. 
