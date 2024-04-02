import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(factorIt(Integer.parseInt(br.readLine())));
    }
    static int factorIt(int toFactor) {
        if (toFactor == 1) return 1;
        return toFactor * factorIt(toFactor - 1);
    }
}
