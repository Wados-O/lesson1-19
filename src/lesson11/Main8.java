package lesson11;

import java.util.Scanner;

public class Main8 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + "|");
    }
    System.out.println();
    for (int i = 0; i < a.length / 2; i++) {
      int temp = a[i];
       a[i] = a[a.length - 1 -i];
      a[a.length - 1 -i] = temp;
    }
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + "|");
    }
  }
}
