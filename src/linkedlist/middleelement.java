//package linkedlist;
//import java.util.*;
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
//public class middleelement {
//    public ListNode middleNode(ListNode head) {
//        if (head == null) return null;
//
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        return slow;
//    }
//    public static void printList(ListNode head) {
//        ListNode current = head;
//        while (current != null) {
//            System.out.print(current.val + " ");
//            current = current.next;
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        middleelement solution = new middleelement();
//
//
//    }
//}
