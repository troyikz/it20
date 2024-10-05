package topic_2_linkedlist_int;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner wow = new Scanner(System.in);
		
		// Create a new LinkedList object
		LinkedList list = new LinkedList();

        // Ask the user to enter 5 numbers to add to the list
        System.out.println("Enter 5 numbers to add to the list: ");
        int number1 = wow.nextInt();
        int number2 = wow.nextInt();
        int number3 = wow.nextInt();
        int number4 = wow.nextInt();
        int number5 = wow.nextInt();
              
        // Add the numbers entered by the user to the LinkedList
        list.add(number1);
        list.add(number2);
        list.add(number3);
        list.add(number4);
        list.add(number5);     
        
        // Print the current LinkedList to show what it looks like
        System.out.println("Current Linked List: ");
        list.printList();
                
        
        // Ask the user to enter a number to delete from the list
        System.out.println();
        System.out.println("Enter the number you want to delete: ");
        int number6 = wow.nextInt();
        
        // Delete the number entered by the user from the LinkedList
        System.out.println("Deleting the number from the list...");
        System.out.println("Current Linked List after deletion:");
        list.deleteByValue(number6); // Remove the number
        list.printList(); // Print the updated list
        
        // Ask the user to move or swap two numbers
        System.out.println();
        System.out.println("Moving/Swapping nodes in the list...");
        System.out.println("Enter the first number you want to move/swap: ");
        int number7 = wow.nextInt(); // First number to move or swap
        System.out.println("Enter the second number you want to move/swap: ");
        int number8 = wow.nextInt(); // Second number to move or swap
        
        // Swap the two numbers in the list
        list.moveNodePointer(number7, number8); // Move/swaps the nodes
        System.out.println("Current Linked List after swapping:");
        list.printList(); // Print the updated list after swapping
	}
}
