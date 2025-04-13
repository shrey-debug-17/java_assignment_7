public class Division {
    // Perform division and handle divide-by-zero
    public static void perform(double a, double b) {
        try {
            if (b == 0) throw new ArithmeticException("Cannot divide by zero");
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}