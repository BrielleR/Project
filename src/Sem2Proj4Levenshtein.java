/*Brielle Roze
Proj 4/5: Levenshtein (lists, files, recursion)
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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Sem2Proj4Levenshtein {
    // A map to store each word and its immediate neighbors (words with an edit distance of 1)
    private static final Map<String, List<String>> neighborMap = new HashMap<>();

    public static void main(String[] args) {

        System.out.println("Welcome to Levenshtein");
        System.out.println("In this game you will input two words, and the computer will tell you all the shortest distances between the two words!");
        System.out.println("Would you like to play? If so enter 1 if not enter 0!");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); // Add this line to consume the newline character

        if (choice == 1) {
            // Get the two words from the user
            System.out.println("Enter the first word:");
            String word1 = scanner.nextLine();
            System.out.println("Enter the second word:");
            String word2 = scanner.nextLine();

            buildNeighborMap();
            // Find all shortest paths between the two words
            List<List<String>> shortestPaths = findShortestPaths(word1, word2);

            if (shortestPaths.isEmpty()) {
                System.out.println("There is no path between " + word1 + " and " + word2);
            } else {
                System.out.println("Shortest paths between " + word1 + " and " + word2 + ":");
                for (List<String> path : shortestPaths) {
                    System.out.println(path);
                }
            }
        } else {
            System.out.println("Goodbye!");
        }
    }

    // Build the neighbor map by reading the dictionary file
    private static void buildNeighborMap() {
        try (BufferedReader reader = new BufferedReader(new FileReader("dictionaryLevenshtein.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Get the current word
                String word = line.trim();

                // Find all words with an edit distance of 1 from the current word
                List<String> neighbors = new ArrayList<>();
                for (String otherWord : neighborMap.keySet()) {
                    if (levenshteinDistance(word, otherWord) == 1) {
                        neighbors.add(otherWord);
                    }
                }

                // Add the current word and its neighbors to the map
                neighborMap.put(word, neighbors);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    // Compute the edit distance between two words using dynamic programming
    private static int levenshteinDistance(String s1, String s2) {
        int[] costs = new int[s2.length() + 1];
        for (int k = 0; k <= s1.length(); k++) {
            int lastValue = k;
            for (int i = 0; i <= s2.length(); i++) {
                if (k == 0) {
                    costs[i] = i;
                } else {
                    if (i > 0) {
                        int match = costs[i - 1] + (s1.charAt(k - 1) == s2.charAt(i - 1) ? 0 : 1);
                        int insert = costs[i] + 1;
                        int delete = lastValue + 1;
                        costs[i] = Math.min(Math.min(insert, delete), match);
                    }
                    lastValue = costs[i];
                }
            }
            if (k > 0) {
                costs[s2.length()] = lastValue;
            }
        }
        return costs[s2.length()];
    }

    // Find all shortest paths between two words using BFS
    private static List<List<String>> findShortestPaths(String word1, String word2) {
        List<List<String>> shortestPaths = new ArrayList<>();
        int shortestDistance = Integer.MAX_VALUE;

        // Create a queue to hold the words to visit
        LinkedList<String> wordsToVisit = new LinkedList<>();

        // Create a set to keep track of visited words
        Set<String> visited = new HashSet<>();

        // Add the first word to the list and mark it as visited
        wordsToVisit.add(word1);
        visited.add(word1);

        // Loop until the list is empty
        while (!wordsToVisit.isEmpty()) {
            // Get the next word from the queue
            String current = wordsToVisit.poll();

            // If we've reached the second word, add the path to the shortest paths
            if (current.equals(word2)) {
                List<String> path = new ArrayList<>();
                path.add(current);
                while (!wordsToVisit.isEmpty()) {
                    path.add(0, wordsToVisit.poll());
                }
                shortestPaths.add(path);
                shortestDistance = path.size() - 1;
            }

            // Add the neighbors of the current word to the queue if they haven't been visited
            if (neighborMap.containsKey(current)) {
                for (String neighbor : neighborMap.get(current)) {
                    if (!visited.contains(neighbor)) {
                        wordsToVisit.add(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
        }

        // Filter out paths that are not the shortest distance
        int finalShortestDistance = shortestDistance;
        shortestPaths.removeIf(path -> path.size() - 1 > finalShortestDistance);

        return shortestPaths;
    }
}
