package homeworks;
//Считываете число (0 ...32)
//Вывести двоичное представление, не используя Integer.toBinaryString
import java.util.Scanner;

public class Task_8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    StringBuilder binaryBuilder = new StringBuilder();

    while (number > 0) {
      binaryBuilder.insert(0, number % 2);
      number = number / 2;
    }

    String binary = binaryBuilder.toString();
    System.out.println("Двоичное представление числа: " + binary);
  }
}