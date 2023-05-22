package lesson12;

import java.util.Scanner;

public class Main7 {
  public static void main(String[] args) {
    int[] a = {88, 58, 73, 53, 31, 68, 1, 52, 31, 73, 54, 88, -5, 8, 31};

    // 1. найдем минимальный элемент в диапазоне 0 до 14
    int min = a[0]; // предполагаем, что самый первый элемент - минимальный
    int indexOfMin = 0; // запоминаем индекс минимального
    // последовательно перебрать все элементы и сравнить их с минимальным
    for (int i = 1; i < a.length; i++) {
      // если текущий элемент меньше того, который у нас был минимальный (предыдущий)
      if (a[i] < min) {
        // запомнить текущий элемент как минимальный
        min = a[i];
        // запомнить его индекс
        indexOfMin = i;
      }
    }

    System.out.println(min);
    System.out.println(indexOfMin);
    // 2. Поменяем местами самый первый элемент с этим минимальным
    int temp = a[0];
    a[0] = a[indexOfMin];
    a[indexOfMin] = temp;
    // первый
    // второй
    // i-ый
    // j-ый
  }
}