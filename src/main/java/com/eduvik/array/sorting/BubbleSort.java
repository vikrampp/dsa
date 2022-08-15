package com.eduvik.array.sorting;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    int[] arr = {7, 2, 8, 4, 3, 6, 1, 9};
    bubbleSort(arr);
    System.out.println("sortedArr=" + Arrays.toString(arr));
  }

  public static void bubbleSort(int[] arr) {
    int n = arr.length;
    boolean flipped = false;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          // swap
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;

          flipped = true;
        }
      }
      if (!flipped) {
        break;
      }
    }
  }
}
