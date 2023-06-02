package lesson16;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int [] a = new int[10];
    int count = 0;

    System.out.println(Arrays.toString(a));
    while (true){
      int number = scanner.nextInt();
      a[count] = number;
      count++;
      if (a.length == count){
        int newLength = a.length + a.length / 2;
        int[] newArray = new int[newLength];
        for (int i = 0; i < a.length; i++) {
          newArray[i] = a[i];

        }
        a = newArray;
        System.out.println("Массив увеличен");
      }
      for (int i = 0; i < count; i++) {
        System.out.print(a[i] + "|");
      }
      System.out.println();
    }
  }

}
