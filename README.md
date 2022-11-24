# Design-And-Analysis-of-Algoithms
<h2> Assignment 2 </h2>

Name : Arpit Singh Thakur <br>
Sec  : 5-A <br>
Roll : 36 <br>

<hr>

<h3> Problem Statement : <u> Give an application and implementation to demonstrate the Boyer Moore text pattern searching algorithm</u> </h3>

<h3> Description:</h3> <p> Boyer-Moore is an algorithm for finding substrings into strings. This algorithm compares each characters of substring to find a word or the same characters into the string. When characters do not match, the search jumps to the next matching position in the pattern by the value indicated in the Bad Match Table. </p> 

<h3>Implementation:</h3>
<p>
  The Algorithm is implemented using the "Bad Character Rule". The idea of bad character heuristic is simple. The character of the text which doesn’t match with the current character of the pattern is called the Bad Character. Upon mismatch, we shift the pattern until – <br>
1. The mismatch becomes a match.: We Search for the missmatched character in the pattern and then shift it such that it matches the charcter in the text.<br>
2. Pattern P moves past the mismatched character : We first find the position of last occurrence of mismatching character in pattern and if character does not exist we will shift pattern past the mismatching character. <br>
The Time Complexity of Boyer Moore Algorithm is O(n x m) (where n=Length of Input String and m=length of the Pattern) 
</p>

<h3>
    Applications of Boyer-Moore Algorithm
</h3>

<p>
1: Searchbars<br>
2: Auto-correctors<br>
3: String Analyzers<br>
4: Big Data<br>
5: Text labeling
</p>

<h3> TEST CASES </h3>
<br>
<p> INPUT1 </p>

String message - AAGTABFKNILKSHDFAYEBDH <br>
Pattern - KNILKS
<p> OUTPUT1 </p>
<p>KNILKS Pattern occur at Index Value = 7</p>
<p>INPUT2</p>

String(text)-This is Design And Anaysis of Algorithm Assignment 2 (/*Applied in text search*/)<br>
Pattern - Assignment 2
<p>OUTPUT2</p>
<p>Assignment 2 Pattern occur at Index Value = 40</p>

<p> INPUT3 </p>
String - Boyer-Moore algorithm is a string searching or matching algorithm developed by Robert S. Boyer<br>
Pattern - Complexity

<p> OUTPUT3 </p>
<p>Pattern not Found</p>

