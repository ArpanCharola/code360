/* Code 360 Codingninjas - Print name and age -
* Problem statement
* Take the person's name and age as input and print out the name and age as specified
* in the output format. */

import java.util.Scanner;
class nameAge{
    public void nameAgeFun(String n, int a){
        System.out.println("The name of the person is " + n + " and the age is " + a + ".");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc. nextInt();
        nameAge obj = new nameAge();
        obj.nameAgeFun(name, age);
        sc.close();
    }
}