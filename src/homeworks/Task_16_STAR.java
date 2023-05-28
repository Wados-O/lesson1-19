package homeworks;

import java.util.Arrays;
import java.util.Scanner;

//На вход подается число wordsNumber (количество слов).
//Далее вводится wordsNumber-слов.
// Необходимо вывести слова в лексикографическом (словарном) порядке:
//4
//CDDAA
//CBA
//BA
//AB
//Вывод:
//AB
//BA
//CBA
//CDDAA
//Далее, в программу подается какое-либо слово, программа должна вывести его
// позицию в полученном словаре:
//CBA
//Вывод:
//2
//Если слова в словаре нет, вывести <Отсутствует в словаре>
public class Task_16_STAR {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    boolean isRun = true;

    int wordNumber = scanner.nextInt();

    String[] word = new String[wordNumber];
    while (isRun) {
      for (int i = 0; i < wordNumber; i++) {
        word[i] = scanner.next();
      }

      for (int i = word.length - 1; i >= 0; i--) {
        if (word[i] != null) {
          System.out.println(word[i]);
        }
      }

      System.out.println();
      String checkWord = scanner.next();
      String found = null;
      for (int i = 0; i < word.length; i++) {
        if (word[i] != null && word[i].equals(checkWord)) {
          found = word[i];
          System.out.println(i);

            System.out.println(found + "|");

        } else if (found == null){
          System.out.println(" not found word");

        }
      }
    }
  }
}

