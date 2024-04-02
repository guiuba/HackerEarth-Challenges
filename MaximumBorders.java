import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumBorders {
    public static void main(String[] args) {

        solution();
    }

    static void solution() {
        Scanner s = new Scanner(System.in);
        int tests = s.nextInt();
        List<Integer> results = new ArrayList<>();
        // char[][] currentArray;
        List<String> currentArray;

        for (int i = 0; i < tests; i++) {
            int maxBorderInRows = 0;
            int maxBorderInCols = 0;
            int rows = s.nextInt();
            int cols = s.nextInt();
            s.nextLine();
            currentArray = new ArrayList<>();
            for (int j = 0; j < rows; j++) {
                currentArray.add(s.nextLine());
            }
            //counting adjacent #s in rows
            for (int l = 0; l < rows; l++) {
                if (currentArray.get(l).contains("#")) {
                    int first = currentArray.get(l).indexOf("#");
                    int last = currentArray.get(l).lastIndexOf("#");
                    String subCurrentArray = currentArray.get(l)
                            .substring(first, last + 1);
                    if (!subCurrentArray.contains(".")) {
                        int border = last - first + 1;
                        if (border > maxBorderInRows) {
                            maxBorderInRows = border;
                        }
                    }
                }
            }
            //counting adjacent #s in cols
            for (int m = 0; m < cols; m++) {
                StringBuilder sb = new StringBuilder();
                for (int n = 0; n < rows; n++) {
                    sb.append(currentArray.get(n).charAt(m));
                }
                if (sb.toString().contains("#")) {
                    int first = sb.toString().indexOf("#");
                    int last = sb.toString().lastIndexOf("#");
                    String subCurrentArray = sb.toString()
                            .substring(first, last + 1);
                    if (!subCurrentArray.contains(".")) {
                        int border = last - first + 1;
                        if (border > maxBorderInCols) {
                            maxBorderInCols = border;
                        }
                    }
                }
            }

            //   currentArray.forEach(System.out::println);

            System.out.println(maxBorderInRows > maxBorderInCols ? maxBorderInRows : maxBorderInCols);
        }

    }


}

/*
Problem
You are given a table with
 rows and
 columns. Each cell is colored with white or black. Considering the shapes created by black cells,
 what is the maximum border of these shapes? Border of a shape means the maximum number of consecutive
 black cells in any row or column without any white cell in between.

A shape is a set of connected cells. Two cells are connected if they share an edge. Note that no shape
has a hole in it.

Input format

The first line contains
 denoting the number of test cases.
The first line of each test case contains integers
 denoting the number of rows and columns of the matrix. Here, '#' represents a black cell and '.'
 represents a white cell.
Each of the next
 lines contains
 integers.
Output format

Print the maximum border of the shapes.
 */
