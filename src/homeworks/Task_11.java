package homeworks;

import java.util.Scanner;

//Считать с консоли символ.
//Вывести 'English Letter', если символ - большая или маленькая буква английского алфавита
//Вывести 'Cyrillic Letter', если символ - большая или маленькая буква кириллицы
//Вывести Digit, если символ - цифра
public class Task_11 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите символ :");
    char symbol = scanner.next().charAt(0);
    if (Character.isLetter(symbol)) {
      if (Character.isUpperCase(symbol)) {
        if (symbol >= 'A' && symbol <= 'Z') {
          System.out.println(symbol + " : is English Upper");
        } else if (symbol >= 'А' && symbol <= 'Я') {
          System.out.println(symbol + " : заглавна буква русского алфавита");
        }
      } else if (Character.isLowerCase(symbol)) {
        if (symbol >= 'a' && symbol <= 'z') {
          System.out.println(symbol + " : is English Lower");
        } else if (symbol >= 'а' && symbol <= 'я') {
          System.out.println(symbol + " : прописная  буква русского алфавита");
        }
      }
    } else if (Character.isDigit(symbol)) {
      System.out.println(symbol + " : Является цифрой  ");
    }
  }
}
