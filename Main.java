package topic_2_linkedlist_string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        
        // Adding elements to the list through user input
        System.out.println("Enter clothing brands (type 'exit' to stop):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            list.add(input);
        }

        System.out.println("\nCurrent Linked List:");
        System.out.println("------------------------------");
        list.printList();

        // Delete an item by user input
        System.out.println("\nEnter the clothing brands to delete:");
        String deleteInput = scanner.nextLine();
        list.deleteByValue(deleteInput);
        System.out.println("Deleting |" + deleteInput + "| from the list...\n");

        System.out.println("Current Linked List:");
        System.out.println("------------------------------");
        list.printList();

        // Move/Swap Pointer
        System.out.println("\nEnter the index of the node to move:");
        int fromIndex = scanner.nextInt();
        System.out.println("Enter the target index:");
        int toIndex = scanner.nextInt();

        list.moveNodePointer(toIndex, fromIndex);
        System.out.println("\nCurrent Linked List:");
        System.out.println("------------------------------");
        list.printList();

        // Close the scanner
        scanner.close();
    }
}
