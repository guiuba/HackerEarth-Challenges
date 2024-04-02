import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class SwapSum {
    public static void main(String[] args) {

        solution();
    }

    static void solution() {
        Scanner s = new Scanner(System.in);
        int tests = s.nextInt();
        int n = s.nextInt();
        int k = s.nextInt();
        int[] arrayA = new int[n];
        int[] arrayB = new int[n];
        for (int i = 0; i < n; i++) {
            arrayA[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arrayB[i] = s.nextInt();
        }

        for (int i = 0; i < k; i++) {

            int max = IntStream.of(arrayA).sum();
            Set<Integer> set = new HashSet<>();

            for (int j = 0; j < n; j++) {
                int[] arrayAux = arrayA;
                arrayAux[j] = arrayB[j];
                int temp = IntStream.of(arrayAux).sum();
                if (temp > max) {
                    set.add(j);
                    max = temp;
                }

            }
        }

    }
}

/*
Problem
You are given two arrays,
A and B of length N.
In one operation, you can swap
A[i] and B[i]. Find the maximum sum of A
after performing at most K operations.

Input format

The first line contains an integer T, denoting
the number of test cases.
The first line of each test case contains two integers,
N and K.
The second line of each test case contains N
space-separated integers, elements of array A.
The third line of each test case contains N
space-separated integers, elements of array B.
Output format

For each test case, print the maximum sum of A
after performing at most K operations in a new line.

Constraints
1 <= T <= 10
1 <= K <= N <= 100000
0 <= A[i], B[i] <= 1000

Sample Input
2
5 3
1 3 1 3 1
2 4 1 6 5
3 1
1 5 1
3 4 2

Sample Output
17
9
 */