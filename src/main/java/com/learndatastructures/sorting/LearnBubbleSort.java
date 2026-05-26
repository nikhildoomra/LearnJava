package com.learndatastructures.sorting;

public class LearnBubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void bubbleSort(int[] arr) {
        /**
            Bubble sort is a simple sorting algorithm that repeatedly steps through the list, 
            compares adjacent elements and swaps them if they are in the wrong order. 
            The pass through the list is repeated until the list is sorted. 
            The algorithm gets its name from the way smaller elements "bubble" to the top of the list.
        */
       for(int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;    
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
}
