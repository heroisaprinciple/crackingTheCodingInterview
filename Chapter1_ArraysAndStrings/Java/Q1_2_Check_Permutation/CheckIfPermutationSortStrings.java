package Chapter1_ArraysAndStrings.Java.Q1_2_Check_Permutation;

import java.util.Arrays;

public class CheckIfPermutationSortStrings {
  public static void main(String[] args) {
    System.out.println("A Sort String approach.");
    String[] testWords = { "act", "dolphin", "dog", null };
    String baseWord = "cat";

    for (String word : testWords) {
      System.out.println(checkIfPermOfStr(baseWord, word));
    }
  }

  public static String sort(String word) {
    char[] chars = word.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }

  public static boolean checkIfPermOfStr(String word1, String word2) {
    if (word1 == null || word2 == null)
      return false;
    if (word1.length() != word2.length())
      return false;
    return sort(word1).equals(sort(word2));
  }
}
