# Design-And-Analysis-of-Algoithms
<h2> Assignment 2 </h2>

Name : Arpit Singh Thakur <br>
Sec  : 5-A <br>
Roll : 36 <br>

<hr>

<h3> Problem Statement : <u> Give an application and implementation to demonstrate the Boyer Moore text pattern searching algorithm</u> </h3>

<h3> Description:</h3> <p> Boyer-Moore is an algorithm for finding substrings into strings. This algorithm compares each characters of substring to find a word or the same characters into the string. When characters do not match, the search jumps to the next matching position in the pattern by the value indicated in the Bad Match Table. </p> 

<h3>Implementation</h3>
<p>
  The Algorithm is implemented using the "Bad Character Rule". The idea of bad character heuristic is simple. The character of the text which doesn’t match with the current character of the pattern is called the Bad Character. Upon mismatch, we shift the pattern until – <br>
1. The mismatch becomes a match.: We Search for the missmatched character in the pattern and then shift it such that it matches the charcter in the text.<br>
2. Pattern P moves past the mismatched character : We first find the position of last occurrence of mismatching character in pattern and if character does not exist we will shift pattern past the mismatching character. 
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

![Screenshot (65)](https://user-images.githubusercontent.com/95165463/189667623-2322a9b0-d341-4051-a555-59f4f4c1f218.png)

<p> OUTPUT1 </p>
<p>It is a Rising Tower Matrix</p>
<p>INPUT2</p>

![Screenshot (66)](https://user-images.githubusercontent.com/95165463/189668083-4dc1d5d0-ed74-4a4e-9acc-3b217952e8e9.png)

<p>OUTPUT2</p>
<p>It is not a Rising Tower Matrix</p>

<p> INPUT3(Random Inputs) </p>


![Screenshot (68)](https://user-images.githubusercontent.com/95165463/189668623-956c18fa-3056-4502-8b58-401e3dab5401.png)

<p> OUTPUT3 </p>
<p>It is a not Rising Tower Matrix</p>

