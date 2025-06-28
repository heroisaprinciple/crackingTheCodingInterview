/*
Time complexity: O(n + m)
Space complexity: O(n + m)

Space is O(n) because each HashMap can grow to store up to n unique characters,
in the worst case where all characters are distinct.

If the character set is fixed (e.g., ASCII or a–z), then space is O(1),
because the number of entries is bounded by a constant.
*/

package Chapter1_ArraysAndStrings.Java.Q1_2_Check_Permutation;

import java.util.HashMap;

public class PermutationCharFrequencyCount {
  public static boolean checkIfPermOfStr(String word1, String word2) {
    if (word1 == null || word2 == null)
      return false;
    if (word1.length() != word2.length())
      return false;

    // 2 different hasmaps to to store letters and count n
    HashMap<Character, Integer> freqW1 = buildCharFrequencyMap(word1);
    HashMap<Character, Integer> freqW2 = buildCharFrequencyMap(word2);

    return freqW1.equals(freqW2);
  }

  private static HashMap<Character, Integer> buildCharFrequencyMap(String word) { // O(n)
    HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();
    for (char c : word.toCharArray()) {
      freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
    }
    return freqMap;
  }

  public static void main(String[] args) {
    System.out.println("A HashMap approach.");
    String[] testWords = { "act", "dolphin", "dog", null };
    String baseWord = "cat";

    for (String word : testWords) {
      System.out.println(checkIfPermOfStr(baseWord, word));
    }
  }
}
