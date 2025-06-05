// Time complexity: O(n)
// Space complexity: O(1) -> toCharArray() would add O(n)

package Chapter1_ArraysAndStrings.Java.Q1_3_URLify;

public class URLifyCharacterArray {
  public static void replaceSpaceWithChars(char[] chars, int trueLength) {
    int spaceCount = countSpace(chars, trueLength);
    // assume the last element
    int newIndex = trueLength + (spaceCount * 2); // ' ' has existng space
                                                  // for '%' + '20' => spaceCount * 2

    for (int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex--) { // O(n)
      if (chars[oldIndex] == ' ') {
        chars[newIndex - 1] = '0';
        chars[newIndex - 2] = '2';
        chars[newIndex - 3] = '%';
        newIndex -= 3; // as we have %20
      } else {
        chars[newIndex - 1] = chars[oldIndex];
        newIndex--;
      }
    }
  }

  private static int countSpace(char[] chars, int trueLength) {
    int spaceCount = 0;
    for (int i = 0; i < trueLength; i++) { // 0(n)
      if (chars[i] == ' ') {
        spaceCount++;
      }
    }

    return spaceCount;
  }

  public static void main(String[] args) {
    String str = "Mr John Smith    "; // 4 spaces at the end
    char[] chars = str.toCharArray();
    replaceSpaceWithChars(chars, 13);
    System.out.println(new String(chars));
  }
}
