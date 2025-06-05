/*
Time complexity: O(n)
Space complexity: O(n)

Space is O(n) because each HashMap can grow to store up to n unique characters,
in the worst case where all characters are distinct.

If the character set is fixed (e.g., ASCII or a–z), then space is O(1),
because the number of entries is bounded by a constant.
*/

package Chapter1_ArraysAndStrings.Java.Q1_2_Check_Permutation;

import java.util.HashMap;

public class PermutationCharFrequencyCountOneHashmap {
  public static boolean checkIfPermOfStr(String word1, String word2) {
    if (word1 == null || word2 == null)
      return false;
    if (word1.length() != word2.length())
      return false;

    HashMap<Character, Integer> freq = buildFrequencyMap(word1);

    return matchesFrequency(freq, word2);

  }

  private static HashMap<Character, Integer> buildFrequencyMap(String word1) {
    HashMap<Character, Integer> freq = new HashMap<Character, Integer>();

    for (char c : word1.toCharArray()) { // O(n)
      freq.put(c, freq.getOrDefault(c, 0) + 1); // O(1)
    }
    return freq;
  }

  private static boolean matchesFrequency(HashMap<Character, Integer> freq, String word2) {
    for (char c : word2.toCharArray()) { // O(n)
      if (!freq.containsKey(c))
        return false;

      int updated = freq.get(c) - 1;
      if (updated < 0) // test if we have multiple occurrences in the word:
                       // apple -> p should be 0, not -1
        return false;
      freq.put(c, freq.get(c) - 1);
    }

    return true;
  }

  public static void main(String[] args) {
    String[] testWords = { "dcoe", "dolphin", "dog", null, "docee" };
    String baseWord = "code";

    // Lambdas would be used with Arrays.stream
    for (String word : testWords) {
      System.out.println(checkIfPermOfStr(baseWord, word));
    }
  }
}
