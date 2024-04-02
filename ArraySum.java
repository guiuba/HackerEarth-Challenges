import java.util.Arrays;
import java.util.Scanner;

import java.util.stream.LongStream;

public class ArraySum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arraySize = s.nextInt();
        long[] array = new long[arraySize];
        for(int i = 0; i < arraySize; i++) {
            array[i] = s.nextLong();
        }
        System.out.println(Arrays.toString(array));
        long result = LongStream.of(array).sum();
        System.out.println(result);
    }
}

/*
Problem
You are given an array A consisting of N integers.

Task

Print the sum of the elements in the array.

Note: Some of the integers may be quite large.

Input Format

The first line contains a single integer N denoting the size of the array.
The next line contains space-separated integers denoting the elements of the array.
Output format

Print a single value representing the sum of the elements in the array.

Constraints

1<=N<=10

 0<=a[i]<=10^10
 */