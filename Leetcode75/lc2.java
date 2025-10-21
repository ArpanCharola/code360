package Leetcode75;
import java.util.Scanner;

// GCD of strings
// problem link - https://leetcode.com/problems/greatest-common-divisor-of-strings/
class lc2{
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lc2 obj = new lc2(); // an object

        System.out.println("Enter two strings:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        // Call the instance method using the object
        String result = obj.gcdOfStrings(str1, str2);
        System.out.println("GCD of strings: " + result);

        sc.close();
    }
}