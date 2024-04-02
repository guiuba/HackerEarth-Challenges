import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class FoodRating {
    public static void main(String[] args) {
        int[][] ratings = {{123, 5}, {512, 2}, {123, 3}, {412, 4}, {670, 1}, {345, 4}, {412, 3}};
        System.out.println(solution(3, ratings));

    }
    static int solution(int quant, int[][] ratings) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = Integer.MAX_VALUE;
        int maxGrade = 0;
        for (int[] rating : ratings) {
            int type = rating[0];
            int grade = rating[1];
            if (!map.containsKey(type)) {
                map.put(type, grade);
            } else {
                int lastGrade = map.get(type);
                map.replace(type, lastGrade, (lastGrade + grade) / 2);
            }

        }
        for (var entry : map.entrySet()) {
            if (entry.getValue() > maxGrade) {
                if (entry.getKey() < result) {
                    result = entry.getKey();
                }
            }
        }
        return result;
    }
}

/*
BDTest : return the food type with max AVERAGE ratings grade.
If there is a tie return the one with smaller food type ID
 */