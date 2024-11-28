package topic_6_sorting;

import java.util.Scanner;

public class MergeSort {

    // Merge sort method
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    // Merge method to combine sorted left and right arrays
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
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

        // Sort the array using Merge Sort
        mergeSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);  // Print sorted array
    }
}
