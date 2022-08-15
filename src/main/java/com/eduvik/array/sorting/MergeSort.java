package com.eduvik.array.sorting;

import java.util.Arrays;

public class MergeSort {

  public static void main(String[] args) {
    int[] arr = {7, 2, 8, 4, 3, 6, 1, 9};
    mergeSort(arr);
    System.out.println("sortedArr=" + Arrays.toString(arr));
  }

  public static void mergeSort(int[] arr) {
    mergeSort(arr, new int[arr.length], 0, arr.length - 1);
  }

  private static void mergeSort(int[] arr, int[] temp, int left, int right) {
    if (left >= right)
      return;
    int mid = left + (right - left) / 2;
    mergeSort(arr, temp, left, mid);
    mergeSort(arr, temp, mid + 1, right);
    mergeHalves(arr, temp, left, right);
  }

  private static void mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd) {
    int leftEnd = leftStart + (rightEnd - leftStart) / 2;
    int rightStart = leftEnd + 1;
    int size = rightEnd - leftStart + 1;

    int left = leftStart;
    int right = rightStart;
    int index = left;
    while (left <= leftEnd && right <= rightEnd) {
      if (arr[left] < arr[right]) {
        temp[index++] = arr[left++];
      } else {
        temp[index++] = arr[right++];
      }
    }
    while (left <= leftEnd) {
      temp[index++] = arr[left++];
    }
    while (right <= rightEnd) {
      temp[index++] = arr[right++];
    }

    int i = 0;
    index = leftStart;
    while (i < size) {
      arr[index] = temp[index];
      index++;
      i++;
    }
  }
}
