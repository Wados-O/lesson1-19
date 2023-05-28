package lesson13;

import java.util.Scanner;

public class Main7 {

  public static void main(String[] args) {
    int[] array = {-5, 1, 8, 30, 41, 45, 52, 53, 54, 58, 68, 73, 80, 86, 88};
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int left = 0;
    int right = array.length - 1;
    int middle = left + (right - left) / 2;

    if (number < array[middle]) {
      System.out.println("Число слева от центра - " + array[middle]);
      right = middle - 1;
      System.out.println("Новая правая граница - " + array[middle]);
      System.out.println("Старая левая - " + array[left]);
    } else if (number > array[middle]) {
      System.out.println("Число справа от центра - ");
      left = middle + 1;
      System.out.println("Новая левая граница -" + array[left]);
      System.out.println("Старая правая граница - " + array[right]);
    } else {
      System.out.println("Число по центру");
    }

  }

}
