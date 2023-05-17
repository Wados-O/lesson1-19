package lesson10;

import java.util.Scanner;

public class Ex11 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i = 0;
    int n = 1;
    int sum = 0;
    while (n <= 1000) {
      sum = sum + n;
      n++;
    }
    int sum2 = 0;
    while (i <= 999) {
      int currentNumber = scanner.nextInt();
      sum2 = sum2 + currentNumber;
      i++;
    }
    System.out.println(sum - sum2);
  }

}
