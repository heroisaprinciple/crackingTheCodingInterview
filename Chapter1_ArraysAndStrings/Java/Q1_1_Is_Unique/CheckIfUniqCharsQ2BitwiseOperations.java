// Bitwise operations using ascii conversion
// Time complexity: O(n);
// Space complexity: O(1)

package Chapter1_ArraysAndStrings.Java.Q1_1_Is_Unique;

public class CheckIfUniqCharsQ2BitwiseOperations {
  public static void main(String[] args) {
    String[] words = { "hello", "cat", "apple", "giraffe", "human", "dinosaur", "essay" };
    for (String word : words) {
      System.out.println(word + ": " + hasUniqChars(word));
    }
  }

  public static boolean hasUniqChars(String word) {
    if (word.length() > 26) { // O(1) as Java String class stores the length as a separate
                              // int field in memory; Would we O(n) in C by C's design
      return false;
    }

    int checker = 0;
    for (int i = 0; i < word.length(); i++) { // O(n)
      int ascii = word.charAt(i) - 'a'; // O(1)
      if ((checker & (1 << ascii)) > 0)
        return false; // O(1)
      checker |= (1 << ascii); // O(1)
    }
    return true;
  }
}
