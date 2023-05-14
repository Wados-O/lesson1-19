package consultation.two;

import java.util.Scanner;

//Считать с консоли символ.
//Вывести 'English Letter', если символ - большая или маленькая буква английского алфавита
//Вывести 'Cyrillic Letter', если символ - большая или маленькая буква кириллицы
//Вывести Digit, если символ - цифра
public class Task_11 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите символ или число :");
    char symbol = scanner.next().charAt(0);
    if (Character.isLetter(symbol)) {
      if (Character.isUpperCase(symbol)) {
        if (symbol >= 'A' && symbol <= 'Z') {
          System.out.println("Symbol is Upper English");
        } else if (symbol >= 'А' && symbol <= 'Я') {
          System.out.println("Символ заглавная буква Русского алфавита");
        }
      } else if (Character.isLowerCase(symbol)) {
        if (symbol >= 'a' && symbol <= 'z') {
          System.out.println("symbol is Lower English");
        } else if (symbol >= 'а' && symbol <= 'я') {
          System.out.println("Символ прописная буква Русского алфавита");
        }
      }
    } else if (Character.isDigit(symbol)) {
      System.out.println("Символ " + symbol + " является числом ");
    }
  }
}
