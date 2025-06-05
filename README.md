<h1> A set of solutions to the Cracking The Coding Interview's tasks. </h1>
<p> There are Java and Python examples. </p>

<h2> Chapter 1. Array and Strings. </h2>

### Q1.1 Check If String has Unique Charcters
<p>Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures? </p>

- [Q1: Using ArrayLists -> Time: O(n^2); Space: O(n)](Chapter1_ArraysAndStrings/Java/Q1_1_Is_Unique/UniqCharsQ1ArrayLists.java)
- [Q1: Using HashSets -> Time: O(n); Space: O(n)](Chapter1_ArraysAndStrings/Java/Q1_1_Is_Unique/UniqCharsQ1HashSets.java)
- [Q2: Brute Force Compare -> Time: O(n^2); Space: O(1)](Chapter1_ArraysAndStrings/Java/Q1_1_Is_Unique/UniqCharsQ2.java)
- [Q2: Bitwise Operations -> Time: O(n); Space: O(1)](Chapter1_ArraysAndStrings/Java/Q1_1_Is_Unique/UniqCharsQ2BitwiseOperations.java)

<hr>

### Q1.2 Check Permutation Solutions
<p> Check Permutation: Given two strings, write a method to decide if one is a permutation of the
other. </p>

- [Option 1: Sort Strings -> Time: O(n log n); Space: O(n)](Chapter1_ArraysAndStrings/Java/Q1_2_Check_Permutation/PermutationSortStrings.java)
- [Option 2: Count Char Frequency with 2 Hashmaps -> Time: O(n); Space: O(n)](Chapter1_ArraysAndStrings/Java/Q1_2_Check_Permutation/PermutationCharFrequencyCount.java)
- [Option 3: Count Charncy with 1 Hashmap -> Time: O(n); Space: O(n)](Chapter1_ArraysAndStrings/Java/Q1_2_Check_Permutation/PermutationCharFrequencyCountOneHashmap.java)
- [Option 4: Count Char Frequency with 1 Array -> Time: O(n); Space: O(1)](Chapter1_ArraysAndStrings/Java/Q1_2_Check_Permutation/PermutationCharFrequencyCountSizeConstant.java)


<b>Key takeaway: <i>"In your interview, you should always check with your interviewer about the
size of the character set. We assumed that the character set was ASCII".</i>
If the character set is not specified, use HahMaps.
If otherwise (only Eglish letters or ASCII chars etc), use arrays to get O(1) in space.</b>

<hr>

### Q1.3 URLify
<p> URLify: Write a method to replace all spaces in a string with *%20' You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: if implementing in Java, please use a character array so that you can
perform this operation in place.) </p>

````
Input: "Mr John Smith ", 13

Output: "Mr%20IJohn%20Smith"
````

- [Option 1: Character Array In-place → Time: O(n); Space: O(1)](Chapter1_ArraysAndStrings/Java/Q1_3_URLify/URLifyCharacterArray.java)

<hr>

### Q1.4. Palindrome Permutation
<p> Palindrome Permutation: Given a string, write a function to check if it is a permutation of
a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
permutation is a rearrangement of letters. The palindrome does not need to be limited to just
dictionary words.Palindrome Permutation: Given a string, write a function to check if it is a permutation of
a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
permutation is a rearrangement of letters. The palindrome does not need to be limited to just
dictionary words.
</p>

````
Input: "Tact Coa"
Output: true // Permutations: "taco cat", "atco cta", etc.
````

- [Option 1: Using HashMap → Time: O(n); Space: O(n)](Chapter1_ArraysAndStrings/Java/Q1_4_Palindrome_Permuatation/PalindromePermutationChecker.java)
- [Option 2: Using Fixed Array (Optimized) → Time: O(n); Space: O(1)](Chapter1_ArraysAndStrings/Java/Q1_4_Palindrome_Permuatation/PalindromePermutationCheckerOptimized.java)
- [Option 3: Bit Vector Approach → Time: O(n); Space: O(1)](Chapter1_ArraysAndStrings/Java/Q1_4_Palindrome_Permuatation/PalindromePermutationCheckerBitVector.java)

<b>Key takeaway: <i> "It's interesting to note a solution that we did not explore. We avoided solutions along the lines of "create
all possible permutations and checkif they are palindromes/'Whilesuch a solution would work, it's entirely
infeasible in the real world. Generating all permutations requires factorial time (which is actually worse than
exponential time), and it is essentially infeasible to perform on strings longer than about 10-15 characters.
I mention this (impractical) solution because a lot of candidates hear a problem like this and say, "In order
to check if A is in group B, I must know everything that is in B and then check if one of the items equals A."
That's not always the case, and this problem is a simple demonstration of it You don't need to generate all
permutations in order to check if one is a palindrome." </i>
</b>


-----------


<h2> Chapter 2. Linked Lists. </h2>
