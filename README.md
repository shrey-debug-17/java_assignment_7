Java Calculator Application

This is a console-based calculator application developed in Java. It supports basic arithmetic operations along with a few advanced mathematical functions. Each operation is implemented in a separate file, ensuring a modular and maintainable code structure. The application also demonstrates proper use of Java's inbuilt exception handling to ensure robust and error-free execution.

Features

- Addition of two numbers

- Subtraction of two numbers

- Multiplication of two numbers

- Division with divide-by-zero exception handling

- Square of a number

- Cube of a number

- Square root with negative input exception handling

- Menu-driven user interface

- Modular code structure (each operation in a separate file)

- Clean and well-commented code following Java coding standards

File Structure

Java-Calculator/

Addition.java         // Contains addition logic

Subtraction.java      // Contains subtraction logic

Multiplication.java   // Contains multiplication logic

Division.java         // Handles division and divide-by-zero cases

Square.java           // Calculates square of a number

Cube.java             // Calculates cube of a number

SquareRoot.java       // Handles square root logic and exceptions

Main.java             // Main file with menu and input handling

README.md             // Project documentation

How to Run

Compile all Java files:

javac *.java

Run the program:

Main.java

Exception Handling

| Operation      | Exception Used           | Description                                       |
|----------------|--------------------------|---------------------------------------------------|
| Division       | `ArithmeticException`    | Handles divide-by-zero errors                    |
| Square Root    | `ArithmeticException`    | Handles square root of negative number           |
| Input Handling | `InputMismatchException` | Ensures valid numerical input from the user      |


Author

Name: Shrey Ardeshana
PRN: 23070126019Batch: 
AIML A1

GitHub Repository

GitHub Repository Link

(https://github.com/shrey-debug-17/java_assignment_7)

License

This project is open for use and modification for educational purposes under the MIT License.
