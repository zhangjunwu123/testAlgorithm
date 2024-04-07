package 链表;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，
 * 评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 * 不允许修改 链表。
 * */
public class 环形链表返回入环节点 {

    /**
     * 方法1：使用Set来解决
     * */
    public ListNode getCircleNode1(ListNode head){
        if(head == null || head.next == null){
            return null;
        }
        ListNode curr = head;
        Set<ListNode> set = new HashSet<>();
        while(curr != null){
            if(!set.add(curr)){
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }

    /**
     * 方法2：使用双指针
     * */
    public ListNode getCircleNode2(ListNode head){
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            if(fast.next == null || fast == null){
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
