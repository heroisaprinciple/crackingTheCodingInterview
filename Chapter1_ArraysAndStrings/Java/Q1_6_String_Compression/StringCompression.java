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

public class StringCompression {
  public static String compressString(String str) {
    if (str == null || str.length() == 0)
      return str;

    int occurrenceCount = 1;
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i < str.length(); i++) { // O(n)
      if (str.charAt(i) == str.charAt(i - 1)) { // O (1)
        occurrenceCount++;
      } else {
        sb.append(str.charAt(i - 1)).append(occurrenceCount); // O(1)
        occurrenceCount = 1;
      }
    }
    sb.append(str.charAt(str.length() - 1)).append(occurrenceCount); // O(1)
    // If the compressed str > the orig str, return orig str
    String compressedStr = sb.toString();
    return compressedStr.length() < str.length() ? compressedStr : str;
  }

  public static void main(String[] args) {
    String[] words = { "aabcccccaaa", "ababababt", "", null };
    for (String word : words) {
      System.out.println(compressString(word));
    }
  }
}
