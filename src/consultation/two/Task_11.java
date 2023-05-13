package consultation.two;

import java.util.Scanner;

//Считать с консоли символ.
//Вывести 'English Letter', если символ - большая или маленькая буква английского алфавита
//Вывести 'Cyrillic Letter', если символ - большая или маленькая буква кириллицы
//Вывести Digit, если символ - цифра
public class Task_11 {
  public static void main(String[] args) {
    // Шаг 1: Определение символа для проверки

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите символ: ");
        char symbol = scanner.next().charAt(0);

        if (Character.isLetter(symbol)) {
          if ((symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z')) {
            System.out.println("English Letter");
          } else if ((symbol >= 'а' && symbol <= 'я') || (symbol >= 'А' && symbol <= 'Я')) {
            System.out.println("Cyrillic Letter");
          }
        } else if (Character.isDigit(symbol)) {
          System.out.println("Digit");
        }

        scanner.close();
      }
    }
