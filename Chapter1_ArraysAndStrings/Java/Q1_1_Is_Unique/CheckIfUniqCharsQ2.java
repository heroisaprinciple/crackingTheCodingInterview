// Brute-Force Solution
// Time complexity: O(n^2);
// Space complexity: O(1)

package Chapter1_ArraysAndStrings.Java.Q1_1_Is_Unique;

public class CheckIfUniqCharsQ2 {
    public static boolean hasUniqChars(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Brute Force Approach. \n");

        String[] words = { "hello", "cat", "apple", "giraffe", "human" };
        for (String word : words) {
            System.out.println(word + ": " + hasUniqChars(word));

        }
    }
}
