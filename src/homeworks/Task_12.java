package homeworks;

import java.util.Random;
import java.util.Scanner;

//Вывести 10 случайных чисел и сумму их цифр
//Диапазон чисел [1000 - 100 000] явно задается в коде
//Пример вывода:
//4321 -> 10
//1112 -> 5
//и т.д.
public class Task_12 {

  public static void main(String[] args) {
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      int sum = 0;
      int number = random.nextInt(100001) + 1000;
      int randomNumber = number;
      int lastDigit;
      while (number > 0) {
        lastDigit = number % 10;
        sum = sum + lastDigit;
        number = number / 10;

      }
      System.out.println(randomNumber + " -> " + sum);
    }
  }
}
