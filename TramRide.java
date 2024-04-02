import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TramRide {
    public static void main(String[] args) {
        int n = 4;
        int start = 1;
        int finish = 4;
        int[] ticket_cost = {1, 2, 2, 4};

   /*     int start = 4;
        int finish = 3;
        int[] ticket_cost = {12, 6, 2, 6, 2};*/
        System.out.println(solve(n, start, finish, ticket_cost));

    }

    static long solve(int N, int start, int finish, int[] Ticket_cost){
        // Write your code here
        long result = 0;
        if(finish < start) {
            int temp = start;
            start = finish;
            finish = temp;
        }
        long sumCosts = Arrays.stream(Ticket_cost).sum();
        long cost = 0;
        for (int i = start - 1; i < finish - 1; i++) {
            cost += Ticket_cost[i];
        }
        if ((sumCosts - cost) < cost) {
            cost = sumCosts - cost;
        }
        return cost;

    //    System.out.println();

     /*
       int clock = 0;
        int antiClock = 0;

        return result;
     //  if(finish > start) {

       *//* } else *//*if (finish < start) {
            Collections.reverse(new ArrayList<>(List.of(Ticket_cost)));
        }
        clock = IntStream.of(Ticket_cost).skip(start - 1).limit(finish - start).sum();
        antiClock = IntStream.of(Ticket_cost).skip(finish - 1).sum() + IntStream.of(Ticket_cost).limit(start - 1).sum() ;


       //
    //    int antiClock = IntStream.of(Ticket_cost).skip(start - 1).limit(finish - start).sum();


        return  clock < antiClock ? clock : antiClock;*/

    }
}

/*
Problem
A city has N Tram stations numbered from 1 to N  that are connected to one another and form a circle.
You are given an array ticket_cost  where ticket_cost[i] is the cost of a ticket between the stops number
i and (i + 1) % N. The Tram can travel in both directions i.e. clockwise and anti-clockwise.

Return the minimum cost to travel between the given start and finish station.

You are given an integer N where N represents the total number of the tram stations, an integer start which
represents the start station, and an integer finish which represents the finish station. You are given an
array of positive integers  ticket_cost where ticket_cost[i] represents the ticket cost between the station
number i and (i + 1) % N.

Task

Determine the minimum cost to travel between the given start and finish station.

Example

Assumptions

N = 4
start = 1
finish = 4
ticket_cost = [1, 2, 2, 4 ]
Approach

path1 -> 1------1-----> 2 -------2------> 3 -------2------> 4 . => 1+2+2 => 5

path2 -> 1------4------>4 . => 4

Path2 will give the minimum cost. Therefore return 4.

Function description

Complete the Solve() function provided in the editor below that takes the following arguments and finds the
minimum cost to travel between the given start and finish station:

N: Represents the total number of tram stations
start: Represents the start station
finish: Represents the finish station
ticket_cost: Represents ticket_cost[i] denoting the ticket-cost between the station number i and (i + 1) %N
Input format

The first line contains an integer N denoting the total number of tram stations.
The second line contains an integer start denoting the start station.
The third line contains an integer finish denoting the finish station.
The fourth line contains an N space-separated integer array ticket_cost, ticket_cost[i] represents the
ticket-cost between the station number i and (i + 1) %N.
Output format

Return the minimum cost to travel between the given start and finish station.
 */