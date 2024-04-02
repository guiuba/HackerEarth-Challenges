import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookRatings {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt(); // Number of books

            List<Book> books = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int ki = scanner.nextInt(); // Number of stories in the ith book
                List<Integer> creativity = new ArrayList<>();

                for (int j = 0; j < ki; j++) {
                    int creativityVal = scanner.nextInt(); // Creativity of stories in the ith book
                    creativity.add(creativityVal);
                }

                books.add(new Book(ki, creativity));
            }

            int maxImpressions = calculateMaxImpressions(books);
            System.out.println(maxImpressions);
        }

        scanner.close();

    }
    private static int calculateMaxImpressions(List<Book> books) {
        int maxImpressions = 0;
        int maxCreativity = 0;

        for (Book book : books) {
            int impressions = 0;
            for (int creativity : book.creativity) {
                if (creativity > maxCreativity) {
                    maxCreativity = creativity;
                    impressions++;
                }
            }
            maxImpressions += impressions;
        }

        return maxImpressions;
    }
    static class Book {
        int totalStories;
        List<Integer> creativity;

        public Book(int totalStories, List<Integer> creativity) {
            this.totalStories = totalStories;
            this.creativity = creativity;
        }
    }
}
