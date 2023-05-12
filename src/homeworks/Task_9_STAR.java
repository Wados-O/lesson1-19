package homeworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

//На вход подается текст, состоящий из трех символов таблицы ASCII (0..127), например Man.
//
//Для каждого символа можно определить его ASCII код
//
//M - 77
//a - 97
//n - 110
//
//Теперь, пусть для кодирования используется только:
//- 26 заглавных букв (номера с 0 по 25)
//- 26 строчных (номера с 26 по 51)
//- 10 цифр (номера с 52 по 61)
//- +, / (62 и 63 соответственно)
//
//Следовательно, всего доступно 64 символа (АЛФАВИТ).
//Каждый символ в такой кодировке достаточно представить 6-ю битами.
//
//Представим каждый код символа в его двоичном представлении: (используется 8 бит для каждого, согласно ASCII):
//
//M - 77(10)  - 01001101
//a - 97(10)  - 01100001
//n - 110(10) - 01101110
//
//Соединим все три двоичных представления в одну цепочку:
//
//010011010110000101101110
//
//Теперь разобьем на группы по 6 бит:
//
//[010011][010110][000101][101110]
//
//Теперь каждая группа кодирует один символ АЛФАВИТА
//
//010011(2) - 19(10) - T
//010110(2) - 22(10) - W
//000101(2) -  5(10) - F
//101110(2) - 46(10) - u
//
//Таким образом, исходное Man было преобразовано в TWFu.
//
//Необходимо считать три символа и выдать результат их кодирования
//
//Гарантируется, что для любых трех символов результатом будет 4 символа кодировки.
//
//Для проверки, можно использовать Man (TWFu), Ca! (Q2Eh), ^!A (XiFB)
public class Task_9_STAR {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int code = br.read();
    char character = (char) code;
    int code2 = br.read();
    char character2 = (char) code2;
    int code3 = br.read();
    char character3 = (char) code3;


    System.out.println("Проверка " + Integer.toBinaryString(code));
    System.out.println("Проверка " + Integer.toBinaryString(code2));
    System.out.println("Проверка " + Integer.toBinaryString(code3));
  }
}