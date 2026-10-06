package leetcode.middle;

import java.util.*;

public class NetworkDelayTime {
    public static void main(String[] args) {
        int[][] times = {{2,1,1,}, {2,3,1}, {3,4,1}};
        System.out.println(letsGetItStarted(times, 4, 2));
    }

    public static int letsGetItStarted(int[][] times, int n, int k) {
        List<int[]>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] time : times) {
            int from = time[0];
            int to = time[1];
            int weight = time[2];

            graph[from].add(new int[]{to, weight});
        }

        int[] distance = new int[n + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[k] = 0;

        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        queue.offer(new int[]{0, k});
        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            int currentDistance = current[0];
            int currentNode = current[1];
            if (currentDistance > distance[currentNode]) continue;

            for (int[] content : graph[currentNode]) {
                int nextNode = content[0];
                int weight = content[1];

                int newDistance = currentDistance + weight;
                if (newDistance < distance[nextNode]) {
                    distance[nextNode] = newDistance;
                }
                queue.offer(new int[]{newDistance, nextNode});
            }
        }
        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            totalSum = Math.max(distance[i], totalSum);
        }

        return totalSum;
    }

}
