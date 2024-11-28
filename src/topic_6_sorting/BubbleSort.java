package topic_6_sorting;

import java.util.Scanner;

public class BubbleSort {

    // Bubble sort method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Method to take array input from the user
    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();  // Read number of elements

        int[] arr = new int[n];  // Create an array of size n

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();  // Read each element
        }
        
        return arr;  // Return the populated array
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Get array input from user
        int[] arr = inputArray();

        System.out.println("Original array:");
        printArray(arr);  // Print original array

        // Sort the array using Bubble Sort
        bubbleSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);  // Print sorted array
    }
}
