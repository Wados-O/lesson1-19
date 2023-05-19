package homeworks.Task_13;

import java.util.Scanner;

public class Task_13 {


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
          System.out.println("Введите число М:");
          int M = scanner.nextInt();
          System.out.println("Введите число N:");
          int N = scanner.nextInt();
          int result = 1;
          for (int i = 0; i < N; i++) {
            result = result * M;
          }
          System.out.println("Результат:" + result);
          break;
        case 2:
          System.out.println("2. Получить среднее арифметическое");
          System.out.println("Введите число N:");
          int digitN = scanner.nextInt();
          System.out.println("Ведите N числа:");
          double sum = 0;
          for (int i = 0; i < digitN; i++) {
            double digitsN = scanner.nextDouble();
            sum += digitsN;
          }
          double resultDigits = sum / digitN;
          System.out.println("Результат:" + resultDigits);
          break;
        case 0:
          System.out.println("0. Завершить работу");
          return;
      }
    }
    scanner.close();
  }
}

