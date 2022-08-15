package com.eduvik.array.sorting;

import java.util.Arrays;

public class CountingSort {

  public static void main(String[] args) {
    int[] arr = {7, 2, 8, 4, 3, 6, 1, 9};
    countingSort(arr);
    System.out.println("sortedArr=" + Arrays.toString(arr));
  }

  public static void countingSort(int[] arr) {
    int[] output = new int[arr.length];

    int max = arr[0];
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    int offset = min < 0 ? min : 0;
    int range = max - offset + 1;

    int[] count = new int[range];
    for (int i = 0; i < arr.length; i++) {
      count[arr[i] - offset]++;
    }

    for (int i = 1; i < count.length; i++) {
      count[i] += count[i - 1];
    }

    for (int i = 0; i < arr.length; i++) {
      output[count[arr[i] - offset] - 1] = arr[i];
      count[arr[i] - offset]--;
    }

    for (int i = 0; i < arr.length; i++) {
      arr[i] = output[i];
    }
  }
}
