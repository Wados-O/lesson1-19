package lesson7.Homework;

import java.util.Random;
import java.util.Scanner;

//Компьютер загадал число от 0 до 50
//Человеку нужно его угадать за 5 попыток
//При этом, компьютер подсказывает, больше загадонное число или меньше.
//Если число было угадано, программа выводит сообщение Win! и останавливает свою работу.
public class Task_10_STAR {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    int num = r.nextInt(50);
    System.out.println(num);

    System.out.println(" ===Угадай число загаданное ботом=== ");
    for (int i = 0; i < 5; i++) {

      int ans = sc.nextInt();
      if (ans == num) {
        System.out.println("Вы победили и угадали число");
      } else if (ans > num) {
        System.out.println("Слишком много");
      } else if (ans < num) {
        System.out.println("Слишком мало");

      }
    }
  }
}
