package com.eduvik.array.sorting;

import java.util.Arrays;

public class HeapSort {

  public static void main(String[] args) {
    int[] arr = {7, 2, 8, 4, 3, 6, 1, 9};
    heapSort(arr);
    System.out.println("sortedArr=" + Arrays.toString(arr));
  }

  public static void heapSort(int[] arr) {
    int n = arr.length;

    // Build Max-Heap
    for (int i = n / 2 - 1; i >= 0; i--) {
      heapify(arr, n, i);
    }

    for (int i = n - 1; i >= 0; i--) {
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;
      
      heapify(arr, i, 0);
    }
  }

  private static void heapify(int[] arr, int n, int i) {
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    if (left < n && arr[left] > arr[largest]) {
      largest = left;
    }
    if (right < n && arr[right] > arr[largest]) {
      largest = right;
    }
    if (i != largest) {
      int temp = arr[i];
      arr[i] = arr[largest];
      arr[largest] = temp;
      
      heapify(arr, n, largest);
    }
  }
}
