/*
 * Time complexity: O(n) + O(n) ==> O(n)
 * Space complexity: O(n) as the new string is created here
 *
 * If str2 is a rotation of str1, it means that str1 was split at some
 * index and the two parts were swapped.
 * So all rotations of str1 are substrings of str1 + str1
 *
 * .contains() is not used here as we need ONE call to isSubstr()
 */

package Chapter1_ArraysAndStrings.Java.Q1_9_Str_Rotation;

public class StringRotation {
  public static boolean isSubstrRotation(String str1, String str2) {
    String concatenatedString = str1 + str1; // O(n) as it copies two str in one
    return (str1.length() == str2.length() && isSubstr(concatenatedString, str2))
        ? true
        : false;
  }

  private static boolean isSubstr(String concatenatedString, String str2) {
    return concatenatedString.indexOf(str2) >= 0; // .indexOf takes O(n) time
  }

  public static void main(String[] args) {
    System.out.println(isSubstrRotation("erbottlewat", "waterbottle")); // true
    System.out.println(isSubstrRotation("kitty", "kzzitty")); // false
    System.out.println(isSubstrRotation("", "")); // true
  }

}
