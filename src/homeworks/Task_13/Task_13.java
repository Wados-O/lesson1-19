package homeworks.Task_13;

import java.util.Scanner;

public class Task_13 {

  public static void mathPow() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите число М: ");
    int m = sc.nextInt();
    System.out.println("Введите число N");
    int n = sc.nextInt();
    int result = 1;
    for (int i = 0; i < n; i++) {
      result *= m;
    }
    System.out.println("Результат: " + result);
  }

  public static void arithmeticMean() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите число М: ");
    int m = sc.nextInt();
    System.out.println("Введите число N");
    int n = sc.nextInt();
    int sum = n + m;
    sum = sum / 2;
    System.out.println(sum);
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean play = true;

    while (play) {
      System.out.println("1. Получить степень числа");
      System.out.println("2. Получить среднее арифметическое");
      System.out.println("0. Завершить работу");

      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          System.out.println("1. Получить степень числа");
          mathPow();
          break;

        case 2:
          System.out.println("2. Получить среднее арифметическое");
          arithmeticMean();
          break;

        case 0:
          System.out.println("0. Завершить работу");
          return;
      }

    }
    scanner.close();
  }
}

