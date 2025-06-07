/*
Time complexity: O(n), n is the length of the shortest str. (see README.md)
Space complexity: O(1)
*/

package Chapter1_ArraysAndStrings.Java.Q1_5_One_Away;

public class OneAwayOneOperation {
  public static boolean oneAway(String str1, String str2) {
    if (Math.abs(str1.length() - str2.length()) > 1)
      return false;

    String shorterStr = str1.length() < str2.length() ? str1 : str2;
    String longerStr = str1.length() < str2.length() ? str2 : str1;

    return checkOneEdit(shorterStr, longerStr);
  }

  private static boolean checkOneEdit(String str1, String str2) {
    int index1 = 0, index2 = 0;
    boolean findDiffOnce = false;

    while (index1 < str1.length() && index2 < str2.length()) { // O(n)
      if (str1.charAt(index1) != str2.charAt(index2)) {
        if (findDiffOnce)
          return false;

        findDiffOnce = true;
        if (str1.length() == str2.length()) // simulate char replace
          index1++;

      } else {
        index1++; // if chars match
      }
      index2++; // always move longer str
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(oneAway("pale", "ple")); // true
    System.out.println(oneAway("pse", "pale")); // false
    System.out.println(oneAway("pale", "bale")); // true
  }

}
