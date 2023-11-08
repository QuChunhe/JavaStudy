package data.structures;

import java.lang.reflect.Array;
import java.util.Objects;

public class NodeList<E extends Comparable<E>> {
  private Node<E> header = null;
  private Node<E> tail = header;
  private int length = 0;

  public NodeList() {
  }



  public void add(E element) {
    if (null == element) {
      throw new NullPointerException("element can not be null");
    }
    Node<E> first = new Node<E>(null, element, header);
    if (null != header) {
      header.prev = first;
    }
    header =  first;
    if (null == tail) {
      tail = header;
    }
    length++;
  }

  public void sort() {
    Node<E> mark = null;
    while (header != mark) {
      Node<E> pos = header;
      while (pos.next != mark) {
        if (pos.element.compareTo(pos.next.element) > 0) {
          E tmp = pos.next.element;
          pos.next.element = pos.element;
          pos.element = tmp;
        }
        pos = pos.next;
      }
      mark = pos;
    }
  }

  public E[] toArray(Class<E> clazz) {
    if (0 == length) {
      return null;
    }
    E[] a = (E[]) Array.newInstance(clazz, length);
    int i = 0;
    for (Node<E> p = header; p != null; p = p.next, i++) {
      a[i] = p.element;
    }
    return a;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (null == obj) {
      return false;
    }
    if (obj instanceof NodeList<?>) {
      Node<E> t1 = header;
      Node<E> t2 = ((NodeList<E>) obj).header;
      while (null != t1 && null != t2) {
        if (!t1.getClass().equals(t2.getClass())
                || t1.element.compareTo(t2.element) != 0) {
          return false;
        }
        t1 = t1.next;
        t2 = t2.next;
      }
      return t1 == t2;
    }
    return false;
  }

  @Override
  public String toString() {
    if (null == header) {
      return null;
    }
    StringBuilder builder = new StringBuilder();
    builder.append("[");
    for (Node<E> pos = header; null != pos; pos = pos.next) {
      builder.append(pos.element.toString()).append(", ");
    }
    builder.delete(builder.length() - 2, builder.length());
    builder.append("]");
    return builder.toString();
  }

  static class Node<E extends Comparable<E>> {
    private E element;
    Node<E> next;
    Node<E> prev;

    public Node(Node<E> prev, E element, Node<E> next) {
      this.element = element;
      this.next = next;
      this.prev = prev;
    }

    @Override
    public boolean equals(Object o) {
      if (getClass().equals(o.getClass())) {
        return element.compareTo((E)o) == 0;
      }
      return false;
    }

    @Override
    public int hashCode() {
      return Objects.hash(element);
    }
  }
}
