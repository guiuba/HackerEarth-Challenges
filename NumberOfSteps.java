import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class NumberOfSteps {
    public static void main(String[] args) {
        solution();
    }

    static void solution() {
        Scanner s = new Scanner(System.in);

        int steps = 0;
        int len = Integer.parseInt(s.nextLine());
        int[] a = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = IntStream.of(a).min().getAsInt();
        int i = 0;
        while (i < len) {
            while (a[i] > min) {
                a[i] -= b[i];
                steps++;
            }
            if (a[i] < min) {
                min = a[i];
                i = 0;
            } else if (a[i] < 0) {
                System.out.println(-1);
                return;
            } else {
                i++;
            }
        }
        System.out.println(steps);
    }
}

/*
Problem
You are given two arrays a1, a2...,an
and b1, b2...,bn. In each step, you can set
 ai = ai - bi  if ai > bi. Determine the minimum number
 of steps that are required to make a's all
equal.

Input format

First line: n

Second line: a1, a2...,an
Third line:  b1, b2...,bn
Output format

Print the minimum number of steps that are required to make all
a's equal. If it is not possible, then print -1.

Constraints
0 <= n, ai, bi <= 500

Sample input
25 64 3

Sample output
-1

Sample input
5
5 7 10 5 15
2 2 1 3 5

Sample output
8
 */