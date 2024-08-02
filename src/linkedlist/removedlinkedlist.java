package linkedlist;
import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class removedlinkedlist {

    public static ListNode removeElements(ListNode head, int val) {
        // First, handle the case where the head itself needs to be removed.
        while (head != null && head.val == val) {
            head = head.next;
        }

        // At this point, either the head is null, or head.val != val.
        // Now, remove nodes other than the head.
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                // Skip the next node.
                current.next = current.next.next;
            } else {
                // Move to the next node only if you don't delete anything.
                current = current.next;
            }
        }

        return head;
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode prev = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Step 3: Compare the first half and the reversed second half
        ListNode left = head;
        ListNode right = prev;

        while (right != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode pA = headA;
        ListNode pB = headB;

        // Traverse both lists. When one pointer reaches the end, redirect it to the head of the other list.
        // If the lists intersect, the pointers will meet at the intersection point.
        // If they do not intersect, both pointers will eventually become null at the same time.
        while (pA != pB) {
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }

        return pA;
    }
    public static void main(String[] args) {
        removedlinkedlist solution = new removedlinkedlist();
//        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
//        System.out.println(solution.isPalindrome(head1)); // Output: true

//        printList(result1);

//        Question 3

        ListNode intersect = new ListNode(8);
        intersect.next = new ListNode(4);
        intersect.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = intersect;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = intersect;


        ListNode result = solution.getIntersectionNode(headA, headB);
        System.out.println(result != null ? "Intersected at '" + result.val + "'" : "No intersection");

    }
}
