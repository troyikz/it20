package topic_6_sorting;

import java.util.Scanner;

public class QuickSort {

    // QuickSort method
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition method to place the pivot in the correct position
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
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

        // Sort the array using QuickSort
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);  // Print sorted array
    }
}
