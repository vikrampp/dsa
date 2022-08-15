package com.eduvik.array.sorting;

import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = {7, 2, 8, 4, 3, 6, 1, 9};
    selectionSort(arr);
    System.out.println("sortedArr=" + Arrays.toString(arr));
  }

  public static void selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int min = i;
      for (int j = i; j < n; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }
  }
}
