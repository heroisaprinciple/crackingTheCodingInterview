// Time complexity: O(n)
// Space: O(1) as fixed size array is presented

package Chapter1_ArraysAndStrings.Java.Q1_4_Palindrome_Permuatation;

public class PalindromePermutationCheckerOptimized {
  public static boolean isPermutationOfPalindrome(String str) {
    int[] occurrencesTable = new int[Character.getNumericValue('z') -
        Character.getNumericValue('a') + 1];

    return hasOddCount(occurrencesTable, str);
  }

  private static int returnUnicodeIntValue(Character c) {
    int a = Character.getNumericValue('a'); // O(1)
    int z = Character.getNumericValue('z');
    int value = Character.getNumericValue(c);

    if (value >= a && value <= z) {
      return value - a;
    }
    return -1;
  }

  private static boolean hasOddCount(int occurrencesTable[], String str) {
    int oddCount = 0;
    for (char c : str.toCharArray()) { // O(n)
      int value = returnUnicodeIntValue(c);
      if (value != -1) { // prevents some \S chars
        occurrencesTable[value]++; // increments 0
        if (occurrencesTable[value] % 2 == 1)
          oddCount++;
        else
          oddCount--;
      }
    }

    return oddCount <= 1;
  }

  public static void main(String[] args) {
    String[] testWords = { "Tact Coa", "racecar", "kitchen" };
    for (String word : testWords) {
      System.out.println(isPermutationOfPalindrome(word));
    }
  }
}
