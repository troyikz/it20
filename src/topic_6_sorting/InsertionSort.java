package topic_6_sorting;

import java.util.Scanner;

public class InsertionSort {

    // Insertion sort method
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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

        // Sort the array using Insertion Sort
        insertionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);  // Print sorted array
    }
}
