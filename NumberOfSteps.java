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
                a[i]-=b[i];
                steps++;
            }
            if(a[i]<min) {
                min=a[i];
                i=0;
            } else if(a[i]<0) {
                System.out.println(-1);
                return;
            } else {
                i++;
            }
        }
        System.out.println(steps);
    }



}