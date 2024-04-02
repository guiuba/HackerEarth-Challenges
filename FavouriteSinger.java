import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FavouriteSinger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long songs = s.nextLong();
        long max = 0;
        long favouriteSingers = 0;
        Map<Long, Long> map = new HashMap<>();
        for (long i = 0; i < songs; i++) {
            long singer = s.nextLong();
            if(!map.containsKey(singer)) {
                map.put(singer, 1L);
            } else {
                map.put(singer, map.get(singer) + 1L);
            }
        }

        for (var entry : map.entrySet()) {
            if (entry.getValue() >= max) {
                max = entry.getValue();
            }
        }
        for (var entry : map.entrySet()) {
            if (entry.getValue() == max) {
                favouriteSingers++;
            }
        }
        System.out.println(favouriteSingers);
    }

}

/*
Problem
Bob has a playlist of
 songs, each song has a singer associated with it (denoted by an integer)

Favourite singer of Bob is the one whose songs are the most on the playlist

Count the number of Favourite Singers of Bob

Input Format

The first line contains an integer
, denoting the number of songs in Bob's playlist.

The following input contains
 integers,
 integer denoting the singer of the
 song.

Output Format

Output a single integer, the number of favourite singers of Bob

Note: Use 64 bit data type

Constraints


Sample Input
5
1 1 2 2 4
Sample Output
2
Time Limit: 1
Memory Limit: 256
Source Limit:
Explanation
In this example
Songs of singer 1 and 2 appear 2 times(which is max) in this playlist
Therefore the answer is 2
 */