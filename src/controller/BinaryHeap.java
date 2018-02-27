package controller;

import java.util.Arrays;

/**
 * Binary heap with contains function
 * 
 * @author Jacek Zarski
 */


public class BinaryHeap<T extends Comparable<T>> {
  private static final int DEFAULT_CAPACITY = 10;
  protected T[] array;
  protected int size;

  @SuppressWarnings("unchecked")
  public BinaryHeap() {
    // Java doesn't allow construction of arrays of placeholder data types
    array = (T[]) new Comparable[DEFAULT_CAPACITY];
    size = 0;
  }

  public void add(T value) {
    if (size >= array.length - 1) {
      array = this.resize();
    }
    size++;
    int index = size;
    array[index] = value;
    bubbleUp();
  }

  public boolean contains(T element) {
    int index = 0;
    int lIndex, rIndex;
    if (isEmpty())
      return false;
    while (index < size) {
      if (array[index] == null) {
        return false;
      }
      if (array[index].compareTo(element) == 0)
        return true;
      if (hasLeftChild(index) && (lIndex = leftIndex(index)) < size) {
        if (array[index].compareTo(element) < 0) {
          index = lIndex;
          continue;
        }
      }
      if (hasRightChild(index) && (rIndex = rightIndex(index)) < size) {
        if (array[index].compareTo(element) > 0) {
          index = rIndex;
          continue;
        }
      }
      return false;
    }
    return false;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public T peek() {
    if (this.isEmpty()) {
      throw new IllegalStateException();
    }

    return array[1];
  }

  public T remove() {
    // what do want return?
    T result = peek();

    // get rid of the last leaf/decrement
    array[1] = array[size];
    array[size] = null;
    size--;

    bubbleDown();

    return result;
  }

  public String toString() {
    return Arrays.toString(array);
  }

  protected void bubbleDown() {
    int index = 1;

    while (hasLeftChild(index)) {
      int smallerChild = leftIndex(index);

      if (hasRightChild(index) && array[leftIndex(index)].compareTo(array[rightIndex(index)]) > 0) {
        smallerChild = rightIndex(index);
      }

      if (array[index].compareTo(array[smallerChild]) > 0) {
        swap(index, smallerChild);
      } else {
        break;
      }

      index = smallerChild;
    }
  }

  protected void bubbleUp() {
    int index = this.size;

    while (hasParent(index) && (parent(index).compareTo(array[index]) > 0)) {
      // parent/child are out of order; swap them
      swap(index, parentIndex(index));
      index = parentIndex(index);
    }
  }


  protected boolean hasParent(int i) {
    return i > 1;
  }


  protected int leftIndex(int i) {
    return i * 2;
  }


  protected int rightIndex(int i) {
    return i * 2 + 1;
  }


  protected boolean hasLeftChild(int i) {
    return leftIndex(i) <= size;
  }


  protected boolean hasRightChild(int i) {
    return rightIndex(i) <= size;
  }


  protected T parent(int i) {
    return array[parentIndex(i)];
  }


  protected int parentIndex(int i) {
    return i / 2;
  }


  protected T[] resize() {
    return Arrays.copyOf(array, array.length * 2);
  }


  protected void swap(int index1, int index2) {
    T tmp = array[index1];
    array[index1] = array[index2];
    array[index2] = tmp;
  }
}
