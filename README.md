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

- [Option 1: Sort Strings -> Time: O(n log n + m log m); Space: O(n + m)](Chapter1_ArraysAndStrings/Java/Q1_2_Check_Permutation/PermutationSortStrings.java)
- [Option 2: Count Char Frequency with 2 Hashmaps -> Time: O(n + m); Space: O(n + m)](Chapter1_ArraysAndStrings/Java/Q1_2_Check_Permutation/PermutationCharFrequencyCount.java)
- [Option 3: Count Char Frequency with 1 Hashmap -> Time: O(n + m); Space: O(n)](Chapter1_ArraysAndStrings/Java/Q1_2_Check_Permutation/PermutationCharFrequencyCountOneHashmap.java)
- [Option 4: Count Char Frequency with 1 Array -> Time: O(n + m); Space: O(1)](Chapter1_ArraysAndStrings/Java/Q1_2_Check_Permutation/PermutationCharFrequencyCountSizeConstant.java)


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

- [Option 1: Using HashMap → Time: O(n); Space: O(n)](Chapter1_ArraysAndStrings/Java/Q1_4_Palindrome_Permutation/PalindromePermutationChecker.java)
- [Option 2: Using Fixed Array (Optimized) → Time: O(n); Space: O(1)](Chapter1_ArraysAndStrings/Java/Q1_4_Palindrome_Permutation/PalindromePermutationCheckerOptimized.java)
- [Option 3: Bit Vector Approach → Time: O(n); Space: O(1)](Chapter1_ArraysAndStrings/Java/Q1_4_Palindrome_Permutation/PalindromePermutationCheckerBitVector.java)

<b>Key takeaway: <i> "It's interesting to note a solution that we did not explore. We avoided solutions along the lines of "create
all possible permutations and checkif they are palindromes/'Whilesuch a solution would work, it's entirely
infeasible in the real world. Generating all permutations requires factorial time (which is actually worse than
exponential time), and it is essentially infeasible to perform on strings longer than about 10-15 characters.
I mention this (impractical) solution because a lot of candidates hear a problem like this and say, "In order
to check if A is in group B, I must know everything that is in B and then check if one of the items equals A."
That's not always the case, and this problem is a simple demonstration of it You don't need to generate all
permutations in order to check if one is a palindrome." </i>
</b>

<hr>

### Q1.5. One Edit Away
<p><i>Two pointers problem</i></p>
<p>One Away: There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
</p>

````
pale, pie -> true
pales, pale -> true
pale, bale -> true
pale, bae -> false
````

- [Option 1: Separate Replace and Insert Operations → Time: O(n); Space: O(1)](Chapter1_ArraysAndStrings/Java/Q1_5_One_Away/OneAwaySeparateOperations.java)
- [Option 2: United Replace and Insert Operations → Time: O(n); Space: O(1)](Chapter1_ArraysAndStrings/Java/Q1_5_One_Away/OneAwayOneOperation.java)

<b> Key takeaway: <i>
"Why is the runtime dictated by the shorter string instead of the longer string? If the strings are
the same length (plus or minus one character), then it doesn't matter whether we use the longer
string or the shorter string to define the runtime. If the strings are very different lengths, then the
algorithm will terminate in 0(1) time. One really, really long string therefore won't significantly
extend the runtime. It increases the runtime only if both strings are long." </i>

Normally, when comparing two arbitrary strings of lengths n and m, the time complexity would be: </b>

````
O(min(n, m)) if stop early
O(n + m) if traverse both completely
````

<b>But in this specific problem, the lengths are either the same, or off by exactly 1.</b>

<i> "Some people might argue the first approach is better, as it is clearer and easier to follow. Others, however,
will argue that the second approach is better, since it's more compact and doesn't duplicate code (which
can facilitate maintainability).
You don't necessarily need to "pick a side."You can discuss the tradeoffs with your interviewer."</i>

<hr>

### Q1.6 String Compression
<p>String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. If the "compressed" string would not become smaller than theoriginal string, your method should return the original string.
You can assume the string has only uppercase and lowercase letters (a - z).</p>

````
Input: aabcccccaaa
Output: a2blc5a3
````


