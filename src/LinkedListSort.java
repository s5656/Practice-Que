
public class LinkedListSort {

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Base case: empty list or single-node list is already sorted
        }

        // Find the middle of the list
        ListNode middle = findMiddle(head);
        ListNode nextOfMiddle = middle.next;

        // Split the list into two halves
        middle.next = null;

        // Recursively sort the two halves
        ListNode left = sortList(head);
        ListNode right = sortList(nextOfMiddle);

        // Merge the sorted halves
        return merge(left, right);
    }

    private static ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private static ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (left != null && right != null) {
            if (left.val >= right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if (left != null) {
            current.next = left;
        }

        if (right != null) {
            current.next = right;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 4 -> 2 -> 1 -> 3
        ListNode head = new ListNode(4);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        ListNode sortedList = sortList(head);

        // Print the sorted linked list
        while (sortedList != null) {
            System.out.print(sortedList.val + " ");
            sortedList = sortedList.next;
        }
    }
}
//import java.util.Collections;
//        import java.util.Comparator;
//        import java.util.LinkedList;
//
//public class LinkedListSort {
//
//    public static void main(String[] args) {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(4);
//        linkedList.add(2);
//        linkedList.add(1);
//        linkedList.add(3);
//
//        // Create a custom comparator to sort in reverse order
//        Comparator<Integer> reverseComparator = Collections.reverseOrder();
//        Collections.sort(linkedList, reverseComparator);
//
//        System.out.println(linkedList);
//    }
//}
