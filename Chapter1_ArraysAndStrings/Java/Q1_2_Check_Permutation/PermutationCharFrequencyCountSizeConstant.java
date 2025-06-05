// Time complexity: O(n)
// Space complexity: O(1) because the array of 128 symbols will never grow
// beyond 128 symbols

package Chapter1_ArraysAndStrings.Java.Q1_2_Check_Permutation;

public class PermutationCharFrequencyCountSizeConstant {
  public static boolean checkIfPermOfStr(String word1, String word2) {
    if (!isValidInput(word1, word2))
      return false;

    int[] freq = buildFrequencyArr(word1);

    return matchesFrequency(word2, freq);
  }

  private static boolean isValidInput(String word1, String word2) {
    if (word1 == null || word2 == null)
      return false;
    if (word1.length() != word2.length())
      return false;
    return true;
  }

  private static int[] buildFrequencyArr(String word1) {
    int[] freq = new int[128];

    for (char c : word1.toCharArray()) { // O(n)
      freq[c]++; // Unlike C++, Java allocates arrays with 0 automatically
    }
    return freq;
  }

  private static boolean matchesFrequency(String word2, int[] freq) {
    for (char c : word2.toCharArray()) { // O(n)
      if (freq[c] < 0) {
        return false;
      }
      freq[c]--;
    }
    return true;
  }

  public static void main(String[] args) {
    String[] testWords = { "dcoe", "dolphin", "dog", null, "docee", "doce" };
    String baseWord = "code";

    // Lambdas would be used with Arrays.stream
    for (String word : testWords) {
      System.out.println(checkIfPermOfStr(baseWord, word));
    }

  }
}
