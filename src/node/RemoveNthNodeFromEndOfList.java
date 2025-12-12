package node;

/**
 * Нужно удалить n-ный элемент массива с конца
 */
public class RemoveNthNodeFromEndOfList {

    /**
     * Моя реализация, без ноды. Как только а выйдет за пределы массива, сохраняем значение.
     * i - это элемент, который нужно удалить из списка.
     */
    public static void myVoid() {
        int a = 2;
        int[] mas = {1,2,3,4,5};

        int result = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas.length == a) {
                result = i;
                break;
            }
            a++;
        }
        mas[result] = 0;
        for (int i : mas) {
            System.out.println(i);
        }
    }

    /**
     * dummy, first & second ссылаются на одну и ту же ссылку (можно проверить, если отключить туСтринг у класса ноды).
     * После преобразований в first & second, получаем готовую ноду. Мы просто переписываем соседа, в данном примере
     * после 3 идет 4, но мы переписали, что у 3 потом идет 5. 4 никуда не пропала, просто пропала связь между 3 и 4.
     * @param head
     * @param n
     * @return
     */
    public static ListNode solution(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
//      myVoid();

        ListNode listNode5 = new ListNode(5);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode = new ListNode(1,  listNode2);
        System.out.println(solution(listNode, 2));
    }
}
