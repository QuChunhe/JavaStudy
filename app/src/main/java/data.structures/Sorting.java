package data.structures;


import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Sorting {


  public static <T extends Comparable<T>> void sortByInsertion(T[] a) {
    for (int i = 1; i < a.length; i++) {
      for (int j = i; j > 0 && a[j].compareTo(a[j-1]) < 0; j--) {
        T t = a[j];
        a[j] = a[j - 1];
        a[j - 1] = t;
      }
    }
  }

  public static void sortByMerge(Comparable[] a) {

  }

  static void sortByMerge0(Comparable[] a, int start, int end) {
    if (start >= end) {
      return;
    }
    if (start + 1 == end) {
      if (a[end].compareTo(a[start]) < 0) {
        swap(a, start, end);
      }
      return;
    }

    int mid = (start + end) / 2;
    sortByMerge0(a, start, mid);
    sortByMerge0(a, mid + 1, end);
    for (int i = start, j = mid + 1; i <= mid && j <= end;) {
      if (a[i].compareTo(a[j]) > 0) {
        Comparable t = a[i];
        a[i] = a[j];
        for (int k = j + 1; k <= end; k++) {
          
        }
      }
      i++;
    }
  }

  static void swap(Comparable[] a, int i, int j) {
    Comparable t = a[i];
    a[i] = a[j];
    a[j] = a[i];
  }
}