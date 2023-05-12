package homeworks;

import java.util.Random;

//  Сгенерировать случайное число в диапазоне от 0 до 99. Вывести его в консоль, и вывести сообщение:
//      Число <сгенерированное число> является четным - <true, false>
//    Пример для числа 5:
//    Число 53 является четным - false
public class Task5 {

  public static void main(String[] args) {
    Random r = new Random();
    int a = r.nextInt(100);
    int mod = (a % 2);
    System.out.println(a);
    boolean result  = (mod ==0);
    System.out.println(result);
  }

}
