package lesson14.Strings;

public class Main {

  public static void main(String[] args) {
    char[] wordArray = {'h', 'a', 'l', 'l', 'o'};
    String word = "hallo";
    char[] letters = word.toCharArray();

    for (int i = 0; i < letters.length; i++) {
      System.out.println(letters[i]);
    }

    String newWord = new String(wordArray);
    System.out.println(newWord);

    char letter = word.charAt(1);
    System.out.println(letter);

    int indexOfA = word.indexOf('A');
    int indexOfL = word.indexOf('l');
    int indexOfLast = word.lastIndexOf('l');


    System.out.println(indexOfA);
    System.out.println(indexOfL);
    System.out.println(indexOfLast);


    boolean e = word.startsWith("ha");
    boolean s = word.endsWith("llo");


    System.out.println(e);
    System.out.println(s);

    boolean r = word.contains("ers");
    System.out.println(r);
    System.out.println(word.length());
    System.out.println(word.toLowerCase());
    System.out.println(word.toUpperCase());


  }

}
