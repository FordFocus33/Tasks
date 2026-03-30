package leetcode.middle;

public class MaximizeDistanceToClosestPerson {
    /*
    Посчитать, какое место будет расположено дальше всего от ближайшего соседа в ряду кинотеатра.
     */
    public static void main(String[] args) {

        int[] seats = {1,0,0,0,1,0,1};
//        int[] seats = {0,0,0,1,0,1};
//        int[] seats = {1,0,1};
//        int[] seats = {1,0,0,0};
//        int[] seats = {0,1,0,1,0};
//        int[] seats = {0,1,0,0,0,0,0,0,0,1,1,0,1,1};
//        int[] seats = {1,0,0,1,0,0,0,1,1,1,0,0,0,0,0,1,0,0,0,0,0};

        System.out.println(calculate(seats));
    }

    public static int calculate(int[] seats) {
        int biggestCountFromBegin = 0;
        int biggestCountInside = 0;
        int biggestCountAtTheEnd = 0;
        int currentCount = 0;
        int start = -1;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                currentCount++;
                if (start == -1) start = i;
                if (i == seats.length - 1) {
                    biggestCountAtTheEnd = currentCount;
                }
            } else {
                if (start == 0) {
                    biggestCountFromBegin = currentCount;
                    currentCount = 0;
                    start = -1;
                } else {
                    biggestCountInside = Math.max(currentCount, biggestCountInside);
                    currentCount = 0;
                    start = -1;
                }
            }
        }

        int result = Math.max(biggestCountAtTheEnd, biggestCountFromBegin);
        int resultInside = (int) Math.ceil((double) biggestCountInside / 2.0);

        return Math.max(resultInside, result);
    }
}
