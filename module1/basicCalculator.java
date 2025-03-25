import java.util.Scanner;

class basicCalculator {
    public static int operation(int num1, int num2, String text) {
        switch (text.toLowerCase()) {
            case "add":
                return num1 + num2;
            case "sub":
                return num1 - num2;
            case "mul":
                return num1 * num2;
            case "div":
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero!");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operation: " + text);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scan.nextInt();
        
        scan.nextLine(); // Consume the leftover newline
        
        System.out.println("add/ sub/ mul/ div");
        String text = scan.nextLine().trim(); // Trim to remove extra whitespace
        
        try {
            int op = operation(num1, num2, text);
            System.out.println("Result: " + op);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scan.close();
    }
}