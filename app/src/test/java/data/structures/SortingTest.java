package data.structures;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {

  @Test
  void testSortByInsertion() {
    Integer[] a = {5, 4, 9, 10, 0, 21, 45, -1};
    Sorting.sortByInsertion(a);
    assertArrayEquals(new Integer[]{-1, 0, 4, 5, 9, 10, 21, 45}, a);
  }

  @Test
  void testSortByInsertion1() {
    Integer[] a = {5, 4, 9, 10, 0, 21, 45, -1};
    Sorting.sortByMergtion(Arrays.stream((Integer[])a).collect(Collectors.toList()));

    List<Integer> b = new LinkedList();
    b.add(1);
    //Sorting.sortByInsertion2(b);
  }
}