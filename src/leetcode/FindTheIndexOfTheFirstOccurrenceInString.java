package leetcode;

public class FindTheIndexOfTheFirstOccurrenceInString {
    public static void main(String[] args) {
        String string = "leetcode";
        String find = "code";
        System.out.println(findFirst(string, find));
    }

    public static int findFirst(String string, String find) {
        StringBuilder sb = new StringBuilder(string);
        return sb.indexOf(find);
    }
}
