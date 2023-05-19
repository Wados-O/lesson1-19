package homeworks;

import java.util.Arrays;
import java.util.Random;

//Явно проинициализировать массив из 10-ти элементов, таким образом,
// чтобы в нем был только один максимальный и один минимальный элемент.
//Поменять местами максимальный и минимальные элементы.
//Вывести полученный массив в консоль.
public class Task_14 {

  public static void main(String[] args) {
    Random rd = new Random();

    int[] box = new int[10];
    for (int i = 0; i < box.length; i++) {
      box[i] = rd.nextInt(100);
    }
    for (int i = 0; i < box.length; i++) {
      System.out.print(box[i] + "|");
    }
    int minDigit = box[0];
    int maxDigit = box[0];
    for (int i = 1; i < box.length; i++) {
      if (box[i] < minDigit) {
        minDigit = box[i];
      }
      if (box[i] > maxDigit) {
        maxDigit = box[i];
      }
    }
    System.out.println();
    System.out.println("Минимальное число массива |" + minDigit);
    System.out.println("Максимальное число массива |" + maxDigit);

    int temp = box[minDigit];
    box[minDigit] = box[maxDigit];
    box[minDigit] = temp;
  }
}

