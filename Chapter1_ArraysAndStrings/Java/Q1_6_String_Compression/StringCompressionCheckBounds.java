/*
 * Time: O(n);
 * Space complexity: O(n) due to StringBuilder creation
 *
 * No hashmaps here, loses grouping by el (would be a:5)
 *
 * If ordinary strings we used, then it would lead to O(N^2);
 * String is immutable in Java and any modification (repeated += here)
 * would result in new string obj creation
*/

package Chapter1_ArraysAndStrings.Java.Q1_6_String_Compression;

public class StringCompressionCheckBounds {
  public static String compressString(String str) {
    if (str == null || str.length() == 0)
      return str;

    int occurrenceCount = 0;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) { // O(n)
      occurrenceCount++;

      /* Being mindful of str bounds. */
      if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
        sb.append(str.charAt(i));
        sb.append(occurrenceCount);
        occurrenceCount = 0;
      }
    }
    return sb.length() < str.length() ? sb.toString() : str;
  }

  public static void main(String[] args) {
    String[] words = { "aabcccccaaa", "ababababt", "", null };
    for (String word : words) {
      System.out.println(compressString(word));
    }
  }
}
