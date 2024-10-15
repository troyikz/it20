
package topic_3_stack_calculator;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack_Calculator stack = new Stack_Calculator(5);
        
        int choice, value;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Push (Enter value from 0-9)");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Size");
            System.out.println("5. Addition");
            System.out.println("6. Subtraction");
            System.out.println("7. Multiplication");
            System.out.println("8. Division");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push (0-9): ");
                    value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    value = stack.pop();
                    if (value != -1) {
                        System.out.println("Popped element: " + value);
                    }
                    break;
                case 3:
                    value = stack.peek();
                    if (value != -1) {
                        System.out.println("Top element is: " + value);
                    }
                    break;
                case 4:
                    System.out.println("Stack size is: " + stack.size());
                    break;
                case 5:
                    System.out.println("Result of addition: " + stack.performOperation("addition"));
                    break;
                case 6:
                    System.out.println("Result of subtraction: " + stack.performOperation("subtraction"));
                    break;
                case 7:
                    System.out.println("Result of multiplication: " + stack.performOperation("multiplication"));
                    break;
                case 8:
                    System.out.println("Result of division: " + stack.performOperation("division"));
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);

        scanner.close();
    }
}