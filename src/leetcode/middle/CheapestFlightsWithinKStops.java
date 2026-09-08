package leetcode.middle;

import java.util.Arrays;

public class CheapestFlightsWithinKStops {
    public static void main(String[] args) {
        int n = 5;
        int[][] flight = {{0,1,100}, {1,2,100}, {2,0,100}, {1,3,600}, {2,3,200}};
        int src = 0;
        int dst = 3;
        int k = 1;

        System.out.println(cookingInAKitchen(n, flight, src, dst, k));
    }

    public static int cookingInAKitchen(int n, int[][] flights, int src, int dst, int k) {
        int MAX = Integer.MAX_VALUE;
        int[] distance = new int[n];
        Arrays.fill(distance, MAX);
        distance[src] = 0;

        for (int i = 0; i < k + 1; i++) {
            int[] copyDistance = Arrays.copyOf(distance, n);
            for (int[] flight : flights) {
                int from = flight[0];
                int to = flight[1];
                int price = flight[2];

                if (distance[from] == MAX) continue;
                int newPrice = distance[from] + price;
                if (newPrice < copyDistance[to]) {
                    copyDistance[to] = newPrice;
                }
            }
            distance = copyDistance;
        }
        return distance[dst] == MAX ? -1 : distance[dst];
    }
}
