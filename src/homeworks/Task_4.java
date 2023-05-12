package homeworks;
//Считать с консоли - имя, фамилию, возраст, рост. Вывести сообщение в формате:
//    Привет! Меня зовут Марсель Сидиков, мне 29, мой рост - 1.85, мое случайное число - 23


import java.util.Random;
import java.util.Scanner;

public class Task_4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Как тебя зовут");
    String name = sc.nextLine();
    System.out.println("Красивое имя " + name);
    System.out.println("Сколько тебе лет ?");
    int age = sc.nextInt();
    System.out.println("Мне бы твой эти года !!!)))");
    System.out.println(" Какой твой рост ?");

    int height = sc.nextInt();
    Random r = new Random();
    int a = r.nextInt(100);
    System.out.println("Отлично: " + name);
    System.out.println("Тебе: " + age );
    System.out.println("Твой рост: " + height);
    System.out.println("Твой случайный номер: " + a );
  }

}
