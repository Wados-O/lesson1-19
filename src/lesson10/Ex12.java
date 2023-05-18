package lesson10;

import java.util.Scanner;

public class Ex12 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();

    for (int startA = 1; startA <= A; startA++) {
      for (int startB = 1; startB <= B; startB++) {
        for (int startC = 1; startC <= C; startC++) {
          System.out.println(startA + " _ " + startB + " _ " + startC);
        }
      }
    }
  }
}
