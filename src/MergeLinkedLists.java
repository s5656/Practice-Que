
public class MergeLinkedLists {
    public static ListNode mergeLinkedLists(ListNode l1, ListNode l2, ListNode l3) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify the logic
        ListNode current = dummy;

        while (l1 != null || l2 != null || l3 != null) {
            if (l1 != null) {
                current.next = l1;
                l1 = l1.next;
                current = current.next;
            }
            if (l2 != null) {
                current.next = l2;
                l2 = l2.next;
                current = current.next;
            }
            if (l3 != null) {
                current.next = l3;
                l3 = l3.next;
                current = current.next;
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Create the linked lists
        // l1: 1 -> 3 -> 5 -> 7 -> null
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(7);

        // l2: 2 -> 4 -> null
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);

        // l3: 6 -> 8 -> 9 -> null
        ListNode l3 = new ListNode(6);
        l3.next = new ListNode(8);
        l3.next.next = new ListNode(9);

        // Merge the linked lists
        ListNode merged = mergeLinkedLists(l1, l2, l3);

        // Traverse and print the merged linked list
        ListNode current = merged;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}