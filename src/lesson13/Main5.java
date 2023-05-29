package lesson13;

public class Main5 {

  public static void main(String[] args) {
    int[] a = {88, 58, 73, 53, 31, 68, 1, 52, 31, 73, 54, 86, -5, 8, 31};

    int min, indexOfMin, temp;
    for (int i = 0; i < a.length; i++) {
      min = a[i];
      indexOfMin = i;
      for (int j = 1; j < a.length; j++) {

        if (a[j] < min) {

          min = a[j];

          indexOfMin = j;
        }
      }


      temp = a[0]; // temp = 88
      a[0] = a[indexOfMin]; // a[0] = -5
      a[indexOfMin] = temp; // a[12] = 88
    }

    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " | ");
    }
  }
}
