package lesson7;

import java.util.Scanner;

public class Main3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    if (number % 2 == 0) {

      if (number % 10 == 2) {
        number = number / 2;
        System.out.println(number);
      } else if (number % 10 == 0) {
        number = number / 10;
        System.out.println(number);
      }
    }
  }
}
