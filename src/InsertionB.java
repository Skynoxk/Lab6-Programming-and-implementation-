/*
* Insert algorithm for sorting random numbers with ascending order
* Author:Meas Ratanakviphou
*/

import java.util.Random;
public class InsertionB {
  public static void sortInsert(int array[], int size) {
    for (int i = 1; i <= size - 1; i++) {
      int key = array[i];
      int j = i - 1;
      while (j >= 0 && array[j] > key) {
        array[j + 1] = array[j];
        j = j - 1;
      }
      array[j + 1] = key;
    }
  }

  public static void display(int array[]) {
    for (int x : array) {
      System.out.print(x + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    System.out.println("Welcome to sort with algorithm insert for ascending order");
    int[] array = new int[10];
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      array[i] = random.nextInt(100);
    }
    display (array);
    sortInsert(array, array.length);
    System.out.println("After sorting");
    display (array);

  }

}