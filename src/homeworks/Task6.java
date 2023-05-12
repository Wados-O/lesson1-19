package homeworks;

import java.util.Scanner;

//По аналогии с Main3 вывести сумму цифр пятизначного числа.
public class Task6 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // считали число
    int number = scanner.nextInt();
    int digit5 = number% 10;
    number = number /10;

    int digit4 = number% 10;
    number = number /10;

    int digit3 = number % 10; // 5

    number = number / 10; // 12


    int digit2 = number % 10; // 2

    number = number / 10; // 1


    int digit1 = number % 10; // 1

    int digitsSum = digit1 + digit2 + digit3 + digit4 + digit5;

    System.out.println("Сумма цифр: " + digitsSum);
  }
}
