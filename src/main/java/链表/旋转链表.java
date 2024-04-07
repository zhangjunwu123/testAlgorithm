package 链表;
/**
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 * 示例 1：
 * 输入：head = [1,2,3,4,5], k = 2
 * 输出：[4,5,1,2,3]
 *
 * 输入：head = [0,1,2], k = 4
 * 输出：[2,0,1]
 * */
public class 旋转链表 {


    public ListNode inverseListNode(ListNode root, int k){

    }

    static void inverse(ListNode root){
        ListNode prev = root;
        ListNode curr = root;
        while(root != null){
            prev =
            curr = root.next;
            curr.next = curr.next.next;
        }
    }
}
