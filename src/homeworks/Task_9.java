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
    int code = c - '0';
    char c2 = sc.next().charAt(0);
    int code2 = c2 - '0';
    char c3 = sc.next().charAt(0);
    int code3 = c3 - '0';
    char c4 = sc.next().charAt(0);
    int code4 = c4 - '0';
    char c5 = sc.next().charAt(0);
    int code5 = c5 - '0';
    int  result = code * 10000+ code2*1000+code3*100+code4*10+code5;
    System.out.println(" : " + c + c2 + c3 + c4 + c5);
    System.out.println(" : " + code + code2 + code3 + code4 + code5);

    System.out.println(result);
  }

}
