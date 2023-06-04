package lesson16;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_13_v2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] array = new String[10];
    int count = 0;
    while (true) {
      System.out.println("1. Добавить слово");
      System.out.println("2. Удалить слово");
      System.out.println("3. Вывести слово под индексом");
      System.out.println("4. Удалить только первое вхождение слова");
      int command = scanner.nextInt();
      scanner.nextLine();
      if (command == 1) {
        System.out.println("Будем добавлять слово!");
        String line = scanner.nextLine();
        array[count] = line;
        count++;
      } else if (command == 2) {
        System.out.println("Будем удалять слово (все вхождения)");
        String line = scanner.nextLine();
        for (int i = 0; i < count; i++) {
          if (array[i].equals(line)) {
            for (int j = i; j < count - 1; j++) {
              array[j] = array[j + 1];

            }
            count--;
          }
        }

      } else if (command == 3) {
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index >= 0 && index < count) {
          System.out.println(array[index]);

        } else {
          System.out.println("Нет такого элемента! ");
        }
      } else if (command == 4) {
        System.out.println("Будем удалять слово (первое вхождения)");
        String line = scanner.nextLine();

        for (int i = 0; i < count; i++) {
          if (array[i].equals(line)) {
            for (int j = i; j < count - 1; j++) {
              array[j] = array[j - 1];
            }
            count--;
            break;
          }

        }

      }else {
        System.out.println("С"
            + "Команда не распознана ");
      }
      System.out.println("Список элементов ");
      for (int i = 0; i < count; i++) {
        System.out.println(array[i] + " ");
      }
      System.out.println();
      System.out.println("Фактический массив :" + Arrays.toString(array));


    }
  }

}
