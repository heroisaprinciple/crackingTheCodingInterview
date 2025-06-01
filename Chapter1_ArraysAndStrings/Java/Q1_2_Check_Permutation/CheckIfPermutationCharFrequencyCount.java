/*
Time complexity: O(n)
Space complexity: O(n) -> O(n) + O(n)

Space is O(n) because each HashMap can grow to store up to n unique characters,
in the worst case where all characters are distinct.

If the character set is fixed (e.g., ASCII or a–z), then space is O(1),
because the number of entries is bounded by a constant.
*/

package Chapter1_ArraysAndStrings.Java.Q1_2_Check_Permutation;

import java.util.HashMap;

public class CheckIfPermutationCharFrequencyCount {
  public static void main(String[] args) {
    System.out.println("A HashMap approach.");
    String[] testWords = { "act", "dolphin", "dog", null };
    String baseWord = "cat";

    for (String word : testWords) {
      System.out.println(checkIfPermOfStr(baseWord, word));
    }
  }

  public static boolean checkIfPermOfStr(String word1, String word2) {
    if (word1 == null || word2 == null)
      return false;
    if (word1.length() != word2.length())
      return false;

    // 2 different hasmaps to to store letters and count n
    HashMap<Character, Integer> freqW1 = new HashMap<Character, Integer>();
    HashMap<Character, Integer> freqW2 = new HashMap<Character, Integer>();

    for (int i = 0; i < word1.length(); i++) { // O(n)
      char letter = word1.charAt(i); // O(1)
      freqW1.put(letter, freqW1.containsKey(letter) ? freqW1.get(letter) + 1 : 1); // O(1)
    }

    for (int i = 0; i < word2.length(); i++) { // O(n)
      char letter = word2.charAt(i); // O(1)
      freqW2.put(letter, freqW2.containsKey(letter) ? freqW2.get(letter) + 1 : 1); // O(1)
    }

    return freqW1.equals(freqW2);
  }
}
