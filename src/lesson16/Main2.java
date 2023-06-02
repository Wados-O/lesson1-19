package lesson16;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String [] array = new String[10];
    int count = 0;

    System.out.println(Arrays.toString(array));
    while (true){
      String number = scanner.nextLine();
      array[count] = number;
      count++;
      if (  count ==array.length){
        int newLength = array.length + array.length / 2;
        String[] newArray = new String[newLength];
        for (int i = 0; i < array.length; i++) {
          newArray[i] = array[i];

        }
        array = newArray;
        System.out.println("Массив увеличен");
      }
      for (int i = 0; i < count; i++) {
        System.out.print(array[i] + "|");
      }
      System.out.println();
    }
  }

}
