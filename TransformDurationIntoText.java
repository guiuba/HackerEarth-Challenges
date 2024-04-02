import java.util.ArrayList;
import java.util.List;

public class TransformDurationIntoText {
    public static void main(String[] args) {

        System.out.println(secondsToString(3762)); //tDT.solution(86399)


    }
    /**
     * Factors for converting seconds in minutes, minutes in hours, etc.
     */
    private static final int[] FACTORS = new int[] {
            60, 60, 24, 7
    };

    /**
     * Names of each time unit.
     * The length of this array needs to be FACTORS.length + 1.
     * The last one is the name of the remainder after
     * obtaining each component.
     */
    private static final String[] NAMES = new String[] {
            "second", "minute", "hour", "day", "week"
    };

    /**
     * Checks if quantity is 1 in order to use or not the plural.
     */
    private static String quantityToString(int quantity, String name) {
        if (quantity == 1) {
            return String.format("%d %s", quantity, name);
        }
        return String.format("%d %ss", quantity, name);
    }

    /**
     * The seconds to String method.
     */
    private static String secondsToString(int seconds) {
        if (seconds == 0) return "Now";
        List<String> components = new ArrayList<>();

        /**
         * Obtains each component and stores only if is not 0.
         */
        for (int i = 0; i < FACTORS.length; i++) {
            int component = seconds % FACTORS[i];
            seconds /= FACTORS[i];
            if (component != 0) {
                components.add(quantityToString(component, NAMES[i]));
            }
        }

        /**
         * The remainder is the last component.
         */
        if (seconds != 0) {
            components.add(quantityToString(seconds, NAMES[FACTORS.length]));
        }

        /**
         * We have the non-0 components in reversed order.
         * This could be extracted to another method.
         */
        StringBuilder builder = new StringBuilder();
        for (int i = components.size() - 1; i >= 0; i--) {
            if (i == 0 && components.size() > 1) {
                builder.append(" and ");
            } else if (builder.length() > 0) {
                builder.append(", ");
            }
            builder.append(components.get(i));
        }

        return builder.toString();
    }

}



