package data.structures;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class NodeListTest {

  @Test
  void testSort() {
    NodeList<Integer> list;
    list = new NodeList<>();
    list.sort();
    assertNull(list.toArray(Integer.class));
    list.add(3);
    list.sort();
    assertArrayEquals(new Integer[]{3}, list.toArray(Integer.class));
    list.add(2);
    list.sort();
    assertArrayEquals(new Integer[]{2, 3}, list.toArray(Integer.class));
    list.add(5);
    list.sort();
    assertArrayEquals(new Integer[]{2, 3, 5}, list.toArray(Integer.class));
    list.add(1);
    list.sort();
    assertArrayEquals(new Integer[]{1, 2, 3, 5}, list.toArray(Integer.class));
    list = new NodeList<>();
    list.add(10);
    list.add(2);
    list.add(7);
    list.add(9);
    list.add(10);
    list.sort();
    assertArrayEquals(new Integer[]{2, 7, 9, 10, 10}, list.toArray(Integer.class));
  }

  @Test
  void testEquals() {

    NodeList<Integer> n1 = new NodeList<>();
    NodeList<Integer> n2 = new NodeList<>();
    assertTrue(n1.equals(n2));
    assertTrue(n2.equals(n1));
    assertFalse(n1.equals(null));

    n1.add(1);
    assertFalse(n1.equals(n2));
    assertFalse(n2.equals(n1));

    n2.add(2);
    assertFalse(n1.equals(n2));
    assertFalse(n2.equals(n1));



  }
}