public class SquareRoot {
    // Calculate square root with exception for negative input
    public static void perform(double a) {
        try {
            if (a < 0) throw new ArithmeticException("Cannot find square root of negative number");
            System.out.println("Result: " + Math.sqrt(a));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
