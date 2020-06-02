
public class delete_node_in_a_linked_list {
    public static void main(String[] args) {
        System.out.println("A simple way was node.val = node.next.val, node.next = node.next.next");
    }
}

//   Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Soln {
    public void deleteNode(ListNode node) {
        ListNode prev = new ListNode(1);
        while(node.next != null){
            prev = node;
            node.val = node.next.val;
            node = node.next;
        }
        prev.next = null;
    }
}