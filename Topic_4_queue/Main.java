package topic_4_queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an action: 1 - Enqueue, 2 - Dequeue, 3 - Display Queue, 4 - Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1: // Enqueue
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    Customer customer = new Customer(name);
                    queue.enqueue(customer);
                    break;
                case 2: // Dequeue
                    queue.dequeue();
                    break;
                case 3: // Display Queue
                    queue.displayQueue();
                    break;
                case 4: // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}