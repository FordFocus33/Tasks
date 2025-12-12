package node;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode listNode3 = new ListNode(3);
        ListNode listNode2 = new ListNode(4, listNode3);
        ListNode listNode = new ListNode(2,  listNode2);

        ListNode listNodeV3 = new ListNode(4);
        ListNode listNodeV2 = new ListNode(6, listNodeV3);
        ListNode listNodeV = new ListNode(5,  listNodeV2);
        System.out.println(naruto(listNode, listNodeV));
    }

    public static ListNode naruto(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        // Initialize carry for addition overflow
        int carry = 0;
        // Pointer to track current position in result list
        ListNode current = dummyHead;
        // Continue while there are digits to process or carry exists
        while (l1 != null || l2 != null || carry != 0) {
            // Get current digit values (0 if node is null)
            int digit1 = (l1 == null) ? 0 : l1.val;
            int digit2 = (l2 == null) ? 0 : l2.val;
            // Calculate sum of current digits plus carry
            int sum = digit1 + digit2 + carry;
            // Update carry for next iteration (integer division)
            carry = sum / 10;
            // Create new node with the current digit (remainder after division by 10)
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        // Return the actual head of result list (skip dummy head)
        return dummyHead.next;
    }
}
