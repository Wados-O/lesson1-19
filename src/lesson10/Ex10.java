package lesson10;

import java.util.Scanner;

public class Ex10 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();

    int startA = 1;
    int startB = 1;
    int startC = 1;
    while (startA <= A) {
      while (startB <= B) {
        while (startC <= C) {
          System.out.println(startA + " _ " + startB + " _ " + startC);
          startC++;
        }
        startC = 1;
        startB++;
      }
      startB = 1;
      startA++;
    }

  }
}


