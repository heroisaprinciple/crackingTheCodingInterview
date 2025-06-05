// Time complexity: O(n);
// Space complexity: O(1)

package Chapter1_ArraysAndStrings.Java.Q1_4_Palindrome_Permuatation;

public class PalindromePermutationCheckerBitVector {
  public static boolean isPermutationOfPalindrome(String word) {
    int bitVector = createBitVector(word);
    return ifOneBitSet(bitVector);
  }

  private static int createBitVector(String word) {
    int bitVector = 0;
    for (char c : word.toCharArray()) {
      int val = returnUnicodeIntValue(c);
      bitVector = toggle(val, bitVector);
    }
    return bitVector;

  }

  private static int toggle(int index, int bitVector) {
    if (index < 0)
      return bitVector;

    int mask = 1 << index;
    bitVector ^= mask; // toggle the bit at index: sets to 1 if first seen, 0 if seen twice (even
                       // count)
    return bitVector;
  }

  // check if at most one bit is set => should result in 0s if yes
  private static boolean ifOneBitSet(int bitVector) {
    return (bitVector & (bitVector - 1)) == 0;
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

  public static void main(String[] args) {
    String[] testWords = { "Tact Coa", "racecar", "kitchen" };
    for (String word : testWords) {
      System.out.println(isPermutationOfPalindrome(word));
    }
  }
}
