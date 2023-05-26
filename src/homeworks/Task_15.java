package homeworks;

import java.util.Arrays;
import java.util.Random;

//Сгенерировать случайный масссив размености 10.
//Вывести данный массив в консоль.
//Для данного массива вывести количество локальных минимумов.
//Локальным минимумом называется число, для которого выполняется условие:
//левый сосед > элемент < правый сосед
//Например, для массива 4, 5, 2, 10, 15, 14, 20 локальныйми минимумами будут числа:
//4, 2, 14
//Следовательно, для данного массива программа должна вывести число 3.
public class Task_15 {

  int count;

  public static void main(String[] args) {

    int[] array = {6, 4, 5, 2, 10, 15, 14, 20};
    int localMin = 0;
    int count = 0;
    for (int i = 1; i < array.length - 1; i++) {
      if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
        count++;
      }
    }
    System.out.println(count);
  }
}




