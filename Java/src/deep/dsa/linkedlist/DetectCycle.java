package deep.dsa.linkedlist;

public class DetectCycle {
    static class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next=null;
        }
    }
    Node head;

    public static boolean isCycle(DetectCycle ll){
        Node slow=ll.head,fast=ll.head;
        while (fast != null && fast.next != null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        DetectCycle ll=new DetectCycle();

        ll.head=new Node(1);
        Node one= new Node(2);
        Node two=new Node(3);
        Node three =new Node(4);
        ll.head.next=one;
        one.next=two;
        two.next=three;
        three.next=ll.head;

        System.out.println(DetectCycle.isCycle(ll));




    }
}
