/*
 * Time: O(n);
 * Space complexity: O(n) due to StringBuilder creation, even with memory preallocation
 *
 * Here, a lookahead of string length is happening
 * Why build the compressed string at all if it's going to be longer?
 * This check saves time and memory by avoiding unnecessary work when compression provides no benefit.
 *
 * For instance:
 * "aabcccccaaa" => groups: a2 b1 c5 a3
 * length: 2 + 2 + 2 + 2 = 8
 *
 * As in:
 * 'a' + "2" -> length = 1 + 1 = 2
 * 'b' + "1" -> length = 1 + 1 = 2
 * 'c' + "6" -> length = 1 + 1 = 2
 * 'a' + "3" -> length = 1 + 1 = 2
 * => the compressed str is shorter than the orig one -> return compressed str
 *
 * The downside of this is that it causes a second loop through the characters
 * and also adds nearly duplicated code.
 * One benefit of this approach is that we can initialize StringBuilder to
 * its necessary capacity upfront.
 * Without this, StringBuilder will (behind the scenes) need to double its capacity every time it
 * hits capacity. The capacity could be double what we ultimately need.
 *
*/

package Chapter1_ArraysAndStrings.Java.Q1_6_String_Compression;

public class StringCompressionLengthLookahead {
  public static String compressString(String str) {
    if (str == null || str.length() == 0)
      return str;

    int finalLength = checkCompressedLength(str);
    if (finalLength > str.length())
      return str;

    int occurrenceCount = 0;
    StringBuilder sb = new StringBuilder(finalLength); // initialize capacity
    for (int i = 0; i < str.length(); i++) { // O(n)
      occurrenceCount++;

      /* Being mindful of str bounds. */
      if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
        sb.append(str.charAt(i));
        sb.append(occurrenceCount);
        occurrenceCount = 0;
      }
    }
    return sb.toString();
  }

  // check ahead if we need to iterate over str
  private static int checkCompressedLength(String str) {
    int occurrenceCount = 0;
    int compressedLength = 0;
    for (int i = 0; i < str.length(); i++) { // O(n)
      occurrenceCount++;

      if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
        compressedLength += 1 + String.valueOf(occurrenceCount).length(); // the total length
        occurrenceCount = 0;
      }
    }
    return compressedLength;
  }

  public static void main(String[] args) {
    String[] words = { "aabcccccaaa", "ababababt", "", null };
    for (String word : words) {
      System.out.println(compressString(word));
    }
  }
}
