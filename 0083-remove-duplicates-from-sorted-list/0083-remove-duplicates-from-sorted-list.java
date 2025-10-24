/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> set=new HashSet<>();
        ListNode tem=head;
        while(tem != null){
            set.add(tem.val);
            tem=tem.next;
        }
        List<Integer> li=new ArrayList<>();
        for(Integer x:set){
            li.add(x);
        }
        Collections.sort(li);
        ListNode dummy=new ListNode(0);
        head=dummy;
        for(Integer x:li){
            ListNode temp=new ListNode(x);
            dummy.next=temp;
            dummy=dummy.next;
        }
        head=head.next;
        return head;
    }
}