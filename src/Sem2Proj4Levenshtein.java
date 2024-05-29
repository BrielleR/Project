/*Brielle Roze
Proj 4/5: Levenshtein
BJP Ch 11 project 1. Find edit (Levenshtein) distance between words. Read words from a sorted dictionary file.
Compute a map from every word to its immediate neighbors, that is, the words that have an edit distance of 1 from it.
 You can walk the map to find paths from one word to another, and can use a linked list of words to visit neighbors.
 (Full description in BJP) You might also find a dictionary sorted by length to be of help.
 (By the way, that is a little hint.) One last thing to note, the dictionaries have 370,099 words in them
 (the same words). I forget where I found the original dictionary otherwise I would give a link to it.
 It was mostly, but not completely, sorted alphabetically. I sorted them alphabetically and by length for best
 use in solving the problem. Use one or both to help you solve the problem.
Here are some examples of tests and my results. By the way, you do not need to find paths.
Just determine that there are paths.
Here is a file with just a small set of words to test cat to dog or dog to cat.
(You can test other paths with this dictionary as well.)
pg 742:
Write a program that computes the edit distance (also called the Levenshtein distance, for its creator Vladimir
Levenshtein) between two words. The edit distance between two strings is the minimum number of operations that
are needed to transform one string into the other. For this program, an operation is a substitution of a single character,
such as from “brisk” to “brick”. The edit distance between the words “dog” and “cat” is 3, following the chain of
“dot”, “cot”, and “cat” to transform “dog” into “cat”. When you compute the edit distance between two words, each
intermediate word must be an actual valid word. Edit distances are useful in applications that need to determine how
similar two strings are, such as spelling checkers.

Read your input from a dictionary text file. From this file, compute a map from every word to its immediate neighbors,
that is, the words that have an edit distance of 1 from it. Once this map is built, you can walk it to find paths
from one word to another.

A good way to process paths to walk the neighbor map is to use a linked list of words to visit, starting with the
beginning word, such as “dog”. Your algorithm should repeatedly remove the front word of the list and add all of its
neighbors to the end of the list, until the ending word (such as “cat”) is found or until the list becomes empty, which
indicates that no path exists between the two words.

Dictionary from:
https://github.com/dwyl/english-words/blob/master/words_alpha.txt
who also edited it from:
https://github.com/dwyl/english-words/blob/master/word_list_moby_credits.txt

Tracker
Date: 5/27/24
Notes: Started project, made introduction and researched the assignment
Date: 5/28/24
Notes:made dictionary file
Date:5/29/24
Notes:
 */
import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Sem2Proj4Levenshtein {
    public static void main(String[]args)
    {
        System.out.println("Welcome to Levenshtein");
        System.out.println("In this game you will input two words, and the computer will tell you all the shortest distances between the two words!");
        System.out.println("Would you like to play? If so enter 1 if not enter any other positive integer!");

    }
}
