package lesson14;

import java.util.Scanner;

public class Task_13_v2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("1.Получить степень числа ");
      System.out.println("2.Получить среднее арифметическое");
      System.out.println("0.Завершить работу");

      int command = scanner.nextInt();
      if (command == 1) {
        int number = scanner.nextInt();
        int pow = scanner.nextInt();
        System.out.println("Результат работы ");
      } else if (command == 2) {
        int numbersCount = scanner.nextInt();
        double numberSum = 0;
        for (int i = 0; i < numbersCount; i++) {
          int currentNumber = scanner.nextInt();
          numberSum = numberSum + currentNumber;
        }
        double average = numberSum / numbersCount;
        System.out.println(average);
      }
      if (command == 0) {
        break;
      }else {
        System.out.println("Команда не распознана");
      }
    }
  }

}
