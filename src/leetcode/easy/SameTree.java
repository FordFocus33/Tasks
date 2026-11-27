package leetcode.easy;

public class SameTree {
    public static void main(String[] args) {
        TreeNode first = new TreeNode(1, null, new TreeNode(3));
        TreeNode second = new TreeNode(1);
        second.left = null;
        second.right = new TreeNode(3);
        System.out.println(isSame(first, second));
    }

    public static boolean isSame(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.val != b.val) return false;

        return isSame(a.left, b.left) && isSame(a.right, b.right);
    }




    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}

