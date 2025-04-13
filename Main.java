/* 
Name: Shrey Ardeshana
PRN: 23070126019
Batch: AIML A1
*/

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double a, b;

        while (true) {
            System.out.println("\n---- Calculator Menu ----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter two numbers: ");
                        a = scanner.nextDouble();
                        b = scanner.nextDouble();
                        Addition.perform(a, b);
                        break;
                    case 2:
                        System.out.print("Enter two numbers: ");
                        a = scanner.nextDouble();
                        b = scanner.nextDouble();
                        Subtraction.perform(a, b);
                        break;
                    case 3:
                        System.out.print("Enter two numbers: ");
                        a = scanner.nextDouble();
                        b = scanner.nextDouble();
                        Multiplication.perform(a, b);
                        break;
                    case 4:
                        System.out.print("Enter two numbers: ");
                        a = scanner.nextDouble();
                        b = scanner.nextDouble();
                        Division.perform(a, b);
                        break;
                    case 5:
                        System.out.print("Enter a number: ");
                        a = scanner.nextDouble();
                        Square.perform(a);
                        break;
                    case 6:
                        System.out.print("Enter a number: ");
                        a = scanner.nextDouble();
                        Cube.perform(a);
                        break;
                    case 7:
                        System.out.print("Enter a number: ");
                        a = scanner.nextDouble();
                        SquareRoot.perform(a);
                        break;
                    case 8:
                        System.out.println("Exiting Calculator. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter valid numeric values.");
                scanner.next(); // Clear invalid input
            }
        }
    }
}
