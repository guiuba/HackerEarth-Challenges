import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MaximizeMovieRatings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int[] nK = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[]ratings =  Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = nK[0];
        int k = nK[1];
        ratings = IntStream.of(ratings).sorted().toArray();

        for (int i = 0; i < k; i++) {
            if(ratings[i] < 0) {
                ratings[i] = -ratings[i];
            }
        }

        System.out.println(IntStream.of(ratings).sum());
    }
}

/*
A movie rating website is hacked to maximize
 the total rating of a particular show. The hacker
 decides to flip (negative becomes positive and vice versa)
 the sign of K ratings. He has to perform exactly K flips on N
 ratings stored in the database. The flips may or may not be optimal.
 He can also flip the sign of the same rating more than once.

Write a program to calculate the highest possible total rating of the show.

Input format
First line : Two space-separated integers, N and K
second line : N space-separated integers denoting the ratings

Output format
Print the highest possible rating.

Constraints




Entrada de amostra
4 2
-1 1 -1 1
Saída de amostra
4
Limite de tempo: 1
Limite de memoria: 256
Limite de fonte:
Explicação
We have 2 flips available,also 2 negative ratings. We flip them and arrive at total rating of (1+1+1+1)=4
 */
