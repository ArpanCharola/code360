package Leetcode75;

import java.util.Scanner;

// Merge Strings Alternately
//https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
class lc1 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder output = new StringBuilder(); // better than string concatenation
        int w1c = 0, w2c = 0;

        // Loop until both words are fully used
        while (w1c < word1.length() || w2c < word2.length()) {
            if (w1c < word1.length()) {
                output.append(word1.charAt(w1c));
                w1c++;
            }
            if (w2c < word2.length()) {
                output.append(word2.charAt(w2c));
                w2c++;
            }
        }
        return output.toString();
    }
    public static void main(String[] args) {
        lc1 obj = new lc1();
        String  word1, word2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two words:");
        word1 = sc.nextLine();
        word2 = sc.nextLine();
        String output = obj.mergeAlternately(word1, word2);
        System.out.println(output);
        sc.close();
    }
}
