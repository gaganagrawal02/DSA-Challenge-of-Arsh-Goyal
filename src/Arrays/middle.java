package Arrays;
import java.util.*;
public class middle {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public static   ListNode findMiddleNode(ListNode head) {
        if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Find and print the middle node
        ListNode middle = findMiddleNode(head);
        System.out.println("Middle node value: " + (middle != null ? middle.val : "List is empty"));

    }
}
