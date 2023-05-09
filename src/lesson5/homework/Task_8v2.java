package lesson5.homework;

import java.util.Scanner;

//Показать пример переполнения для своих чисел
public class Task_8v2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    byte number = scanner.nextByte();
    StringBuilder binaryBuilder = new StringBuilder();

    while (number > 0) {
      binaryBuilder.insert(0, number % 2);
      number = (byte) (number / 2);
    }
    String binary = binaryBuilder.toString();
    System.out.println("Двоичное представление числа: " + binary);
    while (number>=0){
      number++;
      if (number<0){
        System.out.println(number +binary);
        break;
      }
    }

  }
}
