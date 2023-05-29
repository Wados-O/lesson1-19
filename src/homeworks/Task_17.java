package homeworks;

import java.util.Scanner;

//Task17
//Реализовать меню и соответствующий функционал:
//1. Добавить слово
//2. Найти слово
//3. Поиск по префиксу
//4. Поиск по суффику
//5. Удалить слово
//6. Показать словарь
//0. Выход
public class Task_17 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean isRun = true;
    while (isRun) {
      System.out.println("*******Словарик*******");
      System.out.println("1.Добавить слово");
      System.out.println("2.Найти слово");
      System.out.println("3.Поиск по префиксу");
      System.out.println("4.Поиск по суффиксу");
      System.out.println("5.Удалить слово");
      System.out.println("6.Показать словарь");
      System.out.println("0.Выход");
      int wordsCount = 0;
      String[] dictionary = new String[10];
      int chose = scanner.nextInt();
      switch (chose) {
        case 1:
          System.out.print("Введите слово: ");
          String addWord = scanner.next();

          for (int i = 0; i < dictionary.length; i++) {
            if (dictionary[i] == null) {
              dictionary[i] = addWord;
              break;
            }
          }


        break;
        case 2:

          break;
        case 3:

          break;
        case 4:

          break;
        case 5:

          break;
        case 6:
          for (int i = 0; i < dictionary.length; i++) {
            if (dictionary[i] != null) {
              System.out.println(dictionary[i] + "|");
            }
          }
          break;
        case 0:
          System.out.println("0. Завершить работу");
          return;
      }

    }
  }

}
