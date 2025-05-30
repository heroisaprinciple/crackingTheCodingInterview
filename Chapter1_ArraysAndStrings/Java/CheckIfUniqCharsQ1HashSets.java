// HashsSets are like HashMaps, but store uniq data
// Time Complexity: O(n); Space: O(n) as the new data struct was introduced

package Chapter1_ArraysAndStrings.Java;

import java.util.*;

public class CheckIfUniqCharsQ1HashSets {
  public static void main(String[] args) {
    System.out.println("HashSets introduction. \n");

    String[] words = {"hello", "cat", "apple", "giraffe", "human", "dinosaur", "hashset"};
    for (String word : words) {
        System.out.println(word + ": " + hasUniqChars(word));
    }
  }

  public static boolean hasUniqChars(String str) {
    HashSet<Character> charSet = new HashSet<Character>();
    for (char el : str.toCharArray()) { // O(n)
      if (charSet.contains(el)) { // O(1)
        return false;
      }
      charSet.add(el); // O(1)
    }
    return true;
  }
}
