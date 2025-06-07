/*
Time complexity: O(n) => O(n) + O(n), n is the length of the shortest str
(see README.md)
Space complexity: O(1)
*/

package Chapter1_ArraysAndStrings.Java.Q1_5_One_Away;

public class OneAwaySeparateOperations {
  public static boolean oneAway(String str1, String str2) {
    // if strings have the same length, then the chars are replaced
    if (str1.length() == str2.length()) {
      return replaceChar(str1, str2);
    }
    // if length is different, see where a character can be inserted
    else if (str1.length() + 1 == str2.length()) {
      return insertChar(str1, str2); // insert one char into str1 to make it equal to str2
    }
    // alternative to char removal
    else if (str1.length() - 1 == str2.length()) {
      return insertChar(str2, str1);
    }
    return false;
  }

  private static boolean replaceChar(String str1, String str2) {
    boolean findDiffOnce = false;

    for (int i = 0; i < str1.length(); i++) { // O(n)
      if (str1.charAt(i) != str2.charAt(i)) {
        if (findDiffOnce) // if findDiff was true (more than one diff) => return false;
          return false;
        findDiffOnce = true;
      }
    }
    return true;
  }

  private static boolean insertChar(String str1, String str2) {
    int index1 = 0;
    int index2 = 0;

    while (index1 < str1.length() && index2 < str2.length()) { // O(n)
      if (str1.charAt(index1) != str2.charAt(index2)) {
        if (index1 != index2) // if more than one diff
          return false;
        index2++; // skip a character in the longer string, simulating insertion into the
                  // shorter string
      } else {
        index1++;
        index2++;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(oneAway("pale", "ple")); // true
    System.out.println(oneAway("pse", "pale")); // false
    System.out.println(oneAway("pale", "bale")); // true
  }
}
