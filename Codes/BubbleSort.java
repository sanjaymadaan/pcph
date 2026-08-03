package com.company.sorting;

/*
 * Program: Bubble Sort Demonstration
 * 
 * Bubble Sort repeatedly compares two adjacent elements
 * and swaps them if they are in the wrong order.
 * 
 * Time Complexity:
 * Best Case    : O(n)
 * Average Case : O(n²)
 * Worst Case   : O(n²)
 */

public class BubbleSort {

    /*
     * Method to display array elements
     */
    public static void displayArray(int[] array) {

        System.out.print("\nArray Elements : ");

        for (int element : array) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    /*
     * Method to perform Bubble Sort
     */
    public static void bubbleSort(int[] array) {

        System.out.println("Bubble Sort Started...\n");

        // Number of passes
        for (int passNumber = 0; passNumber < array.length - 1; passNumber++) {

            System.out.println("Pass " + (passNumber + 1));

            // Compare adjacent elements
            for (int currentIndex = 0;
                    currentIndex < array.length - 1 - passNumber;
                    currentIndex++) {

                int nextIndex = currentIndex + 1;

                System.out.println("Comparing "
                        + array[currentIndex]
                        + " and "
                        + array[nextIndex]);

                // Swap if left element is greater
                if (array[currentIndex] > array[nextIndex]) {

                    System.out.println("Swapping "
                            + array[currentIndex]
                            + " and "
                            + array[nextIndex]);

                    int temporaryValue = array[currentIndex];
                    array[currentIndex] = array[nextIndex];
                    array[nextIndex] = temporaryValue;
                }
            }

            // Display array after each pass
            displayArray(array);

            System.out.println("------------------------------------");
        }

        System.out.println("\nBubble Sort Completed.");
    }

    public static void main(String[] args) {

        int[] numbers = {78, 23, 67, 99, 34, 121, 56, 8, 55, 22};

        System.out.println("Original Array");
        displayArray(numbers);

        bubbleSort(numbers);

        System.out.println("\nSorted Array");
        displayArray(numbers);
    }
}