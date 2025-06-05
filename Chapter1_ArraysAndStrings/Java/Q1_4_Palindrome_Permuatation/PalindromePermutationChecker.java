// Time complexity: O(n)
// Space: O(n) as hashmap grows

package Chapter1_ArraysAndStrings.Java.Q1_4_Palindrome_Permuatation;

import java.util.HashMap;

public class PalindromePermutationChecker {
  public static boolean isPermutationOfPalindrome(String str) {
    String modifiedString = str.toLowerCase().replace(" ", ""); // O(n)
    HashMap<Character, Integer> charOccurrences = new HashMap<Character, Integer>();

    for (char c : modifiedString.toCharArray()) { // O(n)
      charOccurrences.put(c, charOccurrences.getOrDefault(c, 0) + 1);
    }

    return hasAtMostOneOddCount(charOccurrences);
  }

  private static boolean hasAtMostOneOddCount(HashMap<Character, Integer> map) {
    int oddCount = 0;
    for (int count : map.values()) { // O(n)
      if (count % 2 != 0) {
        oddCount++;
        if (oddCount > 1) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String[] testWords = { "Tact Coa", "racecar", "kitchen" };
    for (String word : testWords) {
      System.out.println(isPermutationOfPalindrome(word));
    }
  }
}
