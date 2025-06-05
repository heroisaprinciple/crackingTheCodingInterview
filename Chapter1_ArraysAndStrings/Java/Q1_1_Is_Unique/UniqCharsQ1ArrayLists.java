// Approach with creating additional data structure.
// As this chapter introduces ArrayLists, I decided to use them.
// Time compexity: O(n^2);
// Space compexity: O(n) -> as a new data struct was introduced

package Chapter1_ArraysAndStrings.Java.Q1_1_Is_Unique;

import java.util.*;

public class UniqCharsQ1ArrayLists {
  public static boolean hasUniqChars(String word) {
    ArrayList<Character> chars = new ArrayList<Character>();
    for (char el : word.toCharArray()) { // O(n)
      if (chars.contains(el)) { // contains itself has a loop -> O(n)
        return false;
      }

      chars.add(el); // O(1)
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println("ArrayLists introduction. \n");

    String[] words = { "hello", "cat", "apple", "giraffe", "human", "dinosaur" };
    for (String word : words) {
      System.out.println(word + ": " + hasUniqChars(word));
    }
  }
}
