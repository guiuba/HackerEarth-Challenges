import java.util.*;

public class SumitAndRohil {
    public static void main(String[] args) {

        SumitAndRohil sr = new SumitAndRohil();
        System.out.println(sr.checkInput(sr.readInput()));

    }


    int checkInput(List<String> input) {
        Set<name> names = new HashSet<>();
        for (String name : input) {
            names.add(new name(name));
        }
        return names.size();
    }

    class name {
        int len;
        char firstChar;
        char lastChar;
        Map<Character, Integer> charMap;

        name(String name) {
            this.len = name.length();
            this.firstChar = name.charAt(0);
            this.lastChar = name.charAt(this.len - 1);
            this.charMap = mapNameChars(name);
        }

        Map<Character, Integer> mapNameChars(String name) {
            Map<Character, Integer> mappedNameChars = new HashMap<>();
            for (char c : name.toCharArray()) {
                mappedNameChars.merge(c, 1, Integer::sum);
            }
            return mappedNameChars;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            name name = (name) o;
            return len == name.len && firstChar == name.firstChar && lastChar == name.lastChar && Objects.equals(charMap, name.charMap);
        }

        @Override
        public int hashCode() {
            return Objects.hash(len, firstChar, lastChar, charMap);
        }
    }

    List<String> readInput() {
        List<String> input = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < size; i++) {
            input.add(scan.nextLine());
        }
        return input;
    }
}

/*
It's a fine sunny afternoon today in California. Looking at the pleasant weather, Sumit is all ready to go out and play with his friend Rohil. Unfortunately, Rohil is down with fever. Seeing that his friend is ill, Sumit decides not to go out - instead play with Rohil inside the house. Sumit loves math, on the contrary Rohil loves strings. Sumit decides to play a game that involves more of strings and less of Maths so that Rohil could be at ease and have fun playing it.

The game is simple and is played on a piece of paper. Sumit writes down a long list of names on that paper and passes it to Rohil. Rohil gets confused on seeing so many names on that paper and asks Sumit about the game. So, Sumit explains him the rules of the game. Rohil is supposed to partition the names into groups, such that:

Each name belongs to exactly one group.
Names that belong to the same group are pairwise anagrams.
The first character of all the names in the same group are equal.
The last character of all the names in the same group are equal.
The number of groups is minimum possible.
Note: Two strings are called anagrams if it's possible to form one string from the other by changing the order of its characters.

Rohil would have won the game easily, if he would have been fit and fine but since he is ill right now he needs your help in winning the game. So, help out Rohil and do give him your blessings.

Input:
The first line contains a single integer N indicating the size of the list. This is followed by N lines where each line contains a name listed by Sumit.

Output:
In a single line print minimum number of groups in a partition that satisfy above conditions

Constraints:
1<= N <=100
1 <= Length of a name <= 100

All names will consist of lowercase English alphabets(a-z).
Sample Input
6
vinay
vainy
vinit
viint
avinash
aasivnh
Sample Output
3

 */