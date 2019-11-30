import java.util.*;

public class Main_11_29_2 {
   static   class ListNode {
         int val;
         ListNode next = null;

         ListNode(int val) {
             this.val = val;
         }

       @Override
       public String toString() {
           return this.val+" ";
       }
   }
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        if(a ==null)
            return b;
        if(b == null)
            return a;
        ListNode res = new ListNode(-1);
        ListNode last = res;
        ListNode cur1 = a;
        ListNode cur2 = b;
        int carry= 0;
        while(cur1!=null ||cur2!=null){
            if(cur1!=null && cur2!=null){
                last.next = new ListNode((cur1.val+cur2.val+carry)%10);
                carry = (cur1.val+cur2.val+carry)/10;
                cur1 = cur1.next;
                cur2 = cur2.next;
                last = last.next;
            }else if(cur1 == null){
                last.next = new ListNode((cur2.val+carry)%10);
                carry = (cur2.val+carry)/10;
                cur2 = cur2.next;
                last = last.next;
            }else{
                last.next = new ListNode((cur1.val+carry)%10);
                carry = (cur1.val+carry)/10;
                cur1 = cur1.next;
                last = last.next;
            }

        }
        if(carry>0){
            last.next = new ListNode(carry);
            last = last.next;
        }
        return res.next;
    }
         public static void main(String[] args) {
            ListNode head = new ListNode(1);
            ListNode p = new ListNode(2);
            ListNode p1 = new ListNode(3);

            ListNode head1 = new ListNode(3);
            ListNode q1 = new ListNode(2);
            ListNode q2 = new ListNode(1);
            head.next = p;
            p.next = p1;
            p1.next = null;

            head1.next =q1;
            q1.next = q2;
            q1.next = null;
            Main_11_29_2 m = new Main_11_29_2();
            // System.out.println(m.plusAB(head,head1).toString());
             m.plusAB(head,head1);
         }
}