- [Option 1: Basic Compression with Post-check → Time: O(n); Space: O(n)](Chapter1_ArraysAndStrings/Java/Q1_6_String_Compression/StringCompression.java)
- [Option 2: Compression with Explicit Bound Checks → Time: O(n); Space: O(n)](Chapter1_ArraysAndStrings/Java/Q1_6_String_Compression/StringCompressionCheckBounds.java)
- [Option 3: Precompute Compressed Length Before Building → Time: O(n); Space: O(n)](Chapter1_ArraysAndStrings/Java/Q1_6_String_Compression/StringCompressionLengthLookahead.java)

**Key takeaway: _Only build a compressed string if it saves space. Use a lookahead to compute final length, and avoid using HashMaps since they lose grouping (e.g., `"aabaaa"` becomes `"a5"` instead of `"a2b1a3"`)._**

<hr>

### Q1.7 Matrix Rotation
<p>Rotate Matrix: Given an image represented by an nxn matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place?</p>

````
Input:
[
 [200, 113, 211, 151],
 [156,  45, 214, 200],
 [173, 210, 211, 251],
 [ 94, 100, 117, 125]
]

Output after 90° clockwise rotation:
[
 [ 94, 173, 156, 200],
 [100, 210,  45, 113],
 [117, 211, 214, 211],
 [125, 251, 200, 151]
]
````

- [Option 1: Brute-force using new matrix -> Time: O(n^2); Space: O(n^2)](Chapter1_ArraysAndStrings/Java/Q1_7_Matrix_Rotation/MatrixRotationBy90Degrees.java)
- [Option 2: In-place using Transpose + Reverse -> Time: O(n^2); Space: O(1)](Chapter1_ArraysAndStrings/Java/Q1_7_Matrix_Rotation/MatrixRotationBy90DegreesOptimalSpace.java)


Disclaimer: the author's [solution](https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2001.%20Arrays%20and%20Strings/Q1_07_Rotate_Matrix/Question.java) to the in-place option was not implemented here as rotation in layers seemed
very difficult for me. Instead, I did a matrix transpose and reverse, inspired by this [video](https://www.youtube.com/watch?v=Z0R2u6gd3GU).

<hr>

### Q1.8 Zero Matrix
<p>Zero Matrix: Write an algorithm such that if an element in an m x n matrix is 0, its entire row and
column are set to 0.
</p>

````
Input:
24   0  50  250
0   27  143 247
163 143 214 152
48  207 146  28
121 172  83 214

Output:
0   0   0   0
0   0   0   0
0   0 214 152
0   0 146  28
0   0  83 214
````

- [Option 1: Brute-force approach → Time: O((n x m) x (n + m)) + O(n x m); Space: O(1)](Chapter1_ArraysAndStrings/Java/Q1_8_Zero_Matrix/RowAndColNullification.java)
- [Option 2: More optimized in time → Time: O(n × m); Space: O(n + m)](Chapter1_ArraysAndStrings/Java/Q1_8_Zero_Matrix/RowAndColNullificationOptimized.java)
- [Option 3: Space optimal using first row/col as markers → Time: O(n × m); Space: O(1)](Chapter1_ArraysAndStrings/Java/Q1_8_Zero_Matrix/RowAndColNullificationSpaceOptimal.java)

<b>Key takeaway:</b>
<i>For optimal space, [reuse the matrix itself to track zero positions](https://takeuforward.org/data-structure/set-matrix-zero/). Just preserve the initial state of row 0 and col 0 with booleans, then modify in-place in a final sweep.</i>

<hr>

### Q1.9 String Rotation
<p>
String Rotation: Assume you have a method isSubstring which checks if one word is a substring
of another. Given two strings, str1 and str2, write code to check if str2 is a rotation of str1 using only one
call to isSubstring.
</p>

````
Original str: erbottlewat
Rotated: waterbottle
````

- [Option 1: Using String Concatenation -> Time: O(n); Space: O(n)](Chapter1_ArraysAndStrings/Java/Q1_9_Str_Rotation/StringRotation.java)


-----------


<h2> Chapter 2. Linked Lists. </h2>
