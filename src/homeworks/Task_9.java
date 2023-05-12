package homeworks;

import java.util.Scanner;

//Считать пять цифр и сделать из них число. См. код Task09
//// если на вход подали:
//        // 3
//        // 4
//        // 7
//        // 1
//        // 5
//        // вывод: 34715
public class Task_9 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ведите 5 чисел: ");

    char c = sc.next().charAt(0);
    char c2 = sc.next().charAt(0);
    char c3 = sc.next().charAt(0);
    char c4 = sc.next().charAt(0);
    char c5 = sc.next().charAt(0);

    System.out.printf(" %c%c%c%c%c",c,c2,c3,c4,c5);



  }

}
