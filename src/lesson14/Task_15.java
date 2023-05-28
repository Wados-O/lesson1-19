package lesson14;

import java.util.Random;

public class Task_15 {

  public static void main(String[] args) {
    Random random = new Random();
    int[] a = new int[10];
    for (int i = 0; i < a.length; i++) {
      a[i] = random.nextInt(100);
    }
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + "|");
    }
    System.out.println();
    int localMinCount = 0;
    int[] localMin = new int[a.length];
    for (int i = 1; i < a.length - 1; i++) {
      if (a[i] < a[i - 1] && a[i] < a[i + 1]) {
        localMin[localMinCount] = a[i];
        localMinCount++;
      }

    }
    System.out.println(localMinCount);
    for (int i = 0; i < localMinCount; i++) {
      System.out.print(localMin[i] + "|");
    }
  }
}
