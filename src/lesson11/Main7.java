package lesson11;

import java.util.Scanner;

public class Main7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size;
    size = sc.nextInt();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }


    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + "|");
    }
    System.out.println();
    for (int i = a.length -1; i >=0 ; i--) {
      System.out.print(a[i] + "|");
    }
  }
}
