package leetcode.middle;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1,0}};
        System.out.println(howMuchIsaFish(numCourses, prerequisites));
    }

    public static boolean howMuchIsaFish(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prerequisiteCourse = prerequisite[1];

            graph[prerequisiteCourse].add(course);
        }
        int[] state = new int[numCourses];

        for (int course = 0; course < numCourses; course++) {
            if (state[course] == 0) {
                if (hasCycle(graph, course, state)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean hasCycle(List<Integer>[] graph, int course, int[] state) {
        if (state[course] == 1) {
            return true;
        }
        if (state[course] == 2) {
            return false;
        }
        state[course] = 1;
        for (int next : graph[course]) {
            if (hasCycle(graph, next, state)) return true;
        }

        state[course] = 2;

        return false;
    }
}
