package homeworks;

import java.util.Random;
import java.util.Scanner;

//Необходимо сгенерировать три случайных числа в диапазоне от 100 до 150
//Необходимо посчитать сумму цифр каждого числа и сохранить в отдельную переменную.
//Необходимо считать три числа с консоли (100 до 150)
//Необходимо посчитать сумму цифр каждого числа и сохранить в отдельную переменную.
//Вывести разницу между первой суммой цифр случайного числа
// и первой суммой цифр введённого числа и так далее по каждому.
public class Task7 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    int rNb = random.nextInt(401) + 100;

    int digit1 = rNb % 10;
    rNb = rNb / 10;

    int digit2 = rNb % 10;
    rNb = rNb / 10;

    int digit3 = rNb % 10;

    int randomNumberSum = digit1 + digit2 + digit3;
    int userNumber1 = sc.nextInt();

    digit1 = userNumber1 % 10;
    userNumber1 = userNumber1 / 10;

    digit2 = userNumber1 % 10;
    userNumber1 = userNumber1 / 10;

    digit3 = userNumber1 % 10;

    int userNumberSum = digit1 + digit2 + digit3;
    int result = randomNumberSum - userNumberSum;

    System.out.println("Result work of program: " + result);
  }
}
