package com.eduvik.array.sorting;

import java.util.Arrays;

public class QuickSort {

  public static void main(String[] args) {
    int[] arr = {7, 2, 8, 4, 3, 6, 1, 9};
    quickSort(arr);
    System.out.println("sortedArr=" + Arrays.toString(arr));
  }

  public static void quickSort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
  }

  private static void quickSort(int[] arr, int left, int right) {
    if (left >= right)
      return;

    int piv = partition(arr, left, right);
    quickSort(arr, left, piv - 1);
    quickSort(arr, piv + 1, right);
  }

  private static int partition(int[] arr, int left, int right) {
    int piv = arr[right];
    int m = left - 1;
    while (left < right) {
      if (arr[left] < piv) {
        m++;
        int temp = arr[left];
        arr[left] = arr[m];
        arr[m] = temp;
      }
      left++;
    }
    m++;
    int temp = arr[right];
    arr[right] = arr[m];
    arr[m] = temp;
    return m;
  }
}
