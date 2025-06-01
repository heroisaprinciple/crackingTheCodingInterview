<h1> A set of solutions to the Cracking The Coding Interview's tasks. </h1>
<p> There are Java and Python examples. </p>

<h2> Chapter 1. Array and Strings. </h2>

### Q1.1 Check If String has Unique Charcters
<p>Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures? </p>

- [Q1: Using ArrayLists -> Time: O(n^2); Space: O(n)](Chapter1_ArraysAndStrings/Java/Q1_1_Is_Unique/CheckIfUniqCharsQ1ArrayLists.java)
- [Q1: Using HashSets -> Time: O(n); Space: O(n)](Chapter1_ArraysAndStrings/Java/Q1_1_Is_Unique/CheckIfUniqCharsQ1HashSets.java)
- [Q2: Brute Force Compare -> Time: O(n^2); Space: O(1)](Chapter1_ArraysAndStrings/Java/Q1_1_Is_Unique/CheckIfUniqCharsQ2.java)
- [Q2: Bitwise Operations -> Time: O(n); Space: O(1)](Chapter1_ArraysAndStrings/Java/Q1_1_Is_Unique/CheckIfUniqCharsQ2BitwiseOperations.java)

<hr>

### Q1.2 Check Permutation Solutions
<p> Check Permutation: Given two strings, write a method to decide if one is a permutation of the
other. </p>

- [Option 1: Sort Strings -> Time: O(n log n); Space: O(n)](Chapter1_ArraysAndStrings/Java/Q1_2_Check_Permutation/CheckIfPermutationSortStrings.java)
- [Option 2: Count Char Frequency with 2 Hashmaps -> Time: O(n); Space: O(n)](Chapter1_ArraysAndStrings/Java/Q1_2_Check_Permutation/CheckIfPermutationCharFrequencyCount.java)
- [Option 3: Count Char Frequency with 1 Hashmap -> Time: O(n); Space: O(n)](Chapter1_ArraysAndStrings/Java/Q1_2_Check_Permutation/CheckIfPermutationCharFrequencyCountOneHashmap.java)
- [Option 4: Count Char Frequency with 1 Array -> Time: O(n); Space: O(1)](Chapter1_ArraysAndStrings/Java/Q1_2_Check_Permutation/CheckIfPermutationCharFrequencyCountSizeConstant.java)


<b>Key takeaway: Note the assumption on line 6. In your interview, you should always check with your interviewer about the
size of the character set. We assumed that the character set was ASCII.
If the character set is not specified, use HahMaps.
If otherwise (only Eglish letters or ASCII chars etc), use arrays to get O(1) in space.</b>

-----------


<h2> Chapter 2. Linked Lists. </h2>
