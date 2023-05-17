package homeworks;

import java.util.Scanner;

//На вход подается три числа. Необходимо вывести максимальное из-них.
//10, 5, 6
//вывод: 10
//10, 10, 6
//вывод: 10
public class Task_10 {

  public static void main(String[] args) {
    System.out.println("Введите три числа до 50: ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (a > b && c < a) {
      System.out.println(a);
    } else if (b > c && a < b) {
      System.out.println(b);
    } else if (c > a && b < c) {
      System.out.println(c);
    }
  }
}
