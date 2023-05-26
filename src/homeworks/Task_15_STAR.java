package homeworks;

//Для задачи Task15 сделать вывод количества локальных минимумов и сами минимумы:
//3
//4, 2, 14
public class Task_15_STAR {

  public static void main(String[] args) {

    int[] array = {6, 4, 5, 2, 10, 15, 14, 20};
    int [] localMin = new int[array.length];
    int count = 0;
    for (int i = 1; i < array.length - 1; i++) {
      if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
        localMin[count] = array[i];
        count++;

      }
    }

    System.out.println(count);
    for (int i = 0; i < count; i++) {
      System.out.print(localMin[i] + "|");
    }

  }

}
