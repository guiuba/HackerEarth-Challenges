import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZeroXor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = Integer.parseInt(scan.nextLine());
        int counter = 0;
        int result = scan.nextInt();
        for (int i = 1; i < len; i++) {
            int nextInt = scan.nextInt();
            result ^= nextInt;
            if (result == 0) counter++;

        }
        System.out.println(counter);
    }
}

/*
       Scanner scan = new Scanner(System.in);
        int len = Integer.parseInt(scan.nextLine());
        int counter = 0;
        int result = scan.nextInt();
        for (int i = 1; i < len; i++) {
            int nextInt = scan.nextInt();
            result ^= nextInt;
            if (result == 0) counter++;

        }
        System.out.println(counter);
 */

/*
Problem
A Zero Xor Subset is a non-empty subset having Xor of all the elements in it equal to 0.
Now you are given an array of N numbers.
You have to count the number of different Zero Xor Subsets of this array.

Input:
First line contains a number N
N is the length of the array.
Second line contains the N elements of the array.

Output:
Single number denoting the Count of Zero Xor Subsets of the given array.

Input Constraints:
1<=N<=40
1<=a[i]<=1018

Hint:

Meet in the middle
 */