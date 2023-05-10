package lesson5;

import java.util.Scanner;

public class Task_8 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int copy = number;
    int digit0, digit1, digit2, digit3, digit4, digit5;

    digit5 = number % 2;
    number = number / 2;

    digit4 = number % 2;
    number = number / 2;

    digit3 = number % 2;
    number = number / 2;

    digit2 = number % 2;
    number = number / 2;

    digit1 = number % 2;
    number = number / 2;

    digit0 = number % 2;
    number = number / 2;

    System.out.println(
        digit0 + " " + digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
    System.out.println("Проверка " + Integer.toBinaryString(copy));

  }

}
