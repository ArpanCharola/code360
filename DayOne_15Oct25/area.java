//Code360 -> java basics problem
/* Find Area of Rectangle
* Problem statement
* Take the length(L) and breadth(B) of the rectangle as input and find its area.

* Note:
* Length and breadth must be an integer value and the area will always be in the range of integers.
*/

import java.util.Scanner;
public class area{
    public void areaFun(int l, int b){
        int ar = l * b;
        System.out.println(ar);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int length, breadth;
        length = sc.nextInt();
        breadth = sc.nextInt();
        area obj = new area();
        obj.areaFun(length, breadth);
        sc.close();
    }
}